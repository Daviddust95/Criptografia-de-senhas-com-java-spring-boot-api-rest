package criptografia.senhas.CriptografiaDeSenhas.controller;

import criptografia.senhas.CriptografiaDeSenhas.UsuarioModelo.Modelo;
import criptografia.senhas.CriptografiaDeSenhas.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
    private final UserRepository repository;

    public UsuarioController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/listarTodos")
    public ResponseEntity<List<Modelo>> listarTodos() {
        List<Modelo> usuarios = repository.findAll();
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping("/salvar")
    public ResponseEntity<Modelo> salvar(@RequestBody Modelo usuario) {
        Modelo savedUsuario = repository.save(usuario);
        return ResponseEntity.ok(savedUsuario);
    }
}
