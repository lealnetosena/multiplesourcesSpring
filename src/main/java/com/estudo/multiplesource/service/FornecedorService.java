package com.estudo.multiplesource.service;

import com.estudo.multiplesource.domain.Cliente;
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

    @Autowired
    @Qualifier("secondaryEntityManager")
    private EntityManager secondaryEntityManager;

    public List<Cliente> findAll() {



        List<Cliente> clientes = primaryEntityManager.createNamedQuery("Cliente.findAll", Cliente.class).getResultList();




        return clientes;
    }
}