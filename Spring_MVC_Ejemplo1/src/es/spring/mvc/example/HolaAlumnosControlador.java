package es.spring.mvc.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaAlumnosControlador {
	
	@RequestMapping("/muestraFormularioUrl") //especificamos la url que el usuario utilizará para devolver el formulario
	public String muestraFormulario() { //proporciona el formulario
		return "HolaAlumnosFormulario";
	}
	
	@RequestMapping("procesarFormularioUrl")
	public String procesarFormulario() { // método que procesa lo que metemos en el formulario
		return "HolaAlumnosSpring"; 		
	}
}
