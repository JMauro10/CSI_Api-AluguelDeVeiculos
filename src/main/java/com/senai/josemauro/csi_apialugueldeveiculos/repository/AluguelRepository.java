package com.senai.josemauro.csi_apialugueldeveiculos.repository;

import com.senai.josemauro.csi_apialugueldeveiculos.entity.Aluguel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AluguelRepository extends JpaRepository<Aluguel, Integer> {
    List<Aluguel> findByClienteId(int clienteId);
    List<Aluguel> findByVeiculoId(int veiculoId);
}
