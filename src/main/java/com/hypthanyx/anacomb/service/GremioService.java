package com.hypthanyx.anacomb.service;

import com.hypthanyx.anacomb.model.ChapaGremio;
import com.hypthanyx.anacomb.model.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GremioService {
    private final AlunoService alunoService;

    @Autowired
    public GremioService(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    public List<ChapaGremio> geraChapasGremio(List<Sala> salas) {
        return new ArrayList<>();
    }
}
