package es.spring.mvc.example.validacionespersonalizadas;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy=CPostalMadridValidacion.class) //futura clase que contendrá la lógica de la validación
@Target({ElementType.METHOD, ElementType.FIELD}) //destino de nuestra validación a métodos o campos
@Retention(RetentionPolicy.RUNTIME) //cuando se chequea la validación? en este caso en tiempo de ejecución
public @interface CPostalMadrid {
	//definir el cp por defecto
	public String value() default "28";
	
	//definir el mensaje de error
	public String message() default "El código postal debe comenzar por 28";
	
	//definir los grupos
	Class<?>[] groups() default {};
	
	//definir los payloads
	Class<? extends Payload>[] payload() default {};
}
