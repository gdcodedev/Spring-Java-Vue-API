package org.example.agcapital.controller;

import org.example.agcapital.entities.Atividade;
import org.example.agcapital.services.AtividadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/atividades")


public class AtividadeController {
    @Autowired
    private AtividadeService atividadeService;

    @GetMapping
    public List<Atividade> getAllAtividades() {
        return atividadeService.getAllAtividades();
    }

    @GetMapping("/{id}")
    public Atividade getAtividadeById(@PathVariable Long id) {
        return atividadeService.getAtividadeById(id);
    }

    @PostMapping
    public Atividade createAtividade(@RequestBody Atividade atividade) {
        return atividadeService.saveAtividade(atividade);
    }

    @PutMapping("/{id}")
    public Atividade updateAtividade(@PathVariable Long id, @RequestBody Atividade atividade) {
        Atividade existingAtividade = atividadeService.getAtividadeById(id);
        if (existingAtividade != null) {
            atividade.setId(id);
            return atividadeService.saveAtividade(atividade);
        } else {
            return null; // Or handle error
        }
    }

    @DeleteMapping("/{id}")
    public void deleteAtividade(@PathVariable Long id) {
        atividadeService.deleteAtividade(id);
    }

    @GetMapping("/projeto/{projetoId}")
    public List<Atividade> getAtividadesByProjetoId(@PathVariable Long projetoId) {
        return atividadeService.getAtividadesByProjetoId(projetoId);
    }
}

