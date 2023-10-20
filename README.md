# Criptografia de senhas com java e spring boot | API REST


<justify>
A aplicação fornece um método para garantir a segurança das credenciais dos usuários por meio de criptografia
da senha, e armazenando todos os dados no banco de dados PostgreSQL, com a ajuda do Spring Data JPA e 
Spring Security.
</justify>

## Conteúdo

1. [Sobre](#sobre)
2. [Tecnologias Utilizadas](#tecnologias-utilizadas)
3. [Requisitos](#requisitos)
4. [Instalação](#instalação)
5. [Como Usar](#como-usar)
6. [Contato](#contato)

## Sobre
<justify>
Este é um projeto Java que fornece uma solução para garantir a segurança das credenciais dos usuários por meio da criptografia de senhas e armazenamento dos dados no banco de dados PostgreSQL.
<justify>

## Tecnologias Utilizadas

- Java
- PostgreSQL
- Spring Data JPA
- Spring Security
- Postman

## Requisitos

   - Java
   - PostgreSQL
   - Spring Boot
   - Postman

## Instalação

1. Clone o Repositório:
   ```bash
   
   git clone https://github.com/Daviddust95/Criptografia-de-senhas-com-java-spring-boot-api-rest.git

 ## Como Usar
 
1. **Instalar todas as bibliotecas internas dentro do projeto (caso use o IntelliJ é possível fazer isso apenas selecionando o Maven > Reload Maven Project)**

2. Inicializar o PostgreSQL e a ferramenta Postman.

3. Inicializar a aplicação java utilizando o método main.

4. Criar usuários dentro do PostgreSQL para testar a aplicação.

5. Vamos usar o postman para criar solicitações do tipo get e, adicionar parâmetros do tipo login e password.

6. Em cada solciitação no Postman, deverá ser utilizado arquivos do tipo raw e json.

7. Como o programa roda na porta 8080 usaremos a seguinte URL para acessar a rota do mesmo http://localhost:8080/api/usuario/validarSenha + usuario + senha

8.  Enviar a solicitação.

9.  Após a solicitação ser enviada, o programa irá parar, então, clicamos no campo login, e apertamos a tecla f8 para seguir para o próximo campo.

10.  Após isso, clicamos no campo login, e a senha do usuário deverá aparecer encriptada com o padrão hash, não esqueça de copiar a chave criptografada.

11.  Voltamos ao banco de dados, em tools > query tools e executamos a query: select from usuario.

12.  Após isso, podemos ter certeza que a senha do usuário foi de fato criptograda pela aplicação.

13.  Se retornarmos ao Postman e realizar uma nova solicitação get na url http://localhost:8080/api/usuario/listarTodos, a resposta retornará a senha do usuário de fato criptografada.

## Contato
Se você tiver alguma dúvida, comentário ou feedback, sinta-se à vontade para entrar em contato:

- **Email:** alissondaviddev@gmail.com
- **LinkedIn:** [alisson-melo95](https://www.linkedin.com/in/alisson-melo95/) 
- **Site Pessoal:** [Portifólio](https://alissondev.tech)
- **GitHub:** [@Daviddust95](https://github.com/Daviddust95)
