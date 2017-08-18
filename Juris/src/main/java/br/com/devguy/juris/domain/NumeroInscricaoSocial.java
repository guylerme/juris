/**
 * 
 */
package br.com.devguy.juris.domain;

/**
 * @author Guylerme
 *
 */
public class NumeroInscricaoSocial extends DocumentoPessoal {
	private String observacao;

	/**
	 * @return the observacao
	 */
	public String getObservacao() {
		return observacao;
	}

	/**
	 * @param observacao
	 *            the observacao to set
	 */
	public void setObservacao(String observacao) {
		this.observacao = observacao.trim();
	}

}
