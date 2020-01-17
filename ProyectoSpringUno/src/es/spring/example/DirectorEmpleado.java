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
	
	// método init. Ejecutar tareas antes de que el bean esté disponible
	// normalmente los métodos init son void
	public void metodoInicial() {
		System.out.println("Dentro del método init. Aquí irían las tareas a ejecutar " + 
				"antes de que el init esté listo");
	}
	
	// método destroy. Ejecutar tareas desués de que el vean haya sido utilizado
	public void metodoFinal() {
		System.out.println("Dentro del método destroy. Aquí irían las tareas a ejecutar " + 
				"después de utilizar el bean");
	}
}
