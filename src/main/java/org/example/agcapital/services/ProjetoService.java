package org.example.agcapital.services;

import org.example.agcapital.entities.Projeto;
import org.example.agcapital.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjetoService {
    @Autowired
    private ProjetoRepository projetoRepository;

    public List<Projeto> getAllProjetos() {
        return projetoRepository.findAll();
    }

    public Projeto getProjetoById(Long id) {
        return projetoRepository.findById(id).orElse(null);
    }

    public Projeto saveProjeto(Projeto projeto) {
        return projetoRepository.save(projeto);
    }

    public void deleteProjeto(Long id) {
        projetoRepository.deleteById(id);
    }

    public List<Projeto> getProjetosByClienteId(Long clienteId) {
        return projetoRepository.findByClienteId(clienteId);
    }
}

