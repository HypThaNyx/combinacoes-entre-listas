package com.hypthanyx.anacomb.api;

import com.hypthanyx.anacomb.model.ChapaGremio;
import com.hypthanyx.anacomb.model.Sala;
import com.hypthanyx.anacomb.service.GremioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/gremio")
@RestController
public class GremioController {
    private final GremioService gremioService;

    @Autowired
    public GremioController(GremioService gremioService) {
        this.gremioService = gremioService;
    }

    @GetMapping
    public List<ChapaGremio> getCombinacoesChapa(List<Sala> salas) {
        return gremioService.geraChapasGremio(salas);
    }
}
