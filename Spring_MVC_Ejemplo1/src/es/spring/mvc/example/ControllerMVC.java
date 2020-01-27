package es.spring.mvc.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerMVC {
	
	@RequestMapping
	public String muestraPagina() {
		return "paginaEjemplo";
	}
}
