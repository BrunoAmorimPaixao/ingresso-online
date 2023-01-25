package com.cliente.service.impl;

import com.cliente.exception.BusinessException;
import com.cliente.model.Cliente;
import com.cliente.repository.ClienteRepository;
import com.cliente.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository repository;
    @Override
    public Cliente save(Cliente Cliente) {
        if(repository.existsByCpf(Cliente.getCpf())){
            throw new BusinessException("CPF já cadastrado.");
        }

        return repository.save(Cliente);
    }
}
