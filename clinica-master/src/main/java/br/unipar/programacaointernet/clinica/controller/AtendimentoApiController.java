package br.unipar.programacaointernet.clinica.controller;

import br.unipar.programacaointernet.clinica.model.Atendimento;
import br.unipar.programacaointernet.clinica.service.AtendimentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class AtendimentoApiController {
    private final AtendimentoService atendimentoService;

    public AtendimentoApiController(AtendimentoService atendimentoService) {
        this.atendimentoService = atendimentoService;
    }

    @GetMapping
    public ResponseEntity<List<Atendimento>> listarAtendimento(){
        return ResponseEntity.ok(atendimentoService.getAll());
    }

    @PostMapping
    public ResponseEntity<Atendimento> salvarAtendimento(@RequestBody Atendimento atendimento){
        return ResponseEntity.ok(atendimentoService.save(atendimento));
    }

}
