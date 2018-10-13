package br.com.jeancnasc.testando.status.recurso.um;

import br.com.jeancnasc.testando.status.Status;
import br.com.jeancnasc.testando.status.RecursoStatus;
import br.com.jeancnasc.testando.status.RecursoCliente;
import org.springframework.stereotype.Service;

@Service
public class RecursoUm implements RecursoCliente {

    private final String nome = "recurso-um";

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public RecursoStatus status() {
        RecursoStatus sr = new RecursoStatus();
        sr.setNome(nome);
        sr.setStatus(Status.FALHA);
        return sr;
    }
}