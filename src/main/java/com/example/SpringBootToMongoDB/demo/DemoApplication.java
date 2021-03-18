package com.example.SpringBootToMongoDB.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//en vez de @configuration @EnableAutoConfiguration y @ComponentScan así no se llena
//de anotaciones
//@Configuration, indica que la clase en la que se encuentra contiene
// la configuración principal del proyecto.
//@EnableAutoConfiguration indica que se aplicará la configuración automática del starter que hemos utilizado.
// @ComponentScan, ayuda a localizar elementos etiquetados con otras anotaciones cuando sean necesarios.
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
