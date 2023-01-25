package com.cliente.controller;

import com.cliente.dto.ClienteDTO;
import com.cliente.model.Cliente;
import com.cliente.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
@Slf4j
public class ClienteController {

    private final ModelMapper modelMapper;
    private final ClienteService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteDTO create(@RequestBody @Valid ClienteDTO dto) {
        log.info(" criando um  agência com número: {} ", dto.getNome());
        Cliente entity = modelMapper.map(dto,  Cliente.class);
        entity =  service.save(entity, dto.getId());
        return modelMapper.map(entity,  ClienteDTO.class);
    }

}
