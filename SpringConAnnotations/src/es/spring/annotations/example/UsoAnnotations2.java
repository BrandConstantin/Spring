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
		Empleados Antonio = contexto.getBean("ComercialExperimentadoID", Empleados.class);
		Empleados Lucia = contexto.getBean("ComercialExperimentadoID", Empleados.class);
		
		// apuntan al mismo objeto en memoria ?
		if(Antonio == Lucia) {
			System.out.println(Antonio + "\n" + Lucia);
		}else {
			System.out.println(Antonio + "\n" + Lucia);
			System.out.println("No apunta en la misma dirección de memoria");
		}
		
		contexto.close();
	}

}
