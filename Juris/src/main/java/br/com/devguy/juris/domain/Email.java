/**
 * 
 */
package br.com.devguy.juris.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import br.com.devguy.juris.exceptions.EmailInvalidoException;

/**
 * @author Guylerme
 *
 */
public class Email extends Contato {
	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) throws EmailInvalidoException {
		if (validarEmail(email))
			this.email = email;
		else
			throw new EmailInvalidoException();

	}

	private boolean validarEmail(String email) {
		boolean isEmailIdValid = false;
		if (email != null && email.length() > 0) {
			String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
			Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				isEmailIdValid = true;
			}
		}
		return isEmailIdValid;
	}
}
