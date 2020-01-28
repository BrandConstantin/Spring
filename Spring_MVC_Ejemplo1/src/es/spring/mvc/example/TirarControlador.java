package es.spring.mvc.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/segundario")
public class TirarControlador {
	@RequestMapping("procesarFormularioModelo")
	//public String otroProcesoFormulario(HttpServletRequest request, Model modelo) {
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre, Model modelo) {
		// inyecctar información al modelo
		//String nombre = request.getParameter("nombreAlumno");
		nombre += " es el peor alumno";
		
		String respuesta = "¿Quién es el peor alumno? " + nombre;
		
		// agregando info al modelo
		modelo.addAttribute("mensajeFinal", respuesta);
		
		return "HolaAlumnosSpring"; 		
	}
}
