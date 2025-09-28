package com.crud.pruebaTecnica.service;

import com.crud.pruebaTecnica.dto.UserRequestDto;
import com.crud.pruebaTecnica.dto.UserResponseDto;
import com.crud.pruebaTecnica.mapper.UserMapper;
import com.crud.pruebaTecnica.model.UserModel;
import com.crud.pruebaTecnica.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service //marca la clase como un Service (logica dnegocio)
@RequiredArgsConstructor  //Agrega constructores cuando hay variables final (tambien llamada variable de campo)
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository; //variable privada de tipo clase UserService que no muta su valor
    private final UserMapper userMapper; //variable privada de tipo clase UserService que no muta su valor


    @Override //sobreescribir, para metodos publicos que se referencian en UserService
    public UserResponseDto create(UserRequestDto userRequestDto) { //firma del metodo
        UserModel userModel = userMapper.mapToModel(userRequestDto); //variable de tipo modelo que mapea a dto
        UserModel userCreated = userRepository.save(userModel); // variable de tipo modelo que guarda el mapeo
        UserResponseDto userResponseDto = userMapper.mapToDto(userCreated); //variable dto response que almacena el mapeo convertido en DTO (data transfer object)
        return userResponseDto; // retorna el mapeo convertido a DTO
    }
}
