/**
 * 
 */
package br.com.devguy.juris.domain;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author Guylerme
 *
 */
public class MunicipioTest {

	/**
	 * Test method for {@link br.com.devguy.juris.domain.Municipio#getCodigo()}.
	 */
	@Test
	public void testGetCodigo() {
		System.out.println("testing getCodigo on Municipio");
		double codigo = 15665;
		Municipio municipio = new Municipio();
		municipio.setCodigo(codigo);

		double result = municipio.getCodigo();

		assertEquals(codigo, result, 0.001);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Municipio#setCodigo(double)}.
	 */
	@Test
	public void testSetCodigo() {
		System.out.println("testing setCodigo on Municipio");
		double codigo = 15665;
		Municipio municipio = new Municipio();
		municipio.setCodigo(codigo);

		assertEquals(municipio.getCodigo(), codigo, 0.001);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Municipio#getCodigoCompleto()}.
	 */
	@Test
	public void testGetCodigoCompleto() {
		System.out.println("testing getCodigoCompleto on Municipio");
		double codigo = 15665;
		Municipio municipio = new Municipio();
		municipio.setCodigoCompleto(codigo);

		double result = municipio.getCodigoCompleto();

		assertEquals(codigo, result, 0.001);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Municipio#setCodigoCompleto(double)}.
	 */
	@Test
	public void testSetCodigoCompleto() {
		System.out.println("testing setCodigoCompleto on Municipio");
		double codigo = 15665;
		Municipio municipio = new Municipio();
		municipio.setCodigoCompleto(codigo);

		assertEquals(municipio.getCodigoCompleto(), codigo, 0.001);
	}

	/**
	 * Test method for {@link br.com.devguy.juris.domain.Municipio#getNome()}.
	 */
	@Test
	public void testGetNome() {
		System.out.println("testing getNome on Municipio");
		String nome = "Bom Jesus";
		Municipio municipio = new Municipio();
		municipio.setNome(nome);

		String result = municipio.getNome();

		assertEquals(nome, result);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Municipio#setNome(java.lang.String)}.
	 */
	@Test
	public void testSetNome() {
		System.out.println("testing setNome on Municipio");
		String nome = "Bom Jesus";
		Municipio municipio = new Municipio();
		municipio.setNome(nome);

		assertEquals(municipio.getNome(), nome);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Municipio#getLogradouros()}.
	 */
	@Test
	public void testGetLogradouros() {
		System.out.println("testing getLogradouros on Municipio");
		Logradouro logradouro = new Logradouro();
		logradouro.setId(0056);
		logradouro.setLogradouro("São Paulo");

		List<Logradouro> logradouros = new ArrayList<Logradouro>();
		logradouros.add(logradouro);

		Municipio municipio = new Municipio();
		municipio.setLogradouros(logradouros);

		List<Logradouro> result = municipio.getLogradouros();

		assertEquals(result, logradouros);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Municipio#setLogradouros(java.util.List)}
	 * .
	 */
	@Test
	public void testSetLogradouros() {
		System.out.println("testing setLogradouros on Municipio");
		Logradouro logradouro = new Logradouro();
		logradouro.setId(0056);
		logradouro.setLogradouro("São Paulo");

		List<Logradouro> logradouros = new ArrayList<Logradouro>();
		logradouros.add(logradouro);

		Municipio municipio = new Municipio();
		municipio.setLogradouros(logradouros);

		assertEquals(municipio.getLogradouros(), logradouros);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Municipio#addLogradouro(br.com.devguy.juris.domain.Logradouro)}
	 * .
	 */
	@Test
	public void testAddLogradouro() {
		System.out.println("testing addLogradouro on Municipio");
		Logradouro logradouro = new Logradouro();
		logradouro.setId(0056);
		logradouro.setLogradouro("São Paulo");

		List<Logradouro> logradouros = new ArrayList<Logradouro>();
		logradouros.add(logradouro);

		Municipio municipio = new Municipio();
		municipio.setLogradouros(logradouros);

		assertEquals(municipio.getLogradouro(0056), logradouro);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Municipio#getLogradouro(double)}.
	 */
	@Test
	public void testGetLogradouro() {
		System.out.println("testing addLogradouro on Municipio");
		Logradouro logradouro = new Logradouro();
		logradouro.setId(0056);
		logradouro.setLogradouro("São Paulo");

		List<Logradouro> logradouros = new ArrayList<Logradouro>();
		logradouros.add(logradouro);

		Municipio municipio = new Municipio();
		municipio.setLogradouros(logradouros);

		Logradouro result = municipio.getLogradouro(0056);

		assertEquals(result, logradouro);
	}

}
