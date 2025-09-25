package io.github.cursodsousa.arquiteturaspring.todos;

import io.github.cursodsousa.arquiteturaspring.AppProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ConfiguracaoAcessoEmail {

    @Autowired
    private AppProperties properties;

   // @Bean
    public MailSender enviarEmail (){
        return null;
    }


}
