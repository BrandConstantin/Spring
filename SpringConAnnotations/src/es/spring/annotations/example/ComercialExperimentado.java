package es.spring.annotations.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentadoID")
public class ComercialExperimentado implements Empleados {
	
	// ejecución de  código después de creación del Bean
	@PostConstruct
	public void ejecutaDespuesCreacion() {
		System.out.println("Ejecutado tras la creación del Bean");
	}
	
	// ejecución de código después de de apagado contenedor Spring
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutando antes de la destrución");
	}
	
	public ComercialExperimentado() {
		
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender más!";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return nuevoInforme.getInformeFinanciero();
	}

	@Autowired
	@Qualifier("informeFinancieroTrim3")
	private CreacionInformeFinanciero nuevoInforme;

//	@Autowired
//	public void setNuevoInforme(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}

//	@Autowired
//	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
//		this.nuevoInforme = nuevoInforme;
//	}
	
	
}
