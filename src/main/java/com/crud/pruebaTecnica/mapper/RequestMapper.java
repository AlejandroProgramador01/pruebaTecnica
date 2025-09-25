package com.crud.pruebaTecnica.mapper;

import com.crud.pruebaTecnica.dto.RequestDto;
import com.crud.pruebaTecnica.model.RequestModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RequestMapper {

    @Mapping(source = "user", target = "user")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "password", target = "password")
    RequestModel mapToModel(RequestDto dto);
}
