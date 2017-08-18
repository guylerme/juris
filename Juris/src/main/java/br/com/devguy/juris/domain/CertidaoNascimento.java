/**
 * 
 */
package br.com.devguy.juris.domain;

import java.util.Date;

import br.com.devguy.juris.exceptions.DataRegistroInvalidaException;

/**
 * @author Guylerme
 *
 */
public class CertidaoNascimento extends DocumentoPessoal {
	private Date dataRegistro;
	private double numeroDeclaracaoNascidoVivo;
	private Pessoa pai;
	private Pessoa mae;

	/**
	 * @return the dataRegistro
	 */
	public Date getDataRegistro() {
		return dataRegistro;
	}

	/**
	 * @param dataRegistro
	 *            the dataRegistro to set
	 * @throws DataRegistroInvalidaException
	 */
	public void setDataRegistro(Date dataRegistro) throws DataRegistroInvalidaException {
		Date hoje = new Date(System.currentTimeMillis());
		if (dataRegistro.before(hoje))
		this.dataRegistro = dataRegistro;
		else
			throw new DataRegistroInvalidaException();
	}

	/**
	 * @return the numeroDeclaracaoNascidoVivo
	 */
	public double getNumeroDeclaracaoNascidoVivo() {
		return numeroDeclaracaoNascidoVivo;
	}

	/**
	 * @param numeroDeclaracaoNascidoVivo
	 *            the numeroDeclaracaoNascidoVivo to set
	 */
	public void setNumeroDeclaracaoNascidoVivo(double numeroDeclaracaoNascidoVivo) {
		this.numeroDeclaracaoNascidoVivo = numeroDeclaracaoNascidoVivo;
	}

	/**
	 * @return the pai
	 */
	public Pessoa getPai() {
		return pai;
	}

	/**
	 * @param pai
	 *            the pai to set
	 */
	public void setPai(Pessoa pai) {
		this.pai = pai;
	}

	/**
	 * @return the mae
	 */
	public Pessoa getMae() {
		return mae;
	}

	/**
	 * @param mae
	 *            the mae to set
	 */
	public void setMae(Pessoa mae) {
		this.mae = mae;
	}

}
