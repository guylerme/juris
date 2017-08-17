/**
 * 
 */
package br.com.devguy.juris.domain;

import java.util.ArrayList;
import java.util.List;

import br.com.devguy.juris.exceptions.SiglaUFInvalidaException;

/**
 * @author Guylerme
 *
 */
public class UnidadeFederativa {
	private double codigo;
	private String sigla;
	private String nome;
	private List<Municipio> municipios;

	public double getCodigo() {
		return codigo;
	}

	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) throws SiglaUFInvalidaException {
		if (sigla.trim().length() == 2)
			this.sigla = sigla.trim();
		else
			throw new SiglaUFInvalidaException();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.trim();
	}

	public List<Municipio> getMunicipios() {
		return municipios;
	}

	public void setMunicipios(List<Municipio> municipios) {
		this.municipios = municipios;
	}

	public void addMunicipio(Municipio l) {
		if (this.municipios == null)
			municipios = new ArrayList<Municipio>();

		this.municipios.add(l);
	}

	public Municipio getMunicipio(double codigo) {
		if (this.municipios != null) {
			for (Municipio m : this.municipios) {
				if (m.getCodigo() == codigo)
					return m;
			}
		}
		return null;
	}

}
