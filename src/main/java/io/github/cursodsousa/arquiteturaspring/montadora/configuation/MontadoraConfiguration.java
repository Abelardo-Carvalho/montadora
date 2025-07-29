package io.github.cursodsousa.arquiteturaspring.montadora.configuation;

import io.github.cursodsousa.arquiteturaspring.montadora.Motor;
import io.github.cursodsousa.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    //@Primary //Serve para indicar que esse é o bean para ser utilizado quando não for especificado na inicialização atravez do @Qualifier
    @Bean(name = "motorAspirado")
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindos(4);
        motor.setModelo("XPTO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(110);
        motor.setCilindos(3);
        motor.setModelo("TH-40");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Primary
    @Bean(name = "motorTurbo")
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(180);
        motor.setCilindos(4);
        motor.setModelo("XPTO-01");
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
}
