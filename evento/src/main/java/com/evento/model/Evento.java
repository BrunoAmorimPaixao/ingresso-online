package com.evento.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_eventp")
    private long id;
    @Column(name = "nome", nullable = false, length = 20)
    private String nomeEvento;
    @Column(name = "dataEvento", nullable = false)
    private LocalDateTime dataEvento;

}
