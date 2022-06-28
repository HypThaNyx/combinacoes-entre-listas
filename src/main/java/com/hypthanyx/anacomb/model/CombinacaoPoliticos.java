package com.hypthanyx.anacomb.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class CombinacaoPoliticos {
    private Politico politico;
    private List<Politico> politicos;
}
