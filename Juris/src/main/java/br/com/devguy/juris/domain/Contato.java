/**
 * 
 */
package br.com.devguy.juris.domain;

import br.com.devguy.juris.domain.enumerators.TipoContato;

/**
 * @author Guylerme
 *
 */
public class Contato {
	private double id;
	private TipoContato tipoContato;
	private String observacao;

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public TipoContato getTipoContato() {
		return tipoContato;
	}

	public void setTipoContato(TipoContato tipoContato) {
		this.tipoContato = tipoContato;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
