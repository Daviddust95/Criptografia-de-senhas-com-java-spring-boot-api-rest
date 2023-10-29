# Criptografia de senhas com java e spring boot | API REST

## Capturas de Tela

![Captura de tela 2023-10-22 165221](https://github.com/Daviddust95/Criptografia-de-senhas-com-java-spring-boot-api-rest/assets/124353154/7284152a-0035-496a-a759-8bcf466478da)


https://github.com/Daviddust95/Criptografia-de-senhas-com-java-spring-boot-api-rest/assets/124353154/a4255843-5984-45a5-b1fa-956e1c8d0604

https://github.com/Daviddust95/Criptografia-de-senhas-com-java-spring-boot-api-rest/assets/124353154/8bf38329-c847-40a3-8a16-6888c447d180

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

- JAVA
- POSTGRESQL
- SPRING DATA JPA
- SPRING SECURITY
- POSTMAN

## Requisitos

   - JAVA JDK
   - POSTGRESQL
   - SPRING BOOT
   - POSTMAN

## Instalação

1. Clone o Repositório:
   ```bash
   git clone https://github.com/Daviddust95/Criptografia-de-senhas-com-java-spring-boot-api-rest.git
 ## Como Usar
 
1. **Instalar todas as bibliotecas internas dentro do projeto (caso use o IntelliJ é possível fazer isso apenas selecionando o Maven > Reload all Maven Project)**

2. Inicializar o PostgreSQL e a ferramenta POSTMAN.

3. Inicializar o controller da aplicação em modo run (não em modo debug).

4. Criar um break point na seguinte linha do controller : usuario.setPassword(encoder.encode(usuario.getPassword()));

5. Para criar usuários dentro do banco de dados, vamos enviar solicitações dentro do POSTMAN, na seguinte URL:
- ```bash
   http://localhost:8080/api/usuario/salvar
6. Dentro da solicitação do tipo POST, deverá conter as seguintes caracteristicas, do tipo raw e json:
![Captura de tela 2023-10-28 234953](https://github.com/Daviddust95/Criptografia-de-senhas-com-java-spring-boot-api-rest/assets/124353154/620f8359-5a3e-4bb8-928b-660346c8b5e0)
- ```bash
  { "id": "",
  "login": "InformeoLoginAqui",
  "password": "InformeaSenhaAqui"
   }
7. Agora, nessa etapa, vamos validar ou não a autenticação dos logins e usuários, baseando-se se a informação enviada está correta ou não.

8. Vamos usar o POSTMAN para criar solicitações do tipo get, e vamos adicionar parâmetros do tipo login e password.
![Captura de tela 2023-10-28 234523](https://github.com/Daviddust95/Criptografia-de-senhas-com-java-spring-boot-api-rest/assets/124353154/18f4a2f0-9d72-47f0-aa60-6ababd020f8a)

9. Em cada solicitação no POSTMAN, deverá ser utilizado arquivos do tipo raw e json.

10. Como o programa roda na porta 8080 usaremos a seguinte URL para acessar a rota no POSTMAN:
- ```bash
      http://localhost:8080/api/usuario/validarSenha + usuario + senha
12.  Vamos usar como exemplo o login postgres e senha postgres.
![Captura de tela 2023-10-28 235524](https://github.com/Daviddust95/Criptografia-de-senhas-com-java-spring-boot-api-rest/assets/124353154/b4d96a93-1cba-44cb-a6f6-5c88ed72e426)

13.  Enviar a solicitação.

14.  Após a solicitação ser enviada, o programa irá parar, então, clicamos no campo login, e apertamos a tecla f8 para seguir para o próximo campo.

15.  Após isso, clicamos no campo login, e a senha do usuário deverá aparecer encriptada com o padrão hash, não esqueça de copiar a chave criptografada.

16.  Voltamos ao banco de dados, em tools > query tools e executamos a query: select from usuario.

17.  Após isso, podemos ter certeza que a senha do usuário foi de fato criptograda pela aplicação.

18.  Se retornarmos ao POSTMAN e realizarmos uma nova solicitação get na url http://localhost:8080/api/usuario/listarTodos, a resposta retornará o longin e a senha de todos os usuários, inclusive o usuário que teve de fato a senha encriptada.

## Contato
Se você tiver alguma dúvida, comentário ou feedback, sinta-se à vontade para entrar em contato:

- **Email:** alissondaviddev@gmail.com
- **LinkedIn:** [alisson-melo95](https://www.linkedin.com/in/alisson-melo95/) 
- **Site Pessoal:** [Portifólio](https://alissondev.tech)
- **GitHub:** [@Daviddust95](https://github.com/Daviddust95)
