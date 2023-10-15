package com.example.criptografia.de.senhas.PrimeiroUsuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

public class PrimeiroUsuario {

}

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persinstence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="Usuario")
public class PrimeiroUsuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String login;
    private String password;


}