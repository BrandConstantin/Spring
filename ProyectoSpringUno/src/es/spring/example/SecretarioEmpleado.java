package es.spring.example;

public class SecretarioEmpleado implements Empleados {
	//creación de campo tipo creacionInforme (intefaz)
	private CreacionInformes informeNuevo;

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de los Jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el Secretario de Estado " + informeNuevo.getInforme();
	}

}
