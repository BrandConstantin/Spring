package es.spring.example;

public class JefeEmpleado implements Empleados {
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	//creación de campo tipo creacionInforme (intefaz)
	private CreacionInformes informeNuevo;
	
	//creación de constructor que inyecta la dependencia
	
	
	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados de sección";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe con rectificaciones: " + informeNuevo.getInforme();
	}

}
