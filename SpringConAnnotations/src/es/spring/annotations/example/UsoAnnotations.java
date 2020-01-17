package es.spring.annotations.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// leer el xml de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// pedir un bean al contenedor
		Empleados Antonio = contexto.getBean("ComercialExperimentadoID", Empleados.class);
		
		// usar el bean
		System.out.println(Antonio.getInformes());
		System.out.println(Antonio.getTareas());
		
		// cerrar el contexto
		contexto.close();
	}
}
