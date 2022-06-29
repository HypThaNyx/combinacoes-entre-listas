package com.hypthanyx.anacomb.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sala {
    @JsonProperty("cota_alunos_chapa")
    private Integer cotaAlunosChapa;
    @JsonProperty("alunos")
    private List<Aluno> alunos;
}
