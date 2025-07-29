package io.github.cursodsousa.arquiteturaspring.montadora.api;

import io.github.cursodsousa.arquiteturaspring.montadora.CarroStatus;
import io.github.cursodsousa.arquiteturaspring.montadora.Chave;
import io.github.cursodsousa.arquiteturaspring.montadora.HondaHRV;
import io.github.cursodsousa.arquiteturaspring.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carro")
public class TesteFabricaController {

    @Autowired
    @Aspirado //Essa anotation foi criada para indicar qual bean utilizar para motor. Dentro dela foi especificado o Qualifier que linka com a config desse bean//@Qualifier("motorEletrico") //Serve para especificar qual dos bens da configuration deve utilizar
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro (@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}
