/**
 * 
 */
package br.com.devguy.juris.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.devguy.juris.exceptions.DataNascimentoInvalidaException;

/**
 * @author Guylerme
 *
 */
public class Pessoa {
	private double id;
	private String nome;
	private Date dataNascimento;
	private List<DocumentoPessoal> documentos;

	public double getId() {
		return id;
	}

	public void setId(double id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.trim();
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) throws DataNascimentoInvalidaException {
		Date hoje = new Date(System.currentTimeMillis());
		if (dataNascimento.before(hoje))
			this.dataNascimento = dataNascimento;
		else
			throw new DataNascimentoInvalidaException();
	}

	public List<DocumentoPessoal> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<DocumentoPessoal> documentos) {
		this.documentos = documentos;
	}

	public void addDocumento(DocumentoPessoal d) {
		if (this.documentos == null) {
			this.documentos = new ArrayList<DocumentoPessoal>();
		}
		this.documentos.add(d);
	}

	public DocumentoPessoal getDocumento(double numeroDocumento) {
		if ((this.documentos != null) && (!this.documentos.isEmpty())) {
			for (DocumentoPessoal d : this.documentos) {
				if (d.getNumeroDocumento() == numeroDocumento)
					return d;
			}
		}
		return null;
	}

}
