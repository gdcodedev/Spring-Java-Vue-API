package org.example.agcapital.services;

import org.example.agcapital.entities.Atividade;
import org.example.agcapital.repository.AtividadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtividadeService {
    @Autowired
    private AtividadeRepository atividadeRepository;

    public List<Atividade> getAllAtividades() {
        return atividadeRepository.findAll();
    }

    public Atividade getAtividadeById(Long id) {
        return atividadeRepository.findById(id).orElse(null);
    }

    public Atividade saveAtividade(Atividade atividade) {
        return atividadeRepository.save(atividade);
    }

    public void deleteAtividade(Long id) {
        atividadeRepository.deleteById(id);
    }

    public List<Atividade> getAtividadesByProjetoId(Long projetoId) {
        return atividadeRepository.findByProjetoId(projetoId);
    }
}

