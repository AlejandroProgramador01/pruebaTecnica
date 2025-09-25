package com.crud.pruebaTecnica.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "userTable")
@Getter
@Setter

public class RequestModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String user;
    private String email;
    private String password;
}
