package com.josegalvez.josegalvezpizzeria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@EnableEurekaClient
@SpringBootApplication
public class JosegalvezPizzeriaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JosegalvezPizzeriaApplication.class, args);
	}
	
	//Define todo los detalles que tendra la API
			private ApiInfo apiInfo() {
				return new ApiInfoBuilder().title("API de pizzeria")
						.description("La API servira para listar, eliminar, actualizar pizzeria")
						.termsOfServiceUrl("http://josegalvez.com")
						.contact(new Contact("jose galvez", "", "jose@gmail.com"))
						.license("jose galvez")
						.licenseUrl("http://josegalvez.com")
						.version("1.0.0.")
						.build();
			}
		
			//Define la configuración para swagger
			@Bean
			public Docket petApi() {
				return new Docket(DocumentationType.SWAGGER_2)
						.groupName("Evaluacion Final API")
						.apiInfo(apiInfo())
						.select()
						.apis(RequestHandlerSelectors.basePackage("com.josegalvez.josegalvezpizzeria"))
						.paths(PathSelectors.any())
						.build()
						.tags(new Tag("Pizzeria API","Mostrar todas las APIS"));
						
			}

}
