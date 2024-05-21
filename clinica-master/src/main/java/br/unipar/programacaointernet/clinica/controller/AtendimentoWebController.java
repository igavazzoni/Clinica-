package br.unipar.programacaointernet.clinica.controller;

import br.unipar.programacaointernet.clinica.model.Atendimento;
import br.unipar.programacaointernet.clinica.service.AtendimentoService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class AtendimentoWebController {

    private final AtendimentoService atendimentoService;

    public AtendimentoWebController(AtendimentoService atendimentoService) {
        this.atendimentoService = atendimentoService;
    }

    @GetMapping("/atendimentos")
    private String getAllAtendimentos(Model model) {
        List<Atendimento> atendimentos = atendimentoService.getAll();
        model.addAttribute("atendimentos", atendimentos);
        return "atendimentos";
    }

    @PostMapping("/atendimentos/save")
    public String saveAtendimentos(Atendimento atendimento) {
        atendimentoService.save(atendimento);
        return "redirect:/atendimentos";
    }
}
