package com.senai.josemauro.csi_apialugueldeveiculos.repository;

import com.senai.josemauro.csi_apialugueldeveiculos.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}
