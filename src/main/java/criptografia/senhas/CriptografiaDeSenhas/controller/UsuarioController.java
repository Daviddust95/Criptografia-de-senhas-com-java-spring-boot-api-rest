
//Criação do controller para teste do aplicativo

/* Precisamos de controllers para manipular as
requisições HTTP e direcionar o fluxo da
aplicação.*/
package criptografia.senhas.CriptografiaDeSenhas.controller;

import criptografia.senhas.CriptografiaDeSenhas.UsuarioModelo.Modelo;
import criptografia.senhas.CriptografiaDeSenhas.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
//Dentro do controller  temos as nossas API's rests

//Fornecemos um caminho padrão para esse controller
@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

//Inserção de dependências

    private final UserRepository repository;
    private final PasswordEncoder encoder;

    public UsuarioController(UserRepository repository, PasswordEncoder encoder) {
        this.repository = repository;
        this.encoder = encoder;
    }
    //Método padrão de API REST
    @GetMapping("/listarTodos")
    public ResponseEntity<List<Modelo>> listarTodos() {
        List<Modelo> usuarios = repository.findAll();
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping("/salvar")
    public ResponseEntity<Modelo> salvar(@RequestBody Modelo usuario) {
        usuario.setPassword(encoder.encode(usuario.getPassword()));
        return ResponseEntity.ok(repository.save(usuario));
    }
    @GetMapping("/validarSenha")
    public ResponseEntity<Boolean> validarSenha(@RequestParam String login,
                                                @RequestParam String password) {

    Optional<Modelo> optUsuario = repository.findByLogin(login);
    if (optUsuario.isEmpty()) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
    }


    Modelo usuario = optUsuario.get();
    boolean valid = encoder.matches(password, usuario.getPassword());

    HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
        return ResponseEntity.status(status).body(valid);



    }

}