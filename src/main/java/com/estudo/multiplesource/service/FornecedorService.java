package com.estudo.multiplesource.service;

import com.estudo.multiplesource.domain.fornecedor.Fornecedor;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FornecedorService {


    @Autowired
    @Qualifier("secondaryEntityManager")
    private EntityManager secondaryEntityManager;

    public List<Fornecedor> findAll() {

        return secondaryEntityManager.createNamedQuery("Fornecedor.findAll", Fornecedor.class).getResultList();
    }
}