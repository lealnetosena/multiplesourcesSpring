package com.estudo.multiplesource.domain.fornecedor;

import jakarta.persistence.*;

@Entity
@Table(name = "fornecedores")
@NamedQueries({
        @NamedQuery(name = "Fornecedor.findAll", query = "SELECT f FROM Fornecedor f")
})
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}