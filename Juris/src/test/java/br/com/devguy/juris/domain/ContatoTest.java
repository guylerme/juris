/**
 * 
 */
package br.com.devguy.juris.domain;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.devguy.juris.domain.enumerators.TipoContato;

/**
 * @author Guylerme
 *
 */
public class ContatoTest {

	/**
	 * Test method for {@link br.com.devguy.juris.domain.Contato#getId()}.
	 */
	@Test
	public void testGetId() {
		System.out.println("testing getId on Contato");
		double id = 76;
		Contato contato = new Contato();
		contato.setId(id);

		double result = contato.getId();

		assertEquals(id, result, 0.001);
	}

	/**
	 * Test method for {@link br.com.devguy.juris.domain.Contato#setId(double)}.
	 */
	@Test
	public void testSetId() {
		System.out.println("testing setId on Contato");
		double id = 76;
		Contato contato = new Contato();
		contato.setId(id);

		assertEquals(id, contato.getId(), 0.001);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Contato#getTipoContato()}.
	 */
	@Test
	public void testGetTipoContato() {
		System.out.println("testing getTipoContato on Contato");
		Contato contato = new Contato();
		contato.setTipoContato(TipoContato.C);

		TipoContato result = contato.getTipoContato();

		assertEquals(TipoContato.C, result);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Contato#setTipoContato(char)}.
	 */
	@Test
	public void testSetTipoContato() {
		System.out.println("testing setTipoContato on Contato");
		Contato contato = new Contato();
		contato.setTipoContato(TipoContato.C);

		assertEquals(TipoContato.C, contato.getTipoContato());
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Contato#getObservacao()}.
	 */
	@Test
	public void testGetObservacao() {
		System.out.println("testing getObservacao on Contato");
		String obs = "Observacao";
		Contato contato = new Contato();
		contato.setObservacao(obs);

		String result = contato.getObservacao();

		assertEquals(obs, result);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Contato#setObservacao(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetObservacao() {
		System.out.println("testing setObservacao on Contato");
		String obs = "Observacao";
		Contato contato = new Contato();
		contato.setObservacao(obs);

		assertEquals(obs, contato.getObservacao());
	}

}
