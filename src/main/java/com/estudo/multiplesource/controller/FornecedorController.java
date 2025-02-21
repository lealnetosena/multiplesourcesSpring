//package com.estudo.multiplesource.controller;
//
//
//import com.estudo.multiplesource.domain.Fornecedor;
//import com.estudo.multiplesource.infra.repository.FornecedorRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/fornecedores")
//public class FornecedorController {
//
//    @Autowired
//    private FornecedorRepository fornecedorRepository;
//
//    @GetMapping
//    public List<Fornecedor> listarFornecedores() {
//        return fornecedorRepository.findAll();
//    }
//}