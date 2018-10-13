package br.com.jeancnasc.testando.status.servidor;

import br.com.jeancnasc.testando.status.recurso.dois.RecursoDois;
import br.com.jeancnasc.testando.status.recurso.um.RecursoUm;
import br.com.jeancnasc.testando.status.spring.EnableStatus;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan(basePackageClasses = {App.class, RecursoUm.class, RecursoDois.class})
@EnableStatus
public class App {
    @RequestMapping("/")
    String home() {
        return "Olá mundo!";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
