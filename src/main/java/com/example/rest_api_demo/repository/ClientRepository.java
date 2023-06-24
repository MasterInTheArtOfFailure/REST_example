package com.example.rest_api_demo.repository;

import com.example.rest_api_demo.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer>  {
}
