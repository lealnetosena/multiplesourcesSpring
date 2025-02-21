package com.estudo.multiplesource.service;

import com.estudo.multiplesource.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    @Qualifier("primaryEntityManagerFactory")
    private EntityManagerFactory primaryEntityManagerFactory;



    public List<Cliente> findAll() {
        EntityManager emPrimario = primaryEntityManagerFactory.createEntityManager();
        emPrimario.getTransaction().begin();

        List<Cliente> clientes = emPrimario.createNamedQuery("Cliente.findAll", Cliente.class).getResultList();

        emPrimario.getTransaction().commit();
        emPrimario.close();

        return clientes;
    }
}