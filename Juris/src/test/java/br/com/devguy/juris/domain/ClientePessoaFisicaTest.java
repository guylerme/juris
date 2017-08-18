package br.com.devguy.juris.domain;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ClientePessoaFisicaTest {

	@Test
	public void testSetContatos() {
		System.out.println("testing setContatos on ClientePessoaFisica");
		double id = 76;
		Contato contato = new Contato();
		contato.setId(id);

		List<Contato> contatos = new ArrayList<Contato>();
		contatos.add(contato);

		ClientePessoaFisica pessoa = new ClientePessoaFisica();
		pessoa.setContatos(contatos);

		assertEquals(contatos, pessoa.getContatos());
	}

	@Test
	public void testGetContatos() {
		System.out.println("testing getContatos on ClientePessoaFisica");
		double id = 76;
		Contato contato = new Contato();
		contato.setId(id);

		List<Contato> contatos = new ArrayList<Contato>();
		contatos.add(contato);

		ClientePessoaFisica pessoa = new ClientePessoaFisica();
		pessoa.setContatos(contatos);

		List<Contato> result = pessoa.getContatos();

		assertEquals(contatos, result);
	}

	@Test
	public void testAddContato() {
		System.out.println("testing addContato on ClientePessoaFisica");
		double id = 76;
		Contato contato = new Contato();
		contato.setId(id);

		List<Contato> contatos = new ArrayList<Contato>();
		contatos.add(contato);

		ClientePessoaFisica pessoa = new ClientePessoaFisica();
		pessoa.setContatos(contatos);

		assertEquals(contato, pessoa.getContato(76));
	}

	@Test
	public void testGetContato() {
		System.out.println("testing getContato on ClientePessoaFisica");
		double id = 76;
		Contato contato = new Contato();
		contato.setId(id);

		List<Contato> contatos = new ArrayList<Contato>();
		contatos.add(contato);

		ClientePessoaFisica pessoa = new ClientePessoaFisica();
		pessoa.setContatos(contatos);

		Contato result = pessoa.getContato(76);

		assertEquals(contato, result);
	}

	@Test
	public void testSetLogradouros() {
		System.out.println("testing getLogradouros on ClientePessoaFisica");
		double id = 76;
		Logradouro logradouro = new Logradouro();
		logradouro.setId(id);

		List<Logradouro> logradouros = new ArrayList<Logradouro>();
		logradouros.add(logradouro);

		ClientePessoaFisica pessoa = new ClientePessoaFisica();
		pessoa.setLogradouros(logradouros);

		assertEquals(logradouros, pessoa.getLogradouros());
	}

	@Test
	public void testGetLogradouros() {
		System.out.println("testing getLogradouros on ClientePessoaFisica");
		double id = 76;
		Logradouro logradouro = new Logradouro();
		logradouro.setId(id);

		List<Logradouro> logradouros = new ArrayList<Logradouro>();
		logradouros.add(logradouro);

		ClientePessoaFisica pessoa = new ClientePessoaFisica();
		pessoa.setLogradouros(logradouros);

		List<Logradouro> result = pessoa.getLogradouros();

		assertEquals(logradouros, result);
	}

	@Test
	public void testAddLogradouro() {
		System.out.println("testing addLogradouro on ClientePessoaFisica");
		double id = 76;
		Logradouro logradouro = new Logradouro();
		logradouro.setId(id);

		List<Logradouro> logradouros = new ArrayList<Logradouro>();
		logradouros.add(logradouro);

		ClientePessoaFisica pessoa = new ClientePessoaFisica();
		pessoa.setLogradouros(logradouros);

		assertEquals(logradouro, pessoa.getLogradouro(76));
	}

	@Test
	public void testGetLogradouro() {
		System.out.println("testing getLogradouro on ClientePessoaFisica");
		double id = 76;
		Logradouro logradouro = new Logradouro();
		logradouro.setId(id);

		List<Logradouro> logradouros = new ArrayList<Logradouro>();
		logradouros.add(logradouro);

		ClientePessoaFisica pessoa = new ClientePessoaFisica();
		pessoa.setLogradouros(logradouros);

		Logradouro result = pessoa.getLogradouro(76);

		assertEquals(logradouro, result);
	}

}
