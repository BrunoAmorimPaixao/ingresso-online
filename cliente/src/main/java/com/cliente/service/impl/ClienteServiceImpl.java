package com.cliente.service.impl;

import com.cliente.model.Cliente;
import com.cliente.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {


    @Override
    public Cliente save(Cliente Cliente, Long idCliente) {
        return null;
    }
}
