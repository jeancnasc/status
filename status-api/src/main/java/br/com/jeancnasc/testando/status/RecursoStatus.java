package br.com.jeancnasc.testando.status;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class RecursoStatus {
    private String nome;
    private Status status;
    private LocalDateTime hora = LocalDateTime.now();
    private String mensagem;
    private Set<RecursoStatus> dependencias = new HashSet<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Set<RecursoStatus> getDependencias() {
        return dependencias;
    }

    public void setDependencias(Set<RecursoStatus> dependencias) {
        this.dependencias = dependencias;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDateTime getHora() {
        return hora;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }
}