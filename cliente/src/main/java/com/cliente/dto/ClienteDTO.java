package com.cliente.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

    @NotNull(message = "Id é obrigatório.")
    private Long id;
    @NotEmpty(message = "Nome é obrigatório.")
    @Size(max = 100, message = "Tamanho máximo permitido de 100 caracteres.")
    private String nome;
}
