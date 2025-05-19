package com.senai.josemauro.csi_apialugueldeveiculos.service;

import com.senai.josemauro.csi_apialugueldeveiculos.entity.Cliente;
import com.senai.josemauro.csi_apialugueldeveiculos.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarCliente(){
        return clienteRepository.findAll();
    }

    public Cliente incluirCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente alterarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deletarByIdCliente(int id) {
        clienteRepository.deleteById(id);
    }
}
