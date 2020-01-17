package es.spring.annotations.example;

import org.springframework.stereotype.Component;

@Component("ComercialExperimentadoID")
public class ComercialExperimentado implements Empleados {

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender más!";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe generado por el comercial con experiencia.";
	}

}
