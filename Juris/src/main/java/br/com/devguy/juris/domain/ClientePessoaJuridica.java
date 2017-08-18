/**
 * 
 */
package br.com.devguy.juris.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Guylerme
 *
 */
public class ClientePessoaJuridica extends Organizacao implements ICliente {

	private List<Contato> contatos;
	private List<Logradouro> logradouros;

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.devguy.juris.domain.ICliente#setContatos(java.util.List)
	 */
	@Override
	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.devguy.juris.domain.ICliente#getContatos()
	 */
	@Override
	public List<Contato> getContatos() {
		return this.contatos;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.devguy.juris.domain.ICliente#addContato(br.com.devguy.juris.domain
	 * .Contato)
	 */
	@Override
	public void addContato(Contato c) {
		if (this.contatos == null) {
			this.contatos = new ArrayList<Contato>();
		}
		this.contatos.add(c);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.devguy.juris.domain.ICliente#getContato(double)
	 */
	@Override
	public Contato getContato(double id) {
		if ((this.contatos != null) && (!this.contatos.isEmpty())) {
			for (Contato c : this.contatos) {
				if (c.getId() == id)
					return c;
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.devguy.juris.domain.ICliente#setLogradouros(java.util.List)
	 */
	@Override
	public void setLogradouros(List<Logradouro> logradouros) {
		this.logradouros = logradouros;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.devguy.juris.domain.ICliente#getLogradouros()
	 */
	@Override
	public List<Logradouro> getLogradouros() {
		return this.logradouros;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * br.com.devguy.juris.domain.ICliente#addLogradouro(br.com.devguy.juris.
	 * domain.Logradouro)
	 */
	@Override
	public void addLogradouro(Logradouro l) {
		if (this.logradouros == null) {
			this.logradouros = new ArrayList<Logradouro>();
		}
		this.logradouros.add(l);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see br.com.devguy.juris.domain.ICliente#getLogradouro(double)
	 */
	@Override
	public Logradouro getLogradouro(double id) {
		if ((this.logradouros != null) && (!this.logradouros.isEmpty())) {
			for (Logradouro l : this.logradouros) {
				if (l.getId() == id)
					return l;
			}
		}
		return null;
	}

}
