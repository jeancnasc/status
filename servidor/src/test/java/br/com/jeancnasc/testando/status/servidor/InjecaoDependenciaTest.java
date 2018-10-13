package br.com.jeancnasc.testando.status.servidor;

import br.com.jeancnasc.testando.status.recurso.dois.RecursoDois;
import br.com.jeancnasc.testando.status.recurso.um.RecursoUm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class InjecaoDependenciaTest {

    @Autowired
    private RecursoUm recursoUm;

    @Autowired
    private RecursoDois recursoDois;

    @Test
    public void recursoUm() {
        assertThat(recursoUm).isNotNull();
    }

    @Test
    public void recursoDois() {
        assertThat(recursoDois).isNotNull();
    }

}
