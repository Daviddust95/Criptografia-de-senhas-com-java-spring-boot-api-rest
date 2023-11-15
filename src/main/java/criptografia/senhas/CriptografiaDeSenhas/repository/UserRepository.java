package criptografia.senhas.CriptografiaDeSenhas.repository;

import criptografia.senhas.CriptografiaDeSenhas.UsuarioModelo.Modelo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


/*Explicando qual o  meu modelo de dados
e qual o tipo  do meu id*/

public interface UserRepository extends JpaRepository<Modelo, Integer> {
/*Fazer a busca do usuário no banco
de dados utilizando o campo login */
    public Optional<Modelo> findByLogin(String login);
}
