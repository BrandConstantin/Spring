package es.spring.annotations.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// leer el xml de configuración
//		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// leer la nueva clase de configuración
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		// pedir un bean al contenedor
//		Empleados Antonio = contexto.getBean("ComercialExperimentadoID", Empleados.class);
//		Empleados Lucia = contexto.getBean("ComercialExperimentadoID", Empleados.class);
		
		// pedir un bean al contenedor
		Empleados empleado = contexto.getBean("directorFinanciero", Empleados.class);
		
		System.out.println(empleado.getInformes());
		System.out.println(empleado.getTareas());
		
		contexto.close();
	}

}
