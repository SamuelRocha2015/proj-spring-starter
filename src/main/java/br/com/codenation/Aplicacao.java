package br.com.codenation;

import br.com.codenation.models.Carro;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Configuration
@ComponentScan
public class Aplicacao {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Aplicacao.class);

        Carro carro = context.getBean(Carro.class);

        carro.setModelo("Focus");
        carro.setAno(2018);
        System.out.println(carro);
    }
}
