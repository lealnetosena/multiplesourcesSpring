package com.estudo.multiplesource.service;

import com.estudo.multiplesource.domain.cliente.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;


import java.util.List;

@Service
public class ClienteService {

    @Autowired
    @Qualifier("primaryEntityManager")
    private EntityManager primaryEntityManager;


    public List<Cliente> findAll() {

        return primaryEntityManager.createNamedQuery("Cliente.findAll", Cliente.class).getResultList();
    }
}