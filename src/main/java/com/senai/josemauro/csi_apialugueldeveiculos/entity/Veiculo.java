package com.senai.josemauro.csi_apialugueldeveiculos.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "veiculo")
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "modelo", length = 50, nullable = false)
    private String modelo;

    @Column(name = "tipo", nullable = false)
    private Tipo tipo;

    private Boolean disponivel;

    @OneToMany(mappedBy = "veiculo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Aluguel> alugueis;

    public enum Tipo {
        CARRO,
        MOTO
    }

    public Veiculo() {
    }

    public Veiculo(int id, String modelo, Tipo tipo, Boolean disponivel, List<Aluguel> alugueis) {
        this.id = id;
        this.modelo = modelo;
        this.tipo = tipo;
        this.disponivel = disponivel;
        this.alugueis = new ArrayList<>(alugueis);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public List<Aluguel> getAlugueis() {
        return alugueis;
    }

    public void setAlugueis(List<Aluguel> alugueis) {
        this.alugueis = alugueis;
    }
}
