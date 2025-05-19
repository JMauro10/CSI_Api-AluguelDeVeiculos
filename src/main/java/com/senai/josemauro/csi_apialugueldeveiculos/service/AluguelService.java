package com.senai.josemauro.csi_apialugueldeveiculos.service;

import com.senai.josemauro.csi_apialugueldeveiculos.entity.Aluguel;
import com.senai.josemauro.csi_apialugueldeveiculos.repository.AluguelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AluguelService {
    @Autowired
    private AluguelRepository aluguelRepository;

    public List<Aluguel> listarAluguel(){
        return aluguelRepository.findAll();
    }

    public Aluguel incluirAluguel(Aluguel aluguel) {
        return aluguelRepository.save(aluguel);
    }

    public Aluguel alterarAluguel(Aluguel aluguel) {
        return aluguelRepository.save(aluguel);
    }

    public void deletarByIdAluguel(int id) {
        aluguelRepository.deleteById(id);
    }
}
