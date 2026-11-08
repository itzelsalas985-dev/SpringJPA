package com.example.demo.cliente;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Cliente;
import com.example.demo.repo.ClienteRepository;

@RestController
public class ClienteController {

    private final ClienteRepository repo;

    public ClienteController(ClienteRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/clientes")
    public List<Cliente> findAllClientes() {
        return repo.findAll();
    }

    @PostMapping("/clientes")
    public Cliente addCliente(@RequestBody Cliente cliente) {
        return repo.save(cliente);
    }
}