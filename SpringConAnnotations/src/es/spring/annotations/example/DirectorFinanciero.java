package es.spring.annotations.example;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {
	private CreacionInformeFinanciero informeFinanciero;

	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}

	@Override
	public String getTareas() {
		return "Gestión y dirección de las operaciones financieras de la empresa";
	}

	@Override
	public String getInformes() {
		return informeFinanciero.getInformeFinanciero();
	}

	@Value("${email}")
	private String emailV;
	@Value("${nombreEmpresa}")
	private String nombreEmpresaV;

	public String getEmailV() {
		return emailV;
	}

	public String getNombreEmpresaV() {
		return nombreEmpresaV;
	}
	
	
}
