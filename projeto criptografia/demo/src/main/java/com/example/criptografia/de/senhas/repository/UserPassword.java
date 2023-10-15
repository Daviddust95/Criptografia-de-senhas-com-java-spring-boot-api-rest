package com.example.criptografia.de.senhas.repository;

import com.example.criptografia.de.senhas.PrimeiroUsuario.PrimeiroUsuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserPassword extends JpaRepository<PrimeiroUsuario, Integer> {

    public Optional<PrimeiroUsuario> findBylogin(String login);

}
