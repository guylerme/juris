package br.com.devguy.juris.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.devguy.juris.exceptions.NumeroDocumentoInvalidoException;
import br.com.devguy.juris.exceptions.SiglaUFInvalidaException;

public class OrganizacaoTest {

	@Test
	public void testGetId() {
		System.out.println("testing getId on Organizacao");
		double codigo = 15665;
		Organizacao p = new Organizacao();
		p.setId(codigo);

		double result = p.getId();

		assertEquals(codigo, result, 0.001);
	}

	@Test
	public void testSetId() {
		System.out.println("testing setId on Organizacao");
		double codigo = 15665;
		Organizacao p = new Organizacao();
		p.setId(codigo);

		assertEquals(codigo, p.getId(), 0.001);
	}

	@Test
	public void testGetNome() {
		System.out.println("testing getNome on Organizacao");
		String nome = "Petrobras";
		Organizacao p = new Organizacao();
		p.setNome(nome);

		String result = p.getNome();

		assertEquals(nome, result);
	}

	@Test
	public void testSetNome() {
		System.out.println("testing setNome on Organizacao");
		String nome = "Petrobras";
		Organizacao p = new Organizacao();
		p.setNome(nome);

		assertEquals(nome, p.getNome());
	}

	@Test
	public void testGetDocumentos() {
		System.out.println("testing setDocumentos on Organizacao");
		Organizacao p = new Organizacao();

		List<DocumentoCorporativo> docs = new ArrayList<DocumentoCorporativo>();

		try {
			DocumentoCorporativo cnpj = new CadastroPessoaJuridica();
			cnpj.setNumeroDocumento(91756231000185.0);

			docs.add(cnpj);

			DocumentoCorporativo ie = new InscricaoEstadual();
			UnidadeFederativa uf = new UnidadeFederativa();
			try {
				uf.setSigla("RJ");
			} catch (SiglaUFInvalidaException e) {
				fail("UF Invalida");
			}
			((InscricaoEstadual) ie).setUnidadeFederativa(uf);

			ie.setNumeroDocumento(88527143.0);

			docs.add(ie);

		} catch (NumeroDocumentoInvalidoException e) {
			fail("Documento Invalido");
		}
		p.setDocumentos(docs);

		List<DocumentoCorporativo> result = p.getDocumentos();

		assertEquals(docs, result);
	}

	@Test
	public void testSetDocumentos() {
		System.out.println("testing setDocumentos on Organizacao");
		Organizacao p = new Organizacao();

		List<DocumentoCorporativo> docs = new ArrayList<DocumentoCorporativo>();

		try {
			DocumentoCorporativo cnpj = new CadastroPessoaJuridica();
			cnpj.setNumeroDocumento(91756231000185.0);

			docs.add(cnpj);

			DocumentoCorporativo ie = new InscricaoEstadual();
			UnidadeFederativa uf = new UnidadeFederativa();
			try {
				uf.setSigla("RJ");
			} catch (SiglaUFInvalidaException e) {
				fail("UF Invalida");
			}
			((InscricaoEstadual) ie).setUnidadeFederativa(uf);

			ie.setNumeroDocumento(88527143.0);

			docs.add(ie);

		} catch (NumeroDocumentoInvalidoException e) {
			fail("Documento Invalido");
		}

		p.setDocumentos(docs);

		assertEquals(docs, p.getDocumentos());
	}

	@Test
	public void testAddDocumento() {
		System.out.println("testing addDocumento on Organizacao");
		Organizacao p = new Organizacao();

		DocumentoCorporativo ie = new InscricaoEstadual();

		try {
			UnidadeFederativa uf = new UnidadeFederativa();
			try {
				uf.setSigla("RJ");
			} catch (SiglaUFInvalidaException e) {
				fail("UF Invalida");
			}
			((InscricaoEstadual) ie).setUnidadeFederativa(uf);
			ie.setNumeroDocumento(88527143.0);

			p.addDocumento(ie);

		} catch (NumeroDocumentoInvalidoException e) {
			fail("Documento Invalido");
		}

		assertEquals(ie, p.getDocumento(88527143));
	}

	@Test
	public void testGetDocumento() {
		System.out.println("testing addDocumento on Organizacao");
		Organizacao p = new Organizacao();

		DocumentoCorporativo ie = new InscricaoEstadual();

		try {
			UnidadeFederativa uf = new UnidadeFederativa();
			try {
				uf.setSigla("RJ");
			} catch (SiglaUFInvalidaException e) {
				fail("UF Invalida");
			}
			((InscricaoEstadual) ie).setUnidadeFederativa(uf);
			ie.setNumeroDocumento(88527143.0);

			p.addDocumento(ie);

		} catch (NumeroDocumentoInvalidoException e) {
			fail("Documento Invalido");
		}

		DocumentoCorporativo result = p.getDocumento(88527143);

		assertEquals(ie, result);
	}

}
