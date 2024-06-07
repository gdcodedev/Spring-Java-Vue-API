package org.example.agcapital.repository;

import org.example.agcapital.entities.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
    List<Projeto> findByClienteId(Long clienteId);
}

