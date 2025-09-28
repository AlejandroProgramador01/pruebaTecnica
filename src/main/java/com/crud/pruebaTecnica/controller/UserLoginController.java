package com.crud.pruebaTecnica.controller;

import com.crud.pruebaTecnica.dto.UserLoginDto;
import com.crud.pruebaTecnica.dto.UserLoginResponseDto;
import com.crud.pruebaTecnica.dto.UserRegisterDto;
import com.crud.pruebaTecnica.dto.UserRegisterResponseDto;
import com.crud.pruebaTecnica.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //marca la clase como un controlador REST, lo que le permite recibir datos y devolverlos
@RequestMapping("/login") // define la ruta donde se ejecutará
@RequiredArgsConstructor //Agrega constructores cuando hay variables final

public class UserLoginController {
    private final UserService userService; //variable privada de tipo clase UserService que no muta su valor

    //funcionalidad para loguear un usuario
    @PostMapping
    /**
     *modificador de acceso, tipo de respuesta HTTP, generic o tipo de dato que se espera en el return dentro de "<>", nombre del metodo, parámetros de entrada
     */
    public ResponseEntity<UserLoginResponseDto> login(@RequestBody UserLoginDto user) { //firma del metodo
        UserLoginResponseDto userLoginResponseDto = userService.login(user); //creo variable tipo UserResponseDto en la cual aplico el metodo del Impl para crear usuario
        return ResponseEntity.status(HttpStatus.OK).body(userLoginResponseDto); //retorno una respuesta 201 y el userResponseDto
    }
}



