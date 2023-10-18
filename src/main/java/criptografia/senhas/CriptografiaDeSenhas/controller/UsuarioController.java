package criptografia.senhas.CriptografiaDeSenhas.controller;

import criptografia.senhas.CriptografiaDeSenhas.UsuarioModelo.Modelo;
import criptografia.senhas.CriptografiaDeSenhas.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return ResponseEntity.ok(repository.findAll());
    }
}
