package com.crud.pruebaTecnica.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class RequestDto { //Entrada

    //atributos

    private String user;
    private String email;
    private String password;

    //constructor
    public RequestDto(String user, String email, String password) {
        this.user = user;
        this.email = email;
        this.password = password;
    }
}
