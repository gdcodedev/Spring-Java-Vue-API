package org.example.agcapital.repository;

import org.example.agcapital.entities.Atividade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AtividadeRepository extends JpaRepository<Atividade, Long> {
    List<Atividade> findByProjetoId(Long projetoId);
}

