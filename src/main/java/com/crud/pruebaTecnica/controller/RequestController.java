package com.crud.pruebaTecnica.controller;

import com.crud.pruebaTecnica.dto.RequestDto;
import com.crud.pruebaTecnica.mapper.RequestMapper;
import com.crud.pruebaTecnica.model.RequestModel;
import com.crud.pruebaTecnica.repository.RequestRepository;
import com.crud.pruebaTecnica.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")

public class RequestController {

    private final RequestMapper requestMapper;
    private final RequestRepository requestRepository;

    public RequestController(RequestMapper requestMapper, RequestRepository requestRepository) {
        this.requestMapper = requestMapper;
        this.requestRepository = requestRepository;
    }

    @PostMapping
    public ResponseEntity<RequestRepository> requestUser(@RequestBody  RequestDto requestDto) {

        RequestModel requestModel = requestMapper.mapToModel(requestDto);
        requestRepository.save(requestModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(requestRepository);
    }

}
