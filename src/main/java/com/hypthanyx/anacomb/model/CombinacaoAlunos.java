package com.hypthanyx.anacomb.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CombinacaoAlunos {
    private Aluno aluno;
    private List<Aluno> alunos;
}
