/**
 * 
 */
package br.com.devguy.juris.domain;

import java.util.List;

/**
 * @author Guylerme
 *
 */
public interface ICliente {

	public void setContatos(List<Contato> contatos);
	
	public List<Contato> getContatos();
	
	public void addContato(Contato c);
	
	public Contato getContato(double id);
	
	public void setLogradouros(List<Logradouro> logradouros);
	
	public List<Logradouro> getLogradouros();
	
	public void addLogradouro(Logradouro l);
	
	public Logradouro getLogradouro(double id);
}
