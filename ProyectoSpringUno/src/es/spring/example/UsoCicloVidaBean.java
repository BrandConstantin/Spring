package es.spring.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// cargar el xml de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		// obtención del bean
		Empleados Juan = contexto.getBean("miEmpleado", Empleados.class);	
		
		// ante de darme el informe ejecuta las tareas espeficifadas
		System.out.println(Juan.getInforme());
		// luego ejecuta las tareas después de generar el informe
		
		//cerrar el contexto
		contexto.close();
	}

}
