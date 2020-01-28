package es.spring.mvc.example;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@RequestMapping("procesarFormularioModelo")
	//public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo) {
		// inyecctar información al modelo
		//String nombre = request.getParameter("nombreAlumno");
		nombre += " es el mejor alumno";
		
		String respuesta = "¿Quién es el mejor alumno? " + nombre;
		
		// agregando info al modelo
		modelo.addAttribute("mensajeFinal", respuesta);
		
		return "HolaAlumnosSpring"; 		
	}
}
