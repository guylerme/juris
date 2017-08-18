/**
 * 
 */
package br.com.devguy.juris.domain;

/**
 * @author Guylerme
 *
 */
public class CarteiraTrabalho extends DocumentoPessoal {
	private int numeroSerie;
	private UnidadeFederativa unidadeFederativa;

	/**
	 * @return the numeroSerie
	 */
	public int getNumeroSerie() {
		return numeroSerie;
	}

	/**
	 * @param numeroSerie
	 *            the numeroSerie to set
	 */
	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	/**
	 * @return the unidadeFederativa
	 */
	public UnidadeFederativa getUnidadeFederativa() {
		return unidadeFederativa;
	}

	/**
	 * @param unidadeFederativa
	 *            the unidadeFederativa to set
	 */
	public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
		this.unidadeFederativa = unidadeFederativa;
	}

}
