/**
 * 
 */
package br.com.devguy.juris.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import br.com.devguy.juris.domain.enumerators.TipoTelefone;
import br.com.devguy.juris.exceptions.DDDInvalidoException;
import br.com.devguy.juris.exceptions.NumeroTelefoneInvalidoException;

/**
 * @author Guylerme
 *
 */
public class TelefoneTest {

	/**
	 * Test method for {@link br.com.devguy.juris.domain.Telefone#getDdd()}.
	 */
	@Test
	public void testGetDdd() {
		System.out.println("testing getDdd on Telefone");
		int ddd = 11;
		Telefone telefone = new Telefone();
		try {
			telefone.setDdd(ddd);
		} catch (DDDInvalidoException e) {
			fail("DDD Invalido");
		}

		double result = telefone.getDdd();

		assertEquals(ddd, result, 0.001);
	}

	/**
	 * Test method for {@link br.com.devguy.juris.domain.Telefone#setDdd(int)}.
	 */
	@Test
	public void testSetDdd() {
		System.out.println("testing setDdd on Telefone");
		int ddd = 11;
		Telefone telefone = new Telefone();
		try {
			telefone.setDdd(ddd);
		} catch (DDDInvalidoException e) {
			fail("DDD Invalido");
		}

		assertEquals(ddd, telefone.getDdd(), 0.001);
	}

	/**
	 * Test method for {@link br.com.devguy.juris.domain.Telefone#getNumero()}.
	 */
	@Test
	public void testGetNumero() throws DDDInvalidoException {
		System.out.println("testing getNumero on Telefone");
		int numero = 930290102;
		Telefone telefone = new Telefone();
		try {
			telefone.setNumero(numero);
		} catch (NumeroTelefoneInvalidoException e) {
			fail("Numero Telefone Invalido");
		}

		double result = telefone.getNumero();

		assertEquals(numero, result, 0.001);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Telefone#getNumeroCompleto()}.
	 */
	@Test
	public void testGetNumeroCompleto() {
		System.out.println("testing getNumero on Telefone");
		int ddd = 22;
		int numero = 930290102;
		Telefone telefone = new Telefone();
		try {
			telefone.setDdd(ddd);
			telefone.setNumero(numero);
		} catch (NumeroTelefoneInvalidoException e) {
			fail("Numero Telefone Invalido");
		} catch (DDDInvalidoException e) {
			fail("DDD Invalido");
		}

		String result = telefone.getNumeroCompleto();

		String esperado = "(22)93029-0102";

		assertEquals(esperado, result);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Telefone#setNumero(double)}.
	 */
	@Test
	public void testSetNumero() {
		System.out.println("testing setNumero on Telefone");
		int numero = 930290102;
		Telefone telefone = new Telefone();
		try {
			telefone.setNumero(numero);
		} catch (NumeroTelefoneInvalidoException e) {
			fail("Numero Telefone Invalido");
		}

		assertEquals(numero, telefone.getNumero(), 0.001);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Telefone#getTipoTelefone()}.
	 */
	@Test
	public void testGetTipoTelefone() {
		System.out.println("testing getTipoTelefone on Telefone");
		Telefone telefone = new Telefone();
		telefone.setTipoTelefone(TipoTelefone.C);

		TipoTelefone result = telefone.getTipoTelefone();

		assertEquals(TipoTelefone.C, result);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Telefone#setTipoTelefone(br.com.devguy.juris.domain.enumerators.TipoTelefone)}
	 * .
	 */
	@Test
	public void testSetTipoTelefone() {
		System.out.println("testing getTipoTelefone on Telefone");
		Telefone telefone = new Telefone();
		telefone.setTipoTelefone(TipoTelefone.C);

		assertEquals(TipoTelefone.C, telefone.getTipoTelefone());
	}

}
