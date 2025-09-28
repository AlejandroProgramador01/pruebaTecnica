package com.crud.pruebaTecnica.mapper;

import com.crud.pruebaTecnica.dto.UserRequestDto;
import com.crud.pruebaTecnica.dto.UserResponseDto;
import com.crud.pruebaTecnica.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring") //hace que esta clase sea de tipo Mapper, es decir, que pueda mapear
public interface UserMapper { //firma de la interface

    //mapea de Dto a Model
    @Mapping(target = "id", ignore = true) //ignoro el ID del modelo
    @Mapping(source = "username", target = "username")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "password", target = "password")
    UserModel mapToModel(UserRequestDto dto); //retorna UserModel y solicita UserRequestDto

    //mapea de Model a Dto
    @Mapping(source = "id", target = "id")
    @Mapping(source = "username", target = "username")
    @Mapping(source = "email", target = "email")
    UserResponseDto mapToDto(UserModel model); //retorana UserResponseDto y solicita UserModel
}
