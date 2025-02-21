package com.estudo.multiplesource.controller;


import com.estudo.multiplesource.service.ClienteService;
import com.estudo.multiplesource.domain.cliente.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public List<Cliente> listarClientes() {
        return service.findAll();

//        List<Cliente> clientes = new ArrayList<>();
//        Cliente cliente1 = new Cliente();
//        cliente1.setId(1L);
//        cliente1.setNome("João");
//        clientes.add(cliente1);
//        return clientes;

    }
}