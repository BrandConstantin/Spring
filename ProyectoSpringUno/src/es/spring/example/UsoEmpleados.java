package es.spring.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// creación de objetos de tipo empleado
//		Empleados Empleado1 = new JefeEmpleado();
//		Empleados Empleado2 = new SecretarioEmpleado();
//		Empleados Empleado3 = new DirectorEmpleado();
		
		// uso de los objetos creados
//		System.out.println(Empleado1.getTareas());
//		System.out.println(Empleado2.getTareas());
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);		
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		
		Empleados Maria = contexto.getBean("miSecretarioEmpleado", Empleados.class);
		System.out.println("Maria: " + Maria.getTareas());
		System.out.println("Maria: " + Maria.getInforme());
		
		contexto.close();
	}

}
