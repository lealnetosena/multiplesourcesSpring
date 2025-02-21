package com.estudo.multiplesource.controller;


import com.estudo.multiplesource.domain.fornecedor.Fornecedor;

import com.estudo.multiplesource.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {

    @Autowired
    private FornecedorService service;

    @GetMapping
    public List<Fornecedor> listarFornecedores() {
        return service.findAll();
    }
}