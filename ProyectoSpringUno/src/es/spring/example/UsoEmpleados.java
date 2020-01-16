package es.spring.example;

public class UsoEmpleados {

	public static void main(String[] args) {
		// creación de objetos de tipo empleado
		Empleados Empleado1 = new JefeEmpleado();
		Empleados Empleado2 = new SecretarioEmpleado();
		Empleados Empleado3 = new DirectorEmpleado();
		
		// uso de los objetos creados
		System.out.println(Empleado1.getTareas());
		System.out.println(Empleado2.getTareas());
	}

}
