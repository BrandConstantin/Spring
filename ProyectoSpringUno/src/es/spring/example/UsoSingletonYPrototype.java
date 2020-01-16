package es.spring.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoSingletonYPrototype {

	public static void main(String[] args) {
		// carga de xml de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		// petición de beans al contenedor Spring
		SecretarioEmpleado Maria = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Pedro = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(Maria);
		System.out.println(Pedro);
	}

}
