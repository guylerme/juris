/**
 * 
 */
package br.com.devguy.juris.domain;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.devguy.juris.exceptions.EmailInvalidoException;

/**
 * @author Guylerme
 *
 */
public class EmailTest {

	/**
	 * Test method for {@link br.com.devguy.juris.domain.Email#getEmail()}.
	 */
	@Test
	public void testGetEmail() {
		System.out.println("testing getEmail on Email");
		String email = "teste@teste.com";
		Email email1 = new Email();
		try {
			email1.setEmail(email);
		} catch (EmailInvalidoException e) {
			fail("Email Invalido");
		}

		String result = email1.getEmail();

		assertEquals(email, result);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Email#setEmail(java.lang.String)}.
	 */
	@Test
	public void testSetEmail() {
		System.out.println("testing setEmail on Email");
		String email = "teste@teste.com";
		Email email1 = new Email();
		try {
			email1.setEmail(email);
		} catch (EmailInvalidoException e) {
			fail("Email Invalido");
		}

		assertEquals(email1.getEmail(), email);
	}

}
