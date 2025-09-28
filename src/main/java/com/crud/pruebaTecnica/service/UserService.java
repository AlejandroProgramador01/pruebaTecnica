package com.crud.pruebaTecnica.service;

import com.crud.pruebaTecnica.dto.UserRequestDto;
import com.crud.pruebaTecnica.dto.UserResponseDto;
import org.springframework.stereotype.Service;

public interface UserService { //firma de la interfaz
    UserResponseDto create(UserRequestDto userRequestDto); //referencio el metodo que va en el Impl
}
