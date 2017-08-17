/**
 * 
 */
package br.com.devguy.juris.domain;

import java.util.ArrayList;
import java.util.List;

import br.com.devguy.juris.exceptions.SiglaPaisInvalidaException;

/**
 * @author Guylerme
 *
 */
public class Pais {
	private double codigo;
	private String sigla;
	private String nome;
	private List<UnidadeFederativa> unidadesFederativas;

	public double getCodigo() {
		return codigo;
	}

	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) throws SiglaPaisInvalidaException {
		if (sigla.trim().length() == 3)
			this.sigla = sigla.trim();
		else
			throw new SiglaPaisInvalidaException();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.trim();
	}

	public List<UnidadeFederativa> getUnidadesFederativas() {
		return unidadesFederativas;
	}

	public void setUnidadesFederativas(List<UnidadeFederativa> unidadesFederativas) {
		this.unidadesFederativas = unidadesFederativas;
	}

	public void addUnidadeFederativa(UnidadeFederativa uf) {
		if (this.unidadesFederativas == null)
			unidadesFederativas = new ArrayList<UnidadeFederativa>();

		this.unidadesFederativas.add(uf);
	}

	public UnidadeFederativa getUnidadeFederativa(double codigo) {
		if (this.unidadesFederativas != null) {
			for (UnidadeFederativa uf : this.unidadesFederativas) {
				if (uf.getCodigo() == codigo)
					return uf;
			}
		}
		return null;
	}

}
