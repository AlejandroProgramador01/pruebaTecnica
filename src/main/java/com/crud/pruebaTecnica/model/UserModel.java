package com.crud.pruebaTecnica.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity //hace que esta clase sea tomada como una tabla
@Table(name = "primary_user") //crea la tabla y le da un nombre
@Getter //agrega getters para llamar los atributos privados desde otros package del programa
@Setter //agrega getters para enviar los atributos privados a otros package del programa

public class UserModel { //firma de la clase
    @Id //hace que el atributo inmediatamente siguiente sea ID PK de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) //lo hace autoincrement
    //atributos
    private Long id;
    private String username;
    private String email;
    private String password;
}
