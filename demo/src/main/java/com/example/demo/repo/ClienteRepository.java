package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}