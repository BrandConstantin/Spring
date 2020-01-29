package es.spring.mvc.example;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Negative;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import es.spring.mvc.example.validacionespersonalizadas.CPostalMadrid;

public class Alumno {
	@NotNull
	@Size(min=2, message=" Campo requerido!")
	private String nombre;
	private String apellido;
	private String optativa;
	private String ciudadEstudios;
	private String idioma;
	@NotNull
	@Min(value=16, message="El alumno no puede ser menor de 16 años")
	@Max(value=65, message="No se acceptan personas jubiladas")
	private int edad;
	@Email
	@NotBlank(message="El campo no puede estar vacio!")
	private String email;
	@NotNull
	//@Pattern(regexp="[0-9]{5}", message="El CP solo puede tener 5 números")
	@CPostalMadrid
	private String codigoPostal;
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getOptativa() {
		return optativa;
	}
	public void setOptativa(String optativa) {
		this.optativa = optativa;
	}
	public String getCiudadEstudios() {
		return ciudadEstudios;
	}
	public void setCiudadEstudios(String ciudadEstudios) {
		this.ciudadEstudios = ciudadEstudios;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}	
}
