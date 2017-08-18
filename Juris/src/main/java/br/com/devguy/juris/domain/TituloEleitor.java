/**
 * 
 */
package br.com.devguy.juris.domain;

/**
 * @author Guylerme
 *
 */
public class TituloEleitor extends DocumentoPessoal {
	private int zona;
	private int secao;

	/**
	 * @return the zona
	 */
	public int getZona() {
		return zona;
	}

	/**
	 * @param zona
	 *            the zona to set
	 */
	public void setZona(int zona) {
		this.zona = zona;
	}

	/**
	 * @return the secao
	 */
	public int getSecao() {
		return secao;
	}

	/**
	 * @param secao
	 *            the secao to set
	 */
	public void setSecao(int secao) {
		this.secao = secao;
	}

}
