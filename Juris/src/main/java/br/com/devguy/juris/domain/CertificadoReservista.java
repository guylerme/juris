/**
 * 
 */
package br.com.devguy.juris.domain;

/**
 * @author Guylerme
 *
 */
public class CertificadoReservista extends DocumentoPessoal {
	private String nomeLocalApresentacao;

	/**
	 * @return the nomeLocalApresentacao
	 */
	public String getNomeLocalApresentacao() {
		return nomeLocalApresentacao;
	}

	/**
	 * @param nomeLocalApresentacao
	 *            the nomeLocalApresentacao to set
	 */
	public void setNomeLocalApresentacao(String nomeLocalApresentacao) {
		this.nomeLocalApresentacao = nomeLocalApresentacao.trim();
	}

}
