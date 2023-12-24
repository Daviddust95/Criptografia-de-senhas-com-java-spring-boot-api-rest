![Badge de Estado](https://img.shields.io/badge/Status-Em%20Melhoria-brightgreen)

# Criptografia de senhas com java e spring boot | API REST
### **Este projeto está sempre em um processo contínuo de melhoria para oferecer a melhor experiência possível.**

## Últimas Melhorias - 24/12/2023

- Atualização na versão das dependências e dos parents do arquivo pom.xml
- Preparação do pom.xml pra inserção da interface gráfica (GUI).

<justify>
A aplicação fornece um método para garantir a segurança das credenciais dos usuários por meio de criptografia
da senha, e armazenando todos os dados no banco de dados PostgreSQL, com a ajuda do Spring Data JPA e 
Spring Security.
</justify>

## Imagem do Projeto

![Captura de tela 2023-10-22 165221](https://github.com/Daviddust95/Criptografia-de-senhas-com-java-spring-boot-api-rest/assets/124353154/7284152a-0035-496a-a759-8bcf466478da)


https://github.com/Daviddust95/Criptografia-de-senhas-com-java-spring-boot-api-rest/assets/124353154/a4255843-5984-45a5-b1fa-956e1c8d0604

https://github.com/Daviddust95/Criptografia-de-senhas-com-java-spring-boot-api-rest/assets/124353154/8bf38329-c847-40a3-8a16-6888c447d180


## Conteúdo

1. [Sobre](#sobre)
2. [Tecnologias Utilizadas](#tecnologias-utilizadas)
3. [Requisitos](#requisitos)
4. [Instalação](#instalação)
5. [Como Usar](#como-usar)
6. [Contato](#contato)

## Sobre
<justify>
Este projeto Java fornece uma solução para garantir a segurança das credenciais dos usuários, criptografando as senhas com uma função hash e armazenando os dados no banco de dados PostgreSQL.
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
 
1. **Instalar todas as bibliotecas internas dentro do projeto (caso use o IntelliJ é possível fazer isso apenas selecionando o Maven > Reload all Maven Project).**

2. **Inicializar o PostgreSQL e a ferramenta POSTMAN.**

3. **Inicializar o controller da aplicação em modo run (não em modo debug).**

4. **Para criar usuários dentro do banco de dados, vamos enviar solicitações do tipo POST dentro do POSTMAN, na seguinte URL:**
- ```bash
   http://localhost:8080/api/usuario/salvar
6. **Dentro da solicitação do tipo POST, deverá conter as seguintes caracteristicas, do tipo raw e json:**
![Captura de tela 2023-10-28 234953](https://github.com/Daviddust95/Criptografia-de-senhas-com-java-spring-boot-api-rest/assets/124353154/620f8359-5a3e-4bb8-928b-660346c8b5e0)
- ```bash
  { "id": "",
  "login": "InformeoLoginAqui",
  "password": "InformeaSenhaAqui"
   }
7. **Nesta etapa, vamos verificar se as credenciais enviadas pelo usuário são válidas. Para isso, vamos comparar as informações fornecidas com os dados registrados em nossa base de dados. Se as informações forem correspondentes, a autenticação será bem-sucedida. Caso contrário, o login será negado.**

8. **Vamos usar o POSTMAN para criar solicitações do tipo GET, e vamos adicionar parâmetros do tipo login e password.**
![Captura de tela 2023-10-28 234523](https://github.com/Daviddust95/Criptografia-de-senhas-com-java-spring-boot-api-rest/assets/124353154/18f4a2f0-9d72-47f0-aa60-6ababd020f8a)

9. **Em cada solicitação no POSTMAN, deverá ser utilizado arquivos do tipo RAW e JSON.**

10. **Como o programa roda na porta 8080 usaremos a seguinte URL para acessar a rota no POSTMAN:**
- ```bash
  http://localhost:8080/api/usuario/validarSenha+usuario+senha
12.  **Vamos usar como exemplo o login postgres e senha postgres.**
![Captura de tela 2023-10-29 000409](https://github.com/Daviddust95/Criptografia-de-senhas-com-java-spring-boot-api-rest/assets/124353154/a6f7dc2c-3b1a-4911-aa6e-3712b2ee5e06)

13. **Enviar a solicitação.**

14. **Após a solicitação ser enviada, receberemos uma resposta do login. A resposta será "True" se as credenciais estiverem corretas, ou "False" se as credenciais estiverem inválidas.**
![Captura de tela 2023-10-29 000658](https://github.com/Daviddust95/Criptografia-de-senhas-com-java-spring-boot-api-rest/assets/124353154/2b0adbec-26bb-4d66-8c37-a52e35c47173)

15. **Se retornarmos e realizarmos uma nova solicitação get no POSTMAN na URL:**
- ```bash
   http://localhost:8080/api/usuario/listarTodos
16. **A resposta retornará o longin e a senha de todos os usuários, inclusive os usuários que tiveram de fato a senha encriptada.**
18. **Após isso, podemos ter certeza que a senha do usuário foi de fato criptografada pela aplicação.**

## Contato
Se você tiver alguma dúvida, comentário ou feedback, sinta-se à vontade para entrar em contato:

- **Email:** alissondaviddev@gmail.com
- **LinkedIn:** [alisson-melo95](https://www.linkedin.com/in/alisson-melo95/) 
- **Site Pessoal:** [Portifólio](https://alissondev.tech)
- **GitHub:** [@Daviddust95](https://github.com/Daviddust95)
