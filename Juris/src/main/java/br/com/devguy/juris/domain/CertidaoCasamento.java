/**
 * 
 */
package br.com.devguy.juris.domain;

import java.util.Date;

import br.com.devguy.juris.exceptions.DataCasamentoInvalidaException;

/**
 * @author Guylerme
 *
 */
public class CertidaoCasamento extends DocumentoPessoal {
	private Date dataCasamento;
	private Pessoa conjuge;

	/**
	 * @return the dataCasmamento
	 */
	public Date getDataCasmamento() {
		return dataCasamento;
	}

	/**
	 * @param dataCasamento
	 *            the dataCasmamento to set
	 * @throws DataCasamentoInvalidaException
	 */
	public void setDataCasmamento(Date dataCasamento) throws DataCasamentoInvalidaException {
		Date hoje = new Date(System.currentTimeMillis());
		if (dataCasamento.before(hoje))
			this.dataCasamento = dataCasamento;
		else
			throw new DataCasamentoInvalidaException();

	}

	/**
	 * @return the conjuge
	 */
	public Pessoa getConjuge() {
		return conjuge;
	}

	/**
	 * @param conjuge
	 *            the conjuge to set
	 */
	public void setConjuge(Pessoa conjuge) {
		this.conjuge = conjuge;
	}

}
