package com.evento.controller;

import com.evento.dto.EventoDto;
import com.evento.model.Evento;
import com.evento.service.EventoService;
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
@RequestMapping("/api/evento")
@RequiredArgsConstructor
@Slf4j
public class EventoController {

    private final ModelMapper modelMapper;

    private final EventoService eventoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EventoDto create(@RequestBody @Valid EventoDto dto) {
        log.info(" criando um evento com número: {} ", dto.getNomeEvento());
        Evento entity = modelMapper.map(dto,  Evento.class);
        entity =  eventoService.save(entity);
        return modelMapper.map(entity,  EventoDto.class);
    }
}
