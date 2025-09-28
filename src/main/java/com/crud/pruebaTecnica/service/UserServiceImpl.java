package com.crud.pruebaTecnica.service;

import com.crud.pruebaTecnica.dto.UserLoginDto;
import com.crud.pruebaTecnica.dto.UserLoginResponseDto;
import com.crud.pruebaTecnica.dto.UserRegisterDto;
import com.crud.pruebaTecnica.dto.UserRegisterResponseDto;
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
    public UserRegisterResponseDto create(UserRegisterDto userRegisterDto) { //firma del metodo
        UserModel userModel = userMapper.mapToModelRegister(userRegisterDto); //variable de tipo modelo que mapea a dto
        UserModel userCreated = userRepository.save(userModel); // variable de tipo modelo que guarda el mapeo
        UserRegisterResponseDto userRegisterResponseDto = userMapper.mapToDtoRegister(userCreated); //variable dto response que almacena el mapeo convertido en DTO (data transfer object)
        return userRegisterResponseDto; // retorna el mapeo convertido a DTO
    }

    @Override
    public UserLoginResponseDto login(UserLoginDto userLoginDto) {
        UserModel userModel = userMapper.mapToModelLogin(userLoginDto); //variable de tipo modelo que mapea a dto
        UserModel userLogin = userRepository.save(userModel); // variable de tipo modelo que guarda el mapeo
        UserLoginResponseDto userLoginResponseDto = userMapper.mapToDtoLogin(userLogin); //variable dto response que almacena el mapeo convertido en DTO (data transfer object)
        return userLoginResponseDto;
    }
}
