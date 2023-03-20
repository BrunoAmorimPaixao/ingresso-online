package com.evento.dto;

import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;

public class EventoDto {

    @NotEmpty(message = "Nome é obrigatório.")
    private String nomeEvento;

    @NotEmpty(message = "Data é obrigatório.")
    private LocalDateTime dataEvento;



}
