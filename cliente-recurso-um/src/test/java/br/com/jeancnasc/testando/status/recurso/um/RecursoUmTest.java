package br.com.jeancnasc.testando.status.recurso.um;

import br.com.jeancnasc.testando.status.RecursoStatus;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class RecursoUmTest {
    @Autowired
    private RecursoUm recurso;

    @Test
    public void obterStatus() {
        RecursoStatus sr = recurso.status();

        assertThat(sr).isNotNull();
    }

    @SpringBootApplication
    static class TestConfiguration {

    }
}
