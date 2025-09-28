package com.crud.pruebaTecnica.mapper;

import com.crud.pruebaTecnica.dto.UserLoginDto;
import com.crud.pruebaTecnica.dto.UserLoginResponseDto;
import com.crud.pruebaTecnica.dto.UserRegisterDto;
import com.crud.pruebaTecnica.dto.UserRegisterResponseDto;
import com.crud.pruebaTecnica.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring") //hace que esta clase sea de tipo Mapper, es decir, que pueda mapear
public interface UserMapper { //firma de la interface

    //mapea de Dto a Model del registro
    @Mapping(target = "id", ignore = true) //ignoro el ID del modelo
    @Mapping(source = "username", target = "username")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "password", target = "password")
    UserModel mapToModelRegister(UserRegisterDto dto); //retorna UserModel y solicita UserRequestDto

    //mapea de Model a Dto del registro
    @Mapping(source = "id", target = "id")
    @Mapping(source = "username", target = "username")
    @Mapping(source = "email", target = "email")
    UserRegisterResponseDto mapToDtoRegister(UserModel model); //retorana UserResponseDto y solicita UserModel

    //mapea de Dto a Model del login
    @Mapping(target = "id", ignore = true) //ignoro el ID del modelo
    @Mapping(target = "username", ignore = true) //ignoro el username del modelo
    @Mapping(source = "email", target = "email")
    @Mapping(source = "password", target = "password")
    UserModel mapToModelLogin(UserLoginDto dto); //retorna UserModel y solicita UserRequestDto

    //mapea de Model a Dto del login
    @Mapping(source = "id", target = "id")
    @Mapping(source = "username", target = "username")
    UserLoginResponseDto mapToDtoLogin(UserModel model); //retorana UserResponseDto y solicita UserModel
}
