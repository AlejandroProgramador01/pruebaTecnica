package com.crud.pruebaTecnica.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter //agrega getters para llamar los atributos privados desde otros package del programa
@Setter //agrega getters para enviar los atributos privados a otros package del programa
@AllArgsConstructor //agrega constructores
@NoArgsConstructor //agrega constructores vacíos
public class UserLoginResponseDto {
    //atributos solicitados
    private Long id;
    private String username;
}
