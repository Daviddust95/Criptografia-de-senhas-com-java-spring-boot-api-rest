package criptografia.senhas.CriptografiaDeSenhas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/*Não executar essa classe para não precisar validar
usuário e senha toda vez ao iniciar a aplicação.*/
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class CriptografiaDeSenhasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CriptografiaDeSenhasApplication.class, args);
	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}

}
