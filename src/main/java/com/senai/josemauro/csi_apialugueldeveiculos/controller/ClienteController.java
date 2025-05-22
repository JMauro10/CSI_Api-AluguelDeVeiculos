package com.senai.josemauro.csi_apialugueldeveiculos.controller;

import com.senai.josemauro.csi_apialugueldeveiculos.entity.Cliente;
import com.senai.josemauro.csi_apialugueldeveiculos.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cliente")
@CrossOrigin("*")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listarCliente() {
        return clienteService.listarCliente();
    }

    @PostMapping
    public Cliente incluirCliente(@RequestBody Cliente cliente){
        return clienteService.incluirCliente(cliente);
    }

    @PutMapping
    public Cliente alterarCliente(@RequestBody Cliente cliente) {
        return clienteService.alterarCliente(cliente);
    }

    @DeleteMapping("/{id}")
    public void deletarClienteById(@PathVariable int id){
        clienteService.deletarByIdCliente(id);
    }
}
