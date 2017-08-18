/**
 * 
 */
package br.com.devguy.juris.domain;

import java.text.DecimalFormat;

import com.google.appengine.api.images.Image;

import br.com.devguy.juris.exceptions.NumeroDocumentoInvalidoException;

/**
 * @author Guylerme
 *
 */
public class DocumentoCorporativo implements IDocumento {

	private double numeroDocumento;
	private Image imagemDocumento;

	public void setNumeroDocumento(double numeroDocumento) throws NumeroDocumentoInvalidoException {
		DecimalFormat df = new DecimalFormat("#");
		double numero = Double.valueOf(df.format(numeroDocumento));
		if (numeroDocumento % numero == 0)
			this.numeroDocumento = numeroDocumento;
		else
			throw new NumeroDocumentoInvalidoException();

	}

	public double getNumeroDocumento() {
		return this.numeroDocumento;
	}

	public Image getImagemDocumento() {
		return imagemDocumento;
	}

	public void setImagemDocumento(Image imagemDocumento) {
		this.imagemDocumento = imagemDocumento;
	}

}
