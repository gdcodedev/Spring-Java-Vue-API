package org.example.agcapital.entities;

import jakarta.persistence.*;


@Entity
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusAtividade status;

    @ManyToOne
    @JoinColumn(name = "projeto_id")
    private Projeto projeto;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusAtividade getStatus() {
        return status;
    }

    public void setStatus(StatusAtividade status) {
        this.status = status;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
}
