
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
    //Criptografa a senha antes de envia-la para o banco de dados
    private final PasswordEncoder encoder;

    public UsuarioController(UserRepository repository, PasswordEncoder encoder) {
        this.repository = repository;
        this.encoder = encoder;
    }
    //Método padrão de API REST
    @GetMapping("/listarTodos")
    public ResponseEntity<List<Modelo>> listarTodos() {
        /* Capta a instância recebida do
        usuário para criptgrafar a senha */
        List<Modelo> usuarios = repository.findAll();
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping("/salvar")
    /* Será introduzido um arquivo JSON
    de entrada e o mesmo será convertido
    como objeto.
    */
    public ResponseEntity<Modelo> salvar(@RequestBody Modelo usuario) {
        usuario.setPassword(encoder.encode(usuario.getPassword()));
        return ResponseEntity.ok(repository.save(usuario));
    }
    // Verificar o usuário
    // Verificar se a senha é válida
    @GetMapping("/validarSenha")
    public ResponseEntity<Boolean> validarSenha(@RequestParam String login, //
                                                @RequestParam String password) {

    Optional<Modelo> optUsuario = repository.findByLogin(login);
    if (optUsuario.isEmpty()) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
    }

    /* Verificar se a senha informada
    igual a do banco de dados */
    Modelo usuario = optUsuario.get();
    // Se o usuário ou senha forem válidos
    boolean valid = encoder.matches(password, usuario.getPassword());
    // Se o usuário ou senha forem inválidos
    HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
        return ResponseEntity.status(status).body(valid);



    }

}