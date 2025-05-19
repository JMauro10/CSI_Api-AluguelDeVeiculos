package com.senai.josemauro.csi_apialugueldeveiculos.controller;

import com.senai.josemauro.csi_apialugueldeveiculos.entity.Aluguel;
import com.senai.josemauro.csi_apialugueldeveiculos.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/aluguel")
@CrossOrigin("*")
public class AluguelController {
    @Autowired
    private AluguelService aluguelService;

    @GetMapping
    public List<Aluguel> listarAluguel() {
        return aluguelService.listarAluguel();
    }

    @PostMapping
    public Aluguel incluirAluguel(@RequestBody Aluguel aluguel){
        return aluguelService.incluirAluguel(aluguel);
    }

    @PutMapping
    public Aluguel alterarAluguelByID(@RequestBody Aluguel aluguel) {
        return aluguelService.alterarAluguel(aluguel);
    }

    @DeleteMapping("/{id}")
    public void deletarAluguelById(@PathVariable int id){
        aluguelService.deletarByIdAluguel(id);
    }
}
