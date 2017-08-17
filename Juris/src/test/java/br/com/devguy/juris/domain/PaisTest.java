/**
 * 
 */
package br.com.devguy.juris.domain;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.devguy.juris.exceptions.SiglaPaisInvalidaException;
import br.com.devguy.juris.exceptions.SiglaUFInvalidaException;

/**
 * @author Guylerme
 *
 */
public class PaisTest {

	/**
	 * Test method for {@link br.com.devguy.juris.domain.Pais#getCodigo()}.
	 */

	@Test
	public void testGetCodigo() {
		System.out.println("testing getCodigo on Pais");
		double codigo = 76;
		Pais pais = new Pais();
		pais.setCodigo(codigo);

		double result = pais.getCodigo();

		assertEquals(codigo, result, 0.001);
	}

	/**
	 * Test method for {@link br.com.devguy.juris.domain.Pais#setCodigo(double)}
	 * .
	 */

	@Test
	public void testSetCodigo() {
		System.out.println("testing setCodigo on Pais");
		double codigo = 76;
		Pais pais = new Pais();
		pais.setCodigo(codigo);

		assertEquals(pais.getCodigo(), codigo, 0.001);
	}

	/**
	 * Test method for {@link br.com.devguy.juris.domain.Pais#getSigla()}.
	 */
	@Test
	public void testGetSigla() {
		System.out.println("testing getSigla on Pais");
		String sigla = "BRA";
		Pais pais = new Pais();
		try {
			pais.setSigla(sigla);
		} catch (SiglaPaisInvalidaException e) {
			fail("Sigla invalida");
		}

		String result = pais.getSigla();

		assertEquals(sigla, result);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Pais#setSigla(java.lang.String)}.
	 */
	@Test
	public void testSetSigla() {
		System.out.println("testing setSigla on Pais");
		String sigla = "BRA";
		Pais pais = new Pais();
		try {
			pais.setSigla(sigla);
		} catch (SiglaPaisInvalidaException e) {
			fail("Sigla invalida");
		}

		assertEquals(pais.getSigla(), sigla);
	}

	/**
	 * Test method for {@link br.com.devguy.juris.domain.Pais#getNome()}.
	 */
	@Test
	public void testGetNome() {
		System.out.println("testing getNome on Pais");
		String nome = "Brasil";
		Pais pais = new Pais();
		pais.setNome(nome);

		String result = pais.getNome();

		assertEquals(nome, result);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Pais#setNome(java.lang.String)}.
	 */

	@Test
	public void testSetNome() {
		System.out.println("testing setNome on Pais");
		String nome = "Brasil";
		Pais pais = new Pais();
		pais.setNome(nome);

		assertEquals(pais.getNome(), nome);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Pais#getUnidadesFederativas()}.
	 */
	@Test
	public void testGetUnidadesFederativas() {

		System.out.println("testing getUnidades Federativas on Pais");
		UnidadeFederativa uf = new UnidadeFederativa();
		uf.setCodigo(11);
		try {
			uf.setSigla("SP");
		} catch (SiglaUFInvalidaException e) {
			fail("Sigla da UF invalida");
		}
		uf.setNome("São Paulo");

		List<UnidadeFederativa> ufs = new ArrayList<UnidadeFederativa>();
		ufs.add(uf);

		Pais pais = new Pais();
		pais.setUnidadesFederativas(ufs);

		List<UnidadeFederativa> result = pais.getUnidadesFederativas();

		assertEquals(result, ufs);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Pais#setUnidadesFederativas(java.util.List)}
	 * .
	 */
	@Test
	public void testSetUnidadesFederativas() {
		System.out.println("testing setUnidades Federativas on Pais");
		UnidadeFederativa uf = new UnidadeFederativa();
		uf.setCodigo(11);
		try {
			uf.setSigla("SP");
		} catch (SiglaUFInvalidaException e) {
			fail("Sigla da UF invalida");
		}
		uf.setNome("São Paulo");

		List<UnidadeFederativa> ufs = new ArrayList<UnidadeFederativa>();
		ufs.add(uf);

		Pais pais = new Pais();
		pais.setUnidadesFederativas(ufs);

		assertEquals(pais.getUnidadesFederativas(), ufs);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Pais#addUnidadeFederativa(br.com.devguy.juris.domain.UnidadeFederativa)}
	 * .
	 */
	@Test
	public void testAddUnidadeFederativa() {
		System.out.println("testing addUnidadeFederativa on Pais");
		UnidadeFederativa uf = new UnidadeFederativa();
		uf.setCodigo(11);
		try {
			uf.setSigla("SP");
		} catch (SiglaUFInvalidaException e) {
			fail("Sigla da UF invalida");
		}
		uf.setNome("São Paulo");

		List<UnidadeFederativa> ufs = new ArrayList<UnidadeFederativa>();
		ufs.add(uf);

		Pais pais = new Pais();
		pais.setUnidadesFederativas(ufs);

		assertEquals(pais.getUnidadeFederativa(11), uf);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.Pais#getUnidadeFederativa(double)}.
	 */
	@Test
	public void testGetUnidadeFederativa() {
		System.out.println("testing getUnidade Federativa on Pais");
		UnidadeFederativa uf = new UnidadeFederativa();
		uf.setCodigo(11);
		try {
			uf.setSigla("SP");
		} catch (SiglaUFInvalidaException e) {
			fail("Sigla da UF invalida");
		}
		uf.setNome("São Paulo");

		List<UnidadeFederativa> ufs = new ArrayList<UnidadeFederativa>();
		ufs.add(uf);

		Pais pais = new Pais();
		pais.setUnidadesFederativas(ufs);

		UnidadeFederativa result = pais.getUnidadeFederativa(11);

		assertEquals(result, uf);
	}

}
