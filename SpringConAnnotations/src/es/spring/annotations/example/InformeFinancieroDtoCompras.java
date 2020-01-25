package es.spring.annotations.example;

public class InformeFinancieroDtoCompras implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Informe financiero del departamento de compras año 2020";
	}

}
