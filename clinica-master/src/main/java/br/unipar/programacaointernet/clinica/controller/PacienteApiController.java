package br.unipar.programacaointernet.clinica.controller;

import br.unipar.programacaointernet.clinica.model.Paciente;
import br.unipar.programacaointernet.clinica.service.PacienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PacienteApiController {
    private final PacienteService pacienteService;

    public PacienteApiController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }
    @GetMapping(path = "/api/pacientes")
    public ResponseEntity<List<Paciente>> getAll(){
        return ResponseEntity.ok(pacienteService.getAll());
    }
    @PostMapping(path = "/api/pacientes")
    public ResponseEntity<Paciente> save(@RequestBody Paciente paciente){
        return ResponseEntity.ok(pacienteService.save(paciente));
    }

}
