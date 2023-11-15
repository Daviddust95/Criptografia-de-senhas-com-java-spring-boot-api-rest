/*Este é o usuário modelo da aplicação
Ele pertecence ao tipo de dados, essa
classe de usuário possui dois campos do
tipo String e métodos get, set e hashCode.

Tipo de Dados: String é um tipo de dado em
muitas linguagens de programação, incluindo
Java. Ele é usado para armazenar sequências de
caracteres, como palavras ou frases.

Métodos Get e Set: Getters: São métodos usados para
obter o valor de um campo.

Setters: São métodos usados para definir o valor de um campo

hashCode: Este é um método em Java que retorna um valor
numérico associado a um objeto.
*/
package criptografia.senhas.CriptografiaDeSenhas.UsuarioModelo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Usuario")
public class Modelo {

    @Id
    //Criando atribuição de id automática
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Criando chave primária
    private Integer id;
    //Atribuição para que o login nunca se repita
    @Column (unique = true)
    private String login;
    private String password;

}
