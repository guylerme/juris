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
public class Organizacao {
	private double id;
	private String nome;
	private List<DocumentoCorporativo> documentos;

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

	public List<DocumentoCorporativo> getDocumentos() {
		return documentos;
	}

	public void setDocumentos(List<DocumentoCorporativo> documentos) {
		this.documentos = documentos;
	}

	public void addDocumento(DocumentoCorporativo d) {
		if (this.documentos == null) {
			this.documentos = new ArrayList<DocumentoCorporativo>();
		}
		this.documentos.add(d);
	}

	public DocumentoCorporativo getDocumento(double numeroDocumento) {
		if ((this.documentos != null) && (!this.documentos.isEmpty())) {
			for (DocumentoCorporativo d : this.documentos) {
				if (d.getNumeroDocumento() == numeroDocumento)
					return d;
			}
		}
		return null;
	}

}
