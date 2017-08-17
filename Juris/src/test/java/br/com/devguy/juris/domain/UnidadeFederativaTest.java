/**
 * 
 */
package br.com.devguy.juris.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.devguy.juris.exceptions.SiglaUFInvalidaException;

/**
 * @author Guylerme
 *
 */
public class UnidadeFederativaTest {

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.UnidadeFederativa#getCodigo()}.
	 */
	@Test
	public void testGetCodigo() {
		System.out.println("testing getCodigo on Unidade Federativa");
		double codigo = 11;
		UnidadeFederativa uf = new UnidadeFederativa();
		uf.setCodigo(codigo);

		double result = uf.getCodigo();

		assertEquals(codigo, result, 0.001);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.UnidadeFederativa#setCodigo(double)}.
	 */
	@Test
	public void testSetCodigo() {
		System.out.println("testing setCodigo on Unidade Federativa");
		double codigo = 76;
		UnidadeFederativa uf = new UnidadeFederativa();
		uf.setCodigo(codigo);

		assertEquals(uf.getCodigo(), codigo, 0.001);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.UnidadeFederativa#getSigla()}.
	 */
	@Test
	public void testGetSigla() {
		System.out.println("testing getSigla on Unidade Federativa");
		String sigla = "SP";
		UnidadeFederativa uf = new UnidadeFederativa();
		try {
			uf.setSigla(sigla);
		} catch (SiglaUFInvalidaException e) {
			fail("Sigla invalida");
		}

		String result = uf.getSigla();

		assertEquals(sigla, result);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.UnidadeFederativa#setSigla(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetSigla() {
		System.out.println("testing setSigla on Unidade Federativa");
		String sigla = "SP";
		UnidadeFederativa uf = new UnidadeFederativa();
		try {
			uf.setSigla(sigla);
		} catch (SiglaUFInvalidaException e) {
			fail("Sigla invalida");
		}

		assertEquals(uf.getSigla(), sigla);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.UnidadeFederativa#getNome()}.
	 */
	@Test
	public void testGetNome() {
		System.out.println("testing getNome on Unidade Federativa");
		String nome = "São Paulo";
		UnidadeFederativa uf = new UnidadeFederativa();
		uf.setNome(nome);

		String result = uf.getNome();

		assertEquals(nome, result);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.UnidadeFederativa#setNome(java.lang.String)}
	 * .
	 */
	@Test
	public void testSetNome() {
		System.out.println("testing setCodigo on Unidade Federativa");
		String nome = "São Paulo";
		UnidadeFederativa uf = new UnidadeFederativa();
		uf.setNome(nome);

		assertEquals(uf.getNome(), nome);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.UnidadeFederativa#getMunicipios()}.
	 */
	@Test
	public void testGetMunicipios() {
		System.out.println("testing getMunicipios on Unidade Federativa");
		Municipio m = new Municipio();
		m.setCodigo(0056);
		m.setCodigoCompleto(110056);
		m.setNome("São Paulo");

		List<Municipio> ms = new ArrayList<Municipio>();
		ms.add(m);

		UnidadeFederativa uf = new UnidadeFederativa();
		uf.setMunicipios(ms);

		List<Municipio> result = uf.getMunicipios();

		assertEquals(result, ms);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.UnidadeFederativa#setMunicipios(java.util.List)}
	 * .
	 */
	@Test
	public void testSetMunicipios() {
		System.out.println("testing getMunicipios on Unidade Federativa");
		Municipio m = new Municipio();
		m.setCodigo(0056);
		m.setCodigoCompleto(110056);
		m.setNome("São Paulo");

		List<Municipio> ms = new ArrayList<Municipio>();
		ms.add(m);

		UnidadeFederativa uf = new UnidadeFederativa();
		uf.setMunicipios(ms);

		assertEquals(uf.getMunicipios(), ms);

	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.UnidadeFederativa#addMunicipio(br.com.devguy.juris.domain.Municipio)}
	 * .
	 */
	@Test
	public void testAddMunicipio() {
		System.out.println("testing getMunicipios on Unidade Federativa");
		Municipio m = new Municipio();
		m.setCodigo(0056);
		m.setCodigoCompleto(110056);
		m.setNome("São Paulo");

		List<Municipio> ms = new ArrayList<Municipio>();
		ms.add(m);

		UnidadeFederativa uf = new UnidadeFederativa();
		uf.setMunicipios(ms);

		assertEquals(uf.getMunicipio(0056), m);
	}

	/**
	 * Test method for
	 * {@link br.com.devguy.juris.domain.UnidadeFederativa#getMunicipio(double)}
	 * .
	 */
	@Test
	public void testGetMunicipio() {
		System.out.println("testing getMunicipios on Unidade Federativa");
		Municipio m = new Municipio();
		m.setCodigo(0056);
		m.setCodigoCompleto(110056);
		m.setNome("São Paulo");

		List<Municipio> ms = new ArrayList<Municipio>();
		ms.add(m);

		UnidadeFederativa uf = new UnidadeFederativa();
		uf.setMunicipios(ms);

		Municipio result = uf.getMunicipio(0056);

		assertEquals(result, m);
	}

}
