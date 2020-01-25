package es.spring.annotations.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("es.spring.annotations.example")
public class EmpleadosConfig {
	// definir el bean para InformeFinancieroDtoCompras
	@Bean 
	public CreacionInformeFinanciero informeFinancieroDtoCompras() { //será el id del Bean inyectado
		return new InformeFinancieroDtoCompras();
	}
	
	// definir el bean para DirectorFinanciero e inyectar dependencias
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
}
