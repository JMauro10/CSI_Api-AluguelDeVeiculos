package com.senai.josemauro.csi_apialugueldeveiculos.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "cpf", length = 11, nullable = false)
    private String cpf;

    @OneToMany(mappedBy = "cliente",fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Aluguel> alugueis;

    public Cliente() {
    }

    public Cliente(int id, String nome, String cpf, List<Aluguel> alugueis) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.alugueis = new ArrayList<>(alugueis);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(List<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }
}
