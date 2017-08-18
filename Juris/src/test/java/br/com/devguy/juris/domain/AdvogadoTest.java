package br.com.devguy.juris.domain;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.devguy.juris.exceptions.NumeroDocumentoInvalidoException;

public class AdvogadoTest {

	@Test
	public void testSetContatos() {
		System.out.println("testing setContatos on Advogado");
		double id = 76;
		Contato contato = new Contato();
		contato.setId(id);

		List<Contato> contatos = new ArrayList<Contato>();
		contatos.add(contato);

		Advogado advogado = new Advogado();
		advogado.setContatos(contatos);

		assertEquals(contatos, advogado.getContatos());
	}

	@Test
	public void testGetContatos() {
		System.out.println("testing getContatos on Advogado");
		double id = 76;
		Contato contato = new Contato();
		contato.setId(id);

		List<Contato> contatos = new ArrayList<Contato>();
		contatos.add(contato);

		Advogado advogado = new Advogado();
		advogado.setContatos(contatos);

		List<Contato> result = advogado.getContatos();

		assertEquals(contatos, result);
	}

	@Test
	public void testAddContato() {
		System.out.println("testing addContato on Advogado");
		double id = 76;
		Contato contato = new Contato();
		contato.setId(id);

		List<Contato> contatos = new ArrayList<Contato>();
		contatos.add(contato);

		Advogado advogado = new Advogado();
		advogado.setContatos(contatos);

		assertEquals(contato, advogado.getContato(76));
	}

	@Test
	public void testGetContato() {
		System.out.println("testing getContato on Advogado");
		double id = 76;
		Contato contato = new Contato();
		contato.setId(id);

		List<Contato> contatos = new ArrayList<Contato>();
		contatos.add(contato);

		Advogado advogado = new Advogado();
		advogado.setContatos(contatos);

		Contato result = advogado.getContato(76);

		assertEquals(contato, result);
	}

	@Test
	public void testSetLogradouros() {
		System.out.println("testing getLogradouros on Advogado");
		double id = 76;
		Logradouro logradouro = new Logradouro();
		logradouro.setId(id);

		List<Logradouro> logradouros = new ArrayList<Logradouro>();
		logradouros.add(logradouro);

		Advogado advogado = new Advogado();
		advogado.setLogradouros(logradouros);

		assertEquals(logradouros, advogado.getLogradouros());
	}

	@Test
	public void testGetLogradouros() {
		System.out.println("testing getLogradouros on Advogado");
		double id = 76;
		Logradouro logradouro = new Logradouro();
		logradouro.setId(id);

		List<Logradouro> logradouros = new ArrayList<Logradouro>();
		logradouros.add(logradouro);

		Advogado advogado = new Advogado();
		advogado.setLogradouros(logradouros);

		List<Logradouro> result = advogado.getLogradouros();

		assertEquals(logradouros, result);
	}

	@Test
	public void testAddLogradouro() {
		System.out.println("testing addLogradouro on Advogado");
		double id = 76;
		Logradouro logradouro = new Logradouro();
		logradouro.setId(id);

		List<Logradouro> logradouros = new ArrayList<Logradouro>();
		logradouros.add(logradouro);

		Advogado advogado = new Advogado();
		advogado.setLogradouros(logradouros);

		assertEquals(logradouro, advogado.getLogradouro(76));
	}

	@Test
	public void testGetLogradouro() {
		System.out.println("testing getLogradouro on Advogado");
		double id = 76;
		Logradouro logradouro = new Logradouro();
		logradouro.setId(id);

		List<Logradouro> logradouros = new ArrayList<Logradouro>();
		logradouros.add(logradouro);

		Advogado advogado = new Advogado();
		advogado.setLogradouros(logradouros);

		Logradouro result = advogado.getLogradouro(76);

		assertEquals(logradouro, result);
	}

	@Test
	public void testSetCarteiraOab() {
		System.out.println("testing setCarteiraOab on Advogado");
		double id = 76;
		CarteiraOab oab = new CarteiraOab();
		try {
			oab.setNumeroDocumento(id);
		} catch (NumeroDocumentoInvalidoException e) {
			fail("Numero de Oab invalida");
		}

		Advogado advogado = new Advogado();
		advogado.setCarteiraOab(oab);

		assertEquals(oab, advogado.getCarteiraOab());
	}

	@Test
	public void testGetCarteiraOab() {
		System.out.println("testing setCarteiraOab on Advogado");
		double id = 76;
		CarteiraOab oab = new CarteiraOab();
		try {
			oab.setNumeroDocumento(id);
		} catch (NumeroDocumentoInvalidoException e) {
			fail("Numero de Oab invalida");
		}

		Advogado advogado = new Advogado();
		advogado.setCarteiraOab(oab);

		CarteiraOab result = advogado.getCarteiraOab();

		assertEquals(oab, result);
	}

}
