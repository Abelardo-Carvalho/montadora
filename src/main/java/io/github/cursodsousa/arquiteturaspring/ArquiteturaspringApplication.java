package io.github.cursodsousa.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties //Permite que seja criada classes para guardar configurações do propties ou yml
public class ArquiteturaspringApplication {

	public static void main(String[] args) {

		//SpringApplication.run(ArquiteturaspringApplication.class, args);
		SpringApplicationBuilder builder =
				new SpringApplicationBuilder(ArquiteturaspringApplication.class);

		builder.bannerMode(Banner.Mode.OFF);
		builder.profiles("producao", "homologacao");
//		builder.lazyInitialization(true);

		builder.run(args);


		// contexto da aplicação já iniciada:
		ConfigurableApplicationContext applicationContext = builder.context();
//		var produtoRepository = applicationContext.getBean("produtoRepository");


		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		String applicationName = environment.getProperty("spring.application.name");
		System.out.println("Nome da aplicação: " + applicationName);

		ExemploValue value = applicationContext.getBean(ExemploValue.class);
		value.imprimirVariavel();

		AppProperties properties = applicationContext.getBean(AppProperties.class);
		System.out.println(properties.getValor1());
	}


}
