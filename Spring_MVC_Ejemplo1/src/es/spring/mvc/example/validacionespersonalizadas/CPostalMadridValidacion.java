package es.spring.mvc.example.validacionespersonalizadas;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPostalMadridValidacion implements ConstraintValidator<CPostalMadrid, String>{
	@Override
	public void initialize(CPostalMadrid elCodigo) {
		prefijoCodigoMadrid = elCodigo.value();
	}

	@Override
	public boolean isValid(String codigoPostalEnviado, ConstraintValidatorContext arg1) {
		boolean validarCodigo;
		
		if(codigoPostalEnviado != null) {
			validarCodigo = codigoPostalEnviado.startsWith(prefijoCodigoMadrid);
		}else {
			return validarCodigo = true;
		}
		return validarCodigo;
	}

	private String prefijoCodigoMadrid;
}
