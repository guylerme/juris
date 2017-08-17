/**
 * 
 */
package br.com.devguy.juris.domain;

import java.math.BigDecimal;

import br.com.devguy.juris.domain.enumerators.TipoTelefone;
import br.com.devguy.juris.exceptions.DDDInvalidoException;
import br.com.devguy.juris.exceptions.NumeroTelefoneInvalidoException;

/**
 * @author Guylerme
 *
 */
public class Telefone extends Contato {
	private int ddd;
	private double numero;
	private TipoTelefone tipoTelefone;

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) throws DDDInvalidoException {
		if (ddd < 99)
			this.ddd = ddd;
		else
			throw new DDDInvalidoException();
	}

	public double getNumero() {
		return numero;
	}

	public String getNumeroCompleto() {
		String numeroStr = ddd + "" + BigDecimal.valueOf(numero).toPlainString();
		numeroStr = "(" + numeroStr.substring(0, 2) + ")" + numeroStr.substring(2, 7) + "-"
				+ numeroStr.substring(7, 11);
		return numeroStr;
	}

	public void setNumero(double numero) throws NumeroTelefoneInvalidoException {
		if (numero < 999999999)
			this.numero = numero;
		else
			throw new NumeroTelefoneInvalidoException();
	}

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(TipoTelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

}
