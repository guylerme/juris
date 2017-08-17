/**
 * 
 */
package br.com.devguy.juris.domain;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.devguy.juris.exceptions.CEPInvalidoException;

/**
 * @author Guylerme
 *
 */
public class LogradouroTest {

	/**
	 * Test method for {@link br.com.devguy.juris.domain.Logradouro#getId()}.
	 */
	@Test
	public void testGetId() {
		System.out.println("testing getId on Logradouro");
		double id = 76;
		Logradouro logradouro = new Logradouro();
		logradouro.setId(id);

		double result = logradouro.getId();

		assertEquals(id, result, 0.001);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Logradouro#setId(double)}.
	 */
	@Test
	public void testSetId() {
		System.out.println("testing getId on Logradouro");
		double id = 76;
		Logradouro logradouro = new Logradouro();
		logradouro.setId(id);

		assertEquals(id, logradouro.getId(), 0.001);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Logradouro#getLogradouro()}.
	 */
	@Test
	public void testGetLogradouro() {
		System.out.println("testing getLogradouro on Logradouro");
		String l = "Reta da Penha";
		Logradouro logradouro = new Logradouro();
		logradouro.setLogradouro(l);

		String result = logradouro.getLogradouro();

		assertEquals(l, result);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Logradouro#setLogradouro(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetLogradouro() {
		System.out.println("testing setLogradouro on Logradouro");
		String l = "Reta da Penha";
		Logradouro logradouro = new Logradouro();
		logradouro.setLogradouro(l);

		assertEquals(l, logradouro.getLogradouro());
	}

	/**
	 * Test method for {@link br.com.devguy.juris.domain.Logradouro#getNumero()}
	 * .
	 */
	@Test
	public void testGetNumero() {
		System.out.println("testing getNumero on Logradouro");
		int numero = 12;
		Logradouro logradouro = new Logradouro();
		logradouro.setNumero(numero);

		int result = logradouro.getNumero();

		assertEquals(numero, result);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Logradouro#setNumero(int)}.
	 */
	@Test
	public void testSetNumero() {
		System.out.println("testing setNumero on Logradouro");
		int numero = 12;
		Logradouro logradouro = new Logradouro();
		logradouro.setNumero(numero);

		assertEquals(numero, logradouro.getNumero());
	}

	/**
	 * Test method for {@link br.com.devguy.juris.domain.Logradouro#getCep()}.
	 */
	@Test
	public void testGetCep() {
		System.out.println("testing getCep on Logradouro");
		int numero = 29102998;
		Logradouro logradouro = new Logradouro();
		try {
			logradouro.setCep(numero);
		} catch (CEPInvalidoException e) {
			fail("CEP inválido");
		}

		int result = logradouro.getCep();

		assertEquals(numero, result);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Logradouro#getCepToString()}.
	 */
	@Test
	public void testGetCepToString() {
		System.out.println("testing getCepToString on Logradouro");
		int numero = 29102998;
		Logradouro logradouro = new Logradouro();
		try {
			logradouro.setCep(numero);
		} catch (CEPInvalidoException e) {
			fail("CEP inválido");
		}

		String result = "29102-998";

		assertEquals(result, logradouro.getCepToString());
	}

	/**
	 * Test method for {@link br.com.devguy.juris.domain.Logradouro#setCep(int)}
	 * .
	 */
	@Test
	public void testSetCep() {
		System.out.println("testing setCep on Logradouro");
		int numero = 29102998;
		Logradouro logradouro = new Logradouro();
		try {
			logradouro.setCep(numero);
		} catch (CEPInvalidoException e) {
			fail("CEP inválido");
		}

		assertEquals(numero, logradouro.getCep());
	}

	/**
	 * Test method for {@link br.com.devguy.juris.domain.Logradouro#getBairro()}
	 * .
	 */
	@Test
	public void testGetBairro() {
		System.out.println("testing getBairro on Logradouro");
		String l = "Praia do Canto";
		Logradouro logradouro = new Logradouro();
		logradouro.setBairro(l);

		String result = logradouro.getBairro();

		assertEquals(l, result);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Logradouro#setBairro(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetBairro() {
		System.out.println("testing setBairro on Logradouro");
		String l = "Praia do Canto";
		Logradouro logradouro = new Logradouro();
		logradouro.setBairro(l);

		assertEquals(l, logradouro.getBairro());
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Logradouro#getComplemento()}.
	 */
	@Test
	public void testGetComplemento() {
		System.out.println("testing getComplemento on Logradouro");
		String l = "Apto 100";
		Logradouro logradouro = new Logradouro();
		logradouro.setComplemento(l);

		String result = logradouro.getComplemento();

		assertEquals(l, result);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Logradouro#setComplemento(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetComplemento() {
		System.out.println("testing setComplemento on Logradouro");
		String l = "Apto 100";
		Logradouro logradouro = new Logradouro();
		logradouro.setComplemento(l);

		assertEquals(l, logradouro.getComplemento());
	}

}
