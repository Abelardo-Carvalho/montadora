package io.github.cursodsousa.arquiteturaspring;

import io.github.cursodsousa.arquiteturaspring.todos.TodoEntity;
import io.github.cursodsousa.arquiteturaspring.todos.TodoRepository;
import io.github.cursodsousa.arquiteturaspring.todos.TodoValidator;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
//@Scope ("singleton") Padrão! Define que o Bean será instacioado apenas uma vez e vai servir a todos
//@Scope(BeanDefinition.SCOPE_SINGLETON) Também pode ser definido assim
//@Scope ("request") Guarda estado, só existe enquanto for realizada uma requisição
//@Scope (WebApplicationContext.SCOPE_REQUEST) Também pode ser definido assim
//@Scope ("session") Guarda o estado, só existe enquanto um usuário estiver numa sessão
//@Scope ("application") É idêntico ao session, mas serve para todos os usuários, especifico para aplicações web
@Lazy // Atraza a instancia do Bean pra só ser realizada quando solicitada pela aplicação. Não instancia assim que inicializa
@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class BeanGerenciado {

    private String idUsuarioLogado;

    @Autowired
    private TodoValidator validator;

    @Autowired
    public BeanGerenciado(TodoValidator validator) {
        this.validator = validator;
    }

    public void utilizar(){
        var todo = new TodoEntity();
        validator.validar(todo);
    }

    @Autowired
    public void setValidator(TodoValidator validator){
        this.validator = validator;
    }
}
