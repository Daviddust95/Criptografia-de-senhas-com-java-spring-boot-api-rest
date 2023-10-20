package criptografia.senhas.CriptografiaDeSenhas.controller;

import criptografia.senhas.CriptografiaDeSenhas.UsuarioModelo.Modelo;
import criptografia.senhas.CriptografiaDeSenhas.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    private final UserRepository repository;
    private final PasswordEncoder encoder;

    public UsuarioController(UserRepository repository, PasswordEncoder encoder) {
        this.repository = repository;
        this.encoder = encoder;
    }

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
}
