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
		
		JefeEmpleado Juan = contexto.getBean("miEmpleado", JefeEmpleado.class);		
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		System.out.println(Juan.getEmail() + " - " + Juan.getNombreEmpresa());
		
		SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		System.out.println("Maria: " + Maria.getTareas());
		System.out.println("Maria: " + Maria.getInforme());
		System.out.println(Maria.getEmail() + " - " + Maria.getNombreEmpresa());
		
		contexto.close();
	}

}
