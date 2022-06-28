package com.hypthanyx.anacomb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Partido {
    private Integer quantidadeParticipantesChapa;
    private List<Politico> integrantes;
}
