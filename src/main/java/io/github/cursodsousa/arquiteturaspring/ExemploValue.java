package io.github.cursodsousa.arquiteturaspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExemploValue {

    @Value("${app.config.variavel}") // Captura o valor da string, que nesse caso é a variavel determinada no yml, e aplica no campo, classe ou metodo que for anotado
    private String variavel;

    public void imprimirVariavel(){
        System.out.println(variavel);
    }
}
