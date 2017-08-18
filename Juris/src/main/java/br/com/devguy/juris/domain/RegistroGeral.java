/**
 * 
 */
package br.com.devguy.juris.domain;

import java.util.Date;

import br.com.devguy.juris.exceptions.DataEmissaoInvalidaException;

/**
 * @author Guylerme
 *
 */
public class RegistroGeral extends DocumentoPessoal {
	private Date dataEmissao;
	private UnidadeFederativa unidadeFederativa;

	/**
	 * @return the dataEmissao
	 */
	public Date getDataEmissao() {
		return dataEmissao;
	}

	/**
	 * @param dataEmissao
	 *            the dataEmissao to set
	 * @throws DataEmissaoInvalidaException
	 */
	public void setDataEmissao(Date dataEmissao) throws DataEmissaoInvalidaException {
		Date hoje = new Date(System.currentTimeMillis());
		if (dataEmissao.before(hoje))
			this.dataEmissao = dataEmissao;
		else
			throw new DataEmissaoInvalidaException();
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
