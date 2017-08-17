/**
 * 
 */
package br.com.devguy.juris.domain;

import br.com.devguy.juris.exceptions.CEPInvalidoException;

/**
 * @author Guylerme
 *
 */
public class Logradouro {
	private double id;
	private String logradouro;
	private int numero;
	private int cep;
	private String bairro;
	private String complemento;

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro.trim();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCep() {
		return cep;
	}

	public String getCepToString() {
		String cepStr = "" + cep;
		cepStr = cepStr.substring(0, 5) + "-" + cepStr.substring(5);
		return cepStr;

	}

	public void setCep(int cep) throws CEPInvalidoException {
		if (cep < 99999999)
			this.cep = cep;
		else
			throw new CEPInvalidoException();
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro.trim();
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento.trim();
	}

}
