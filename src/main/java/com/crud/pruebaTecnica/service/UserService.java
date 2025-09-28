package com.crud.pruebaTecnica.service;

import com.crud.pruebaTecnica.dto.UserLoginDto;
import com.crud.pruebaTecnica.dto.UserLoginResponseDto;
import com.crud.pruebaTecnica.dto.UserRegisterDto;
import com.crud.pruebaTecnica.dto.UserRegisterResponseDto;

public interface UserService { //firma de la interfaz
    UserRegisterResponseDto create(UserRegisterDto userRegisterDto); //referencio el metodo que va en el Impl
    UserLoginResponseDto login(UserLoginDto userLoginDto); //referencio el metodo que va en el Impl
}
