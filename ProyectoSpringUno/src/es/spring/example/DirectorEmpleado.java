package es.spring.example;

public class DirectorEmpleado implements Empleados {
	//creación de campo tipo creacionInforme (intefaz)
	private CreacionInformes informeNuevo;
	
	//creación de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informenuevo) {
		this.informeNuevo = informenuevo;
	}

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestiono la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director " + informeNuevo.getInforme();
	}

}
