package br.com.jeancnasc.testando.status.spring;

import br.com.jeancnasc.testando.status.Status;
import br.com.jeancnasc.testando.status.RecursoStatus;
import br.com.jeancnasc.testando.status.RecursoCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class StatusController {

    @Autowired
    private Set<RecursoCliente> recursos;

    @Autowired
    @Qualifier("principal")
    private RecursoCliente statusPrincipal;


    @RequestMapping("${status.path}")
    RecursoStatus home() {
        RecursoStatus sr = statusPrincipal.status();
        recursos.stream()
                .filter(r -> !r.getNome().equals(statusPrincipal.getNome()))
                .map(r -> r.status())
                .forEach(s -> {
                    if (s.getStatus() != Status.OK)
                        sr.setStatus(Status.DEPENDECIA_INDISPONIVEL);
                    sr.getDependencias().add(s);
                });
        return sr;
    }
}
