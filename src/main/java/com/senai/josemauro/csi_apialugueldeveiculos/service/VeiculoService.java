package com.senai.josemauro.csi_apialugueldeveiculos.service;

import com.senai.josemauro.csi_apialugueldeveiculos.entity.Veiculo;
import com.senai.josemauro.csi_apialugueldeveiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VeiculoService {
    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> listarVeiculo(){
        return veiculoRepository.findAll();
    }

    public Veiculo incluirVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public Veiculo alterarVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public void deletarByIdVeiculo(int id) {
        veiculoRepository.deleteById(id);
    }
}
