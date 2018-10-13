package br.com.jeancnasc.testando.status.servidor;

import br.com.jeancnasc.testando.status.Status;
import br.com.jeancnasc.testando.status.RecursoStatus;
import br.com.jeancnasc.testando.status.RecursoCliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("principal")
public class ServidorStatus implements RecursoCliente {


    private final String nome = "servidor";


    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public RecursoStatus status() {
        RecursoStatus sr = new RecursoStatus();
        sr.setNome(nome);
        sr.setStatus(Status.OK);
        return sr;
    }
}
