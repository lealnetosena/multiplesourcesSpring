package com.estudo.multiplesource.infra.repository;

//package com.estudo.multiplesource.infra.repository;
//
//import com.estudo.multiplesource.domain.Cliente;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface ClienteRepository extends JpaRepository<Cliente, Long> {
//}
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class ClienteRepository {

    private final EntityManagerFactory entityManagerFactory;

    @Autowired
    public ClienteRepository(@Qualifier("primaryEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }

    // ... seu código de repositório ...
}