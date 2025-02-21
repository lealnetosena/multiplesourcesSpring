//package com.estudo.multiplesource;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public class MeuRepositorio {
//
//    @PersistenceContext(unitName = "primary")
//    private EntityManager primaryEntityManager;
//
//    @PersistenceContext(unitName = "secondary")
//    private EntityManager secondaryEntityManager;
//
//    public void salvarNoPrimario(Objeto obj) {
//        primaryEntityManager.persist(obj);
//    }
//
//    public void salvarNoSecundario(Objeto obj) {
//        secondaryEntityManager.persist(obj);
//    }
//}