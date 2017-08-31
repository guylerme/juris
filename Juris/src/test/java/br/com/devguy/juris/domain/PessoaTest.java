package br.com.devguy.juris.domain;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import br.com.devguy.juris.exceptions.DataNascimentoInvalidaException;
import br.com.devguy.juris.exceptions.NumeroDocumentoInvalidoException;

public class PessoaTest {

	@Test
	public void testGetId() {
		System.out.println("testing getId on Pessoa");
		double codigo = 15665;
		Pessoa p = new Pessoa();
		p.setId(codigo);

		double result = p.getId();

		assertEquals(codigo, result, 0.001);
	}

	@Test
	public void testSetId() {
		System.out.println("testing setId on Pessoa");
		double codigo = 15665;
		Pessoa p = new Pessoa();
		p.setId(codigo);

		assertEquals(codigo, p.getId(), 0.001);
	}

	@Test
	public void testGetNome() {
		System.out.println("testing getNome on Pessoa");
		String nome = "Jose";
		Pessoa p = new Pessoa();
		p.setNome(nome);

		String result = p.getNome();

		assertEquals(nome, result);
	}

	@Test
	public void testSetNome() {
		System.out.println("testing setNome on Pessoa");
		String nome = "Jose";
		Pessoa p = new Pessoa();
		p.setNome(nome);

		assertEquals(nome, p.getNome());
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testGetDataNascimento() {
		System.out.println("testing getDataNascimento on Pessoa");
		Date data = new Date("10/10/2001");
		Pessoa p = new Pessoa();
		try {
			p.setDataNascimento(data);
		} catch (DataNascimentoInvalidaException e) {
			fail("Data de Nascimento Invalida");
		}

		Date result = p.getDataNascimento();

		assertEquals(data, result);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testSetDataNascimento() {
		System.out.println("testing getDataNascimento on Pessoa");
		Date data = new Date("10/10/2001");
		Pessoa p = new Pessoa();
		try {
			p.setDataNascimento(data);
		} catch (DataNascimentoInvalidaException e) {
			fail("Data de Nascimento Invalida");
		}

		assertEquals(data, p.getDataNascimento());
	}

	@Test
	public void testGetDocumentos() {
		System.out.println("testing setDocumentos on Pessoa");
		Pessoa p = new Pessoa();

		List<DocumentoPessoal> docs = new ArrayList<DocumentoPessoal>();

		try {
			DocumentoPessoal rg = new RegistroGeral();
			rg.setNumeroDocumento(123456);

			docs.add(rg);

			DocumentoPessoal certidaoNascimento = new CertidaoNascimento();
			certidaoNascimento.setNumeroDocumento(123456);

			docs.add(certidaoNascimento);

			DocumentoPessoal tituloEleitor = new TituloEleitor();
			tituloEleitor.setNumeroDocumento(123456);

			docs.add(tituloEleitor);

			DocumentoPessoal certidaoCasamento = new CertidaoCasamento();
			certidaoCasamento.setNumeroDocumento(123456);

			docs.add(certidaoCasamento);

			DocumentoPessoal cpf = new CadastroPessoaFisica();
			cpf.setNumeroDocumento(10185777775.0);

			docs.add(cpf);

			DocumentoPessoal certificadoReservista = new CertificadoReservista();
			certificadoReservista.setNumeroDocumento(123456);

			docs.add(certificadoReservista);

			DocumentoPessoal nis = new NumeroInscricaoSocial();
			nis.setNumeroDocumento(123456);

			docs.add(nis);

			DocumentoPessoal ctps = new CarteiraTrabalho();
			ctps.setNumeroDocumento(123456);

			docs.add(ctps);
		} catch (NumeroDocumentoInvalidoException e) {
			fail("Documento Invalido");
		}
		p.setDocumentos(docs);

		List<DocumentoPessoal> result = p.getDocumentos();

		assertEquals(docs, result);
	}

	@Test
	public void testSetDocumentos() {
		System.out.println("testing setDocumentos on Pessoa");
		Pessoa p = new Pessoa();

		List<DocumentoPessoal> docs = new ArrayList<DocumentoPessoal>();

		try {
			DocumentoPessoal rg = new RegistroGeral();
			rg.setNumeroDocumento(123456);

			docs.add(rg);

			DocumentoPessoal certidaoNascimento = new CertidaoNascimento();
			certidaoNascimento.setNumeroDocumento(123456);

			docs.add(certidaoNascimento);

			DocumentoPessoal tituloEleitor = new TituloEleitor();
			tituloEleitor.setNumeroDocumento(123456);

			docs.add(tituloEleitor);

			DocumentoPessoal certidaoCasamento = new CertidaoCasamento();
			certidaoCasamento.setNumeroDocumento(123456);

			docs.add(certidaoCasamento);

			DocumentoPessoal cpf = new CadastroPessoaFisica();
			cpf.setNumeroDocumento(10185777775.0);

			docs.add(cpf);

			DocumentoPessoal certificadoReservista = new CertificadoReservista();
			certificadoReservista.setNumeroDocumento(123456);

			docs.add(certificadoReservista);

			DocumentoPessoal nis = new NumeroInscricaoSocial();
			nis.setNumeroDocumento(123456);

			docs.add(nis);

			DocumentoPessoal ctps = new CarteiraTrabalho();
			ctps.setNumeroDocumento(123456);

			docs.add(ctps);
		} catch (NumeroDocumentoInvalidoException e) {
			fail("Documento Invalido");
		}

		p.setDocumentos(docs);

		assertEquals(docs, p.getDocumentos());
	}

	@Test
	public void testAddDocumento() {
		System.out.println("testing addDocumento on Pessoa");
		Pessoa p = new Pessoa();

		DocumentoPessoal rg = new RegistroGeral();

		try {

			rg.setNumeroDocumento(123456);

			p.addDocumento(rg);

		} catch (NumeroDocumentoInvalidoException e) {
			fail("Documento Invalido");
		}

		assertEquals(rg, p.getDocumento(123456));
	}

	@Test
	public void testGetDocumento() {
		System.out.println("testing addDocumento on Pessoa");
		Pessoa p = new Pessoa();

		DocumentoPessoal rg = new RegistroGeral();

		try {

			rg.setNumeroDocumento(123456);

			p.addDocumento(rg);

		} catch (NumeroDocumentoInvalidoException e) {
			fail("Documento Invalido");
		}

		DocumentoPessoal result = p.getDocumento(123456);

		assertEquals(rg, result);
	}

}
