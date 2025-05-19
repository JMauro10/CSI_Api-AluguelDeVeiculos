package com.senai.josemauro.csi_apialugueldeveiculos.controller;

import com.senai.josemauro.csi_apialugueldeveiculos.entity.Veiculo;
import com.senai.josemauro.csi_apialugueldeveiculos.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/veiculo")
@CrossOrigin("*")
public class VeiculoController {
    @Autowired
    private VeiculoService veiculoService;

    @GetMapping
    public List<Veiculo> listarVeiculo() {
        return veiculoService.listarVeiculo();
    }

    @PostMapping
    public Veiculo incluirVeiculo(@RequestBody Veiculo veiculo){
        return veiculoService.incluirVeiculo(veiculo);
    }

    @PutMapping
    public Veiculo alterarVeiculoByID(@RequestBody Veiculo veiculo) {
        return veiculoService.alterarVeiculo(veiculo);
    }

    @DeleteMapping("/{id}")
    public void deletarVeiculoById(@PathVariable int id){
        veiculoService.deletarByIdVeiculo(id);
    }
}
