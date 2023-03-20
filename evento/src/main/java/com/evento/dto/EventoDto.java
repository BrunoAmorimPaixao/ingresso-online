package com.evento.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventoDto {

    @NotEmpty(message = "Nome é obrigatório.")
    private String nomeEvento;

    @NotEmpty(message = "Data é obrigatório.")
    private LocalDateTime dataEvento;



}
