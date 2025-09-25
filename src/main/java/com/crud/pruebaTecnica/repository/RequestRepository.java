package com.crud.pruebaTecnica.repository;

import com.crud.pruebaTecnica.model.RequestModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<RequestModel,String> {
    RequestModel RequestModelByUser(String user);
}
