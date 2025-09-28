package com.crud.pruebaTecnica.repository;

import com.crud.pruebaTecnica.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * la interface que se encarga de hablar con la DB hereda de JPA para hacer el CRUD y toma como parametros
 * el requestModel que es el Entity, es decir, la tabla que se insertara en la DB y el tipo de dato del PK
 */
@Repository //hace que la clase sea un repositorio
public interface UserRepository extends JpaRepository<UserModel,Long> { // Firma de la interfaz Hereda de JPA repository y solicita datos de tipo UserModel y el tipo de dato de la pk

}

