package org.example.agcapital.controller;

import org.example.agcapital.entities.Projeto;
import org.example.agcapital.services.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/projetos")


public class ProjetoController {
    @Autowired
    private ProjetoService projetoService;

    @GetMapping
    public List<Projeto> getAllProjetos() {
        return projetoService.getAllProjetos();
    }

    @GetMapping("/{id}")
    public Projeto getProjetoById(@PathVariable Long id) {
        return projetoService.getProjetoById(id);
    }

    @PostMapping
    public Projeto createProjeto(@RequestBody Projeto projeto) {
        return projetoService.saveProjeto(projeto);
    }

    @PutMapping("/{id}")
    public Projeto updateProjeto(@PathVariable Long id, @RequestBody Projeto projeto) {
        Projeto existingProjeto = projetoService.getProjetoById(id);
        if (existingProjeto != null) {
            projeto.setId(id);
            return projetoService.saveProjeto(projeto);
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteProjeto(@PathVariable Long id) {
        projetoService.deleteProjeto(id);
    }

    @GetMapping("/cliente/{clienteId}")
    public List<Projeto> getProjetosByClienteId(@PathVariable Long clienteId) {
        return projetoService.getProjetosByClienteId(clienteId);
    }
}

