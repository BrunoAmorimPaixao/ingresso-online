package com.cliente.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO {

    @NotEmpty(message = "Nome é obrigatório.")
    @Size(max = 100, message = "Tamanho máximo permitido de 100 caracteres.")
    private String nome;
    @NotEmpty(message = "CPF é obrigatório.")
    @CPF(message = "CPF inválido")
    @Size(max = 14, message = "Tamanho máximo permitido de 14 caracteres.")
    private String cpf;
}
