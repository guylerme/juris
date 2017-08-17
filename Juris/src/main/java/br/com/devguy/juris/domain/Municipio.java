/**
 * 
 */
package br.com.devguy.juris.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Guylerme
 *
 */
public class Municipio {
	private double codigo;
	private double codigoCompleto;
	private String nome;
	private List<Logradouro> logradouros;

	public double getCodigo() {
		return codigo;
	}

	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}

	public double getCodigoCompleto() {
		return codigoCompleto;
	}

	public void setCodigoCompleto(double codigoCompleto) {
		this.codigoCompleto = codigoCompleto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.trim();
	}

	public List<Logradouro> getLogradouros() {
		return logradouros;
	}

	public void setLogradouros(List<Logradouro> logradouros) {
		this.logradouros = logradouros;
	}

	public void addLogradouro(Logradouro l) {
		if (this.logradouros == null)
			logradouros = new ArrayList<Logradouro>();

		this.logradouros.add(l);
	}

	public Logradouro getLogradouro(double id) {
		if (this.logradouros != null) {
			for (Logradouro l : this.logradouros) {
				if (l.getId() == id)
					return l;
			}
		}
		return null;
	}
}
