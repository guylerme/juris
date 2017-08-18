/**
 * 
 */
package br.com.devguy.juris.domain;

import com.google.appengine.api.images.Image;

/**
 * @author Guylerme
 *
 */
public interface IDocumento {
	public void setNumeroDocumento(double numeroDocumento) throws Exception;

	public double getNumeroDocumento();

	public void setImagemDocumento(Image imagem);

	public Image getImagemDocumento();
}
