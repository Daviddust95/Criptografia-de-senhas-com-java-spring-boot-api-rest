package criptografia.senhas.CriptografiaDeSenhas.repository;

import criptografia.senhas.CriptografiaDeSenhas.UsuarioModelo.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<Modelo, Integer> {

    public Optional<Modelo> findByLogin(String login);
}
