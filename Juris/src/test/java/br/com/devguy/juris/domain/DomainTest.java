package br.com.devguy.juris.domain;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AdvogadoTest.class, ClientePessoaFisicaTest.class, ClientePessoaJuridicaTest.class, ContatoTest.class,
		EmailTest.class, LogradouroTest.class, MunicipioTest.class, OrganizacaoTest.class, PaisTest.class,
		PessoaTest.class, TelefoneTest.class, UnidadeFederativaTest.class })
public class DomainTest {

}
