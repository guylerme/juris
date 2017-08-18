/**
 * 
 */
package br.com.devguy.juris.domain;

import java.math.BigDecimal;

import br.com.devguy.juris.exceptions.InscricaoEstadualInvalidaException;
import br.com.devguy.juris.exceptions.NumeroDocumentoInvalidoException;

/**
 * @author Guylerme
 *
 */
public class InscricaoEstadual extends DocumentoCorporativo {

	private UnidadeFederativa unidadeFederativa;

	@Override
	public void setNumeroDocumento(double numeroDocumento) throws NumeroDocumentoInvalidoException {
		if (this.validaIE(numeroDocumento, this.unidadeFederativa.getSigla()))
			super.setNumeroDocumento(numeroDocumento);
		else
			throw new InscricaoEstadualInvalidaException();
	}

	public UnidadeFederativa getUnidadeFederativa() {
		return unidadeFederativa;
	}

	public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
		this.unidadeFederativa = unidadeFederativa;
	}

	private boolean validaIE(double inscricaoEstadual, String siglaUf) {
		String strIE = "" + BigDecimal.valueOf(inscricaoEstadual).toPlainString();
		siglaUf = siglaUf.toUpperCase();
		if (siglaUf.equals("AC")) {
			return validaIEAcre(strIE);
		} else if (siglaUf.equals("AL")) {
			return validaIEAlagoas(strIE);
		} else if (siglaUf.equals("AP")) {
			return validaIEAmapa(strIE);
		} else if (siglaUf.equals("AM")) {
			return validaIEAmazonas(strIE);
		} else if (siglaUf.equals("BA")) {
			return validaIEBahia(strIE);
		} else if (siglaUf.equals("CE")) {
			return validaIECeara(strIE);
		} else if (siglaUf.equals("ES")) {
			return validaIEEspiritoSanto(strIE);
		} else if (siglaUf.equals("GO")) {
			return validaIEGoias(strIE);
		} else if (siglaUf.equals("MA")) {
			return validaIEMaranhao(strIE);
		} else if (siglaUf.equals("MT")) {
			return validaIEMatoGrosso(strIE);
		} else if (siglaUf.equals("MS")) {
			return validaIEMatoGrossoSul(strIE);
		} else if (siglaUf.equals("MG")) {
			return validaIEMinasGerais(strIE);
		} else if (siglaUf.equals("PA")) {
			return validaIEPara(strIE);
		} else if (siglaUf.equals("PB")) {
			return validaIEParaiba(strIE);
		} else if (siglaUf.equals("PR")) {
			return validaIEParana(strIE);
		} else if (siglaUf.equals("PE")) {
			return validaIEPernambuco(strIE);
		} else if (siglaUf.equals("PI")) {
			return validaIEPiaui(strIE);
		} else if (siglaUf.equals("RJ")) {
			return validaIERioJaneiro(strIE);
		} else if (siglaUf.equals("RN")) {
			return validaIERioGrandeNorte(strIE);
		} else if (siglaUf.equals("RS")) {
			return validaIERioGrandeSul(strIE);
		} else if (siglaUf.equals("RO")) {
			return validaIERondonia(strIE);
		} else if (siglaUf.equals("RR")) {
			return validaIERoraima(strIE);
		} else if (siglaUf.equals("SC")) {
			return validaIESantaCatarina(strIE);
		} else if (siglaUf.equals("SP")) {
			return validaIESaoPaulo(strIE);
		} else if (siglaUf.equals("SE")) {
			return validaIESergipe(strIE);
		} else if (siglaUf.equals("TO")) {
			return validaIETocantins(strIE);
		} else if (siglaUf.equals("DF")) {
			return validaIEDistritoFederal(strIE);
		} else {
			return false;
		}

	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Acre
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIEAcre(String ie) { // inic&#65533;o
												// do
												// validaIEAcre()
		// valida a quantidade de d&#65533;gitos
		if (ie.length() != 13) {
			return false;
		}

		// valida os dois primeiros digitos - devem ser iguais a 01
		for (int i = 0; i < 2; i++) {
			if (Integer.parseInt(String.valueOf(ie.charAt(i))) != i) {
				return false;
			}
		}

		int soma = 0;
		int pesoInicial = 4;
		int pesoFinal = 9;
		int d1 = 0; // primeiro digito verificador
		int d2 = 0; // segundo digito verificador

		// calcula o primeiro digito
		for (int i = 0; i < ie.length() - 2; i++) {
			if (i < 3) {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoInicial;
				pesoInicial--;
			} else {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoFinal;
				pesoFinal--;
			}
		}
		d1 = 11 - (soma % 11);
		if (d1 == 10 || d1 == 11) {
			d1 = 0;
		}

		// calcula o segundo digito
		soma = d1 * 2;
		pesoInicial = 5;
		pesoFinal = 9;
		for (int i = 0; i < ie.length() - 2; i++) {
			if (i < 4) {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoInicial;
				pesoInicial--;
			} else {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoFinal;
				pesoFinal--;
			}
		}

		d2 = 11 - (soma % 11);
		if (d2 == 10 || d2 == 11) {
			d2 = 0;
		}

		// valida os digitos verificadores
		String dv = d1 + "" + d2;
		if (!dv.equals(ie.substring(ie.length() - 2, ie.length()))) {
			return false;
		}

		return true;
	} // fim do validaIEAcre()

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Alagoas
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIEAlagoas(String ie) {
		// valida quantidade de d&#65533;gitos
		if (ie.length() != 9) {
			return false;
		}

		// valida os dois primeiros d&#65533;gitos - deve ser iguais a 24
		if (!ie.substring(0, 2).equals("24")) {
			return false;
		}

		// valida o terceiro d&#65533;gito - deve ser 0,3,5,7,8
		int[] digits = { 0, 3, 5, 7, 8 };
		boolean check = false;
		for (int i = 0; i < digits.length; i++) {
			if (Integer.parseInt(String.valueOf(ie.charAt(2))) == digits[i]) {
				check = true;
				break;
			}
		}
		if (!check) {
			return false;
		}

		// calcula o d&#65533;gito verificador
		int soma = 0;
		int peso = 9;
		int d = 0; // d&#65533;gito verificador
		for (int i = 0; i < ie.length() - 1; i++) {
			soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
			peso--;
		}
		d = ((soma * 10) % 11);
		if (d == 10) {
			d = 0;
		}

		// valida o digito verificador
		String dv = d + "";
		if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Amap&#65533;
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIEAmapa(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 9) {
			return false;
		}

		// verifica os dois primeiros d&#65533;gitos - deve ser igual 03
		if (!ie.substring(0, 2).equals("03")) {
			return false;
		}

		// calcula o d&#65533;gito verificador
		int d1 = -1;
		int soma = -1;
		int peso = 9;

		// configura o valor do d&#65533;gito verificador e da soma de acordo
		// com faixa das inscri&#65533;&#65533;es
		long x = Long.parseLong(ie.substring(0, ie.length() - 1)); // x =
																	// inscri&#65533;&#65533;o
																	// estadual
																	// sem o
																	// d&#65533;gito
																	// verificador
		if (x >= 3017001L && x <= 3019022L) {
			d1 = 1;
			soma = 9;
		} else if (x >= 3000001L && x <= 3017000L) {
			d1 = 0;
			soma = 5;
		} else if (x >= 3019023L) {
			d1 = 0;
			soma = 0;
		}

		for (int i = 0; i < ie.length() - 1; i++) {
			soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
			peso--;
		}

		int d = 11 - ((soma % 11)); // d = armazena o d&#65533;gito verificador
									// ap&#65533;s c&#65533;lculo
		if (d == 10) {
			d = 0;
		} else if (d == 11) {
			d = d1;
		}

		// valida o digito verificador
		String dv = d + "";
		if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Amazonas
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIEAmazonas(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 9) {
			return false;
		}

		int soma = 0;
		int peso = 9;
		int d = -1; // d&#65533;gito verificador
		for (int i = 0; i < ie.length() - 1; i++) {
			soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
			peso--;
		}

		if (soma < 11) {
			d = 11 - soma;
		} else if ((soma % 11) <= 1) {
			d = 0;
		} else {
			d = 11 - (soma % 11);
		}

		// valida o digito verificador
		String dv = d + "";
		if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Bahia
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIEBahia(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 8 && ie.length() != 9) {
			return false;
		}

		// C&#65533;lculo do m&#65533;dulo de acordo com o primeiro
		// d&#65533;gito da inscri&#65533;&#65533;o Estadual
		int modulo = 10;
		int firstDigit = Integer.parseInt(String.valueOf(ie.charAt(ie.length() == 8 ? 0 : 1)));
		if (firstDigit == 6 || firstDigit == 7 || firstDigit == 9)
			modulo = 11;

		// C&#65533;lculo do segundo d&#65533;gito
		int d2 = -1; // segundo d&#65533;gito verificador
		int soma = 0;
		int peso = ie.length() == 8 ? 7 : 8;
		for (int i = 0; i < ie.length() - 2; i++) {
			soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
			peso--;
		}

		int resto = soma % modulo;

		if (resto == 0 || (modulo == 11 && resto == 1)) {
			d2 = 0;
		} else {
			d2 = modulo - resto;
		}

		// C&#65533;lculo do primeiro d&#65533;gito
		int d1 = -1; // primeiro d&#65533;gito verificador
		soma = d2 * 2;
		peso = ie.length() == 8 ? 8 : 9;
		for (int i = 0; i < ie.length() - 2; i++) {
			soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
			peso--;
		}

		resto = soma % modulo;

		if (resto == 0 || (modulo == 11 && resto == 1)) {
			d1 = 0;
		} else {
			d1 = modulo - resto;
		}

		// valida os digitos verificadores
		String dv = d1 + "" + d2;
		if (!dv.equals(ie.substring(ie.length() - 2, ie.length()))) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Cear&#65533;
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIECeara(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 9) {
			return false;
		}

		// C&#65533;lculo do d&#65533;gito verificador
		int soma = 0;
		int peso = 9;
		int d = -1; // d&#65533;gito verificador
		for (int i = 0; i < ie.length() - 1; i++) {
			soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
			peso--;
		}

		d = 11 - (soma % 11);
		if (d == 10 || d == 11) {
			d = 0;
		}
		// valida o digito verificador
		String dv = d + "";
		if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Esp&#65533;rito
	 * Santo
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIEEspiritoSanto(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 9) {
			return false;
		}

		// C&#65533;lculo do d&#65533;gito verificador
		int soma = 0;
		int peso = 9;
		int d = -1; // d&#65533;gito verificador
		for (int i = 0; i < ie.length() - 1; i++) {
			soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
			peso--;
		}

		int resto = soma % 11;
		if (resto < 2) {
			d = 0;
		} else if (resto > 1) {
			d = 11 - resto;
		}

		// valida o digito verificador
		String dv = d + "";
		if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Goi&#65533;s
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIEGoias(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 9) {
			return false;
		}

		// v&#65533;lida os dois primeiros d&#65533;gito
		if (!"10".equals(ie.substring(0, 2))) {
			if (!"11".equals(ie.substring(0, 2))) {
				if (!"15".equals(ie.substring(0, 2))) {
					return false;
				}
			}
		}

		if (ie.substring(0, ie.length() - 1).equals("11094402")) {
			if (!ie.substring(ie.length() - 1, ie.length()).equals("0")) {
				if (!ie.substring(ie.length() - 1, ie.length()).equals("1")) {
					return false;
				}
			}
		} else {

			// C&#65533;lculo do d&#65533;gito verificador
			int soma = 0;
			int peso = 9;
			int d = -1; // d&#65533;gito verificador
			for (int i = 0; i < ie.length() - 1; i++) {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
				peso--;
			}

			int resto = soma % 11;
			long faixaInicio = 10103105;
			long faixaFim = 10119997;
			long insc = Long.parseLong(ie.substring(0, ie.length() - 1));
			if (resto == 0) {
				d = 0;
			} else if (resto == 1) {
				if (insc >= faixaInicio && insc <= faixaFim) {
					d = 1;
				} else {
					d = 0;
				}
			} else if (resto != 0 && resto != 1) {
				d = 11 - resto;
			}

			// valida o digito verificador
			String dv = d + "";
			if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Maranh&#65533;o
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIEMaranhao(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 9) {
			return false;
		}

		// valida os dois primeiros d&#65533;gitos
		if (!ie.substring(0, 2).equals("12")) {
			return false;
		}

		// Calcula o d&#65533;gito verificador
		int soma = 0;
		int peso = 9;
		int d = -1; // d&#65533;gito verificador
		for (int i = 0; i < ie.length() - 1; i++) {
			soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
			peso--;
		}

		d = 11 - (soma % 11);
		if ((soma % 11) == 0 || (soma % 11) == 1) {
			d = 0;
		}

		// valida o digito verificador
		String dv = d + "";
		if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Mato Grosso
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIEMatoGrosso(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 11) {
			return false;
		}

		// Calcula o d&#65533;gito verificador
		int soma = 0;
		int pesoInicial = 3;
		int pesoFinal = 9;
		int d = -1;

		for (int i = 0; i < ie.length() - 1; i++) {
			if (i < 2) {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoInicial;
				pesoInicial--;
			} else {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoFinal;
				pesoFinal--;
			}
		}

		d = 11 - (soma % 11);
		if ((soma % 11) == 0 || (soma % 11) == 1) {
			d = 0;
		}

		// valida o digito verificador
		String dv = d + "";
		if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Mato Grosso do Sul
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIEMatoGrossoSul(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 9) {
			return false;
		}

		// valida os dois primeiros d&#65533;gitos
		if (!ie.substring(0, 2).equals("28")) {
			return false;
		}

		// Calcula o d&#65533;gito verificador
		int soma = 0;
		int peso = 9;
		int d = -1; // d&#65533;gito verificador
		for (int i = 0; i < ie.length() - 1; i++) {
			soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
			peso--;
		}

		int resto = soma % 11;
		int result = 11 - resto;
		if (resto == 0) {
			d = 0;
		} else if (resto > 0) {
			if (result > 9) {
				d = 0;
			} else if (result < 10) {
				d = result;
			}
		}

		// valida o digito verificador
		String dv = d + "";
		if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Minas Gerais
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIEMinasGerais(String ie) {
		/*
		 * FORMATO GERAL: A1A2A3B1B2B3B4B5B6C1C2D1D2 Onde: A= C&#65533;digo do
		 * Munic&#65533;pio B= N&#65533;mero da inscri&#65533;&#65533;o C=
		 * N&#65533;mero de ordem do estabelecimento D= D&#65533;gitos de
		 * controle
		 */

		// valida quantida de d&#65533;gitos
		if (ie.length() != 13) {
			return false;
		}

		// iguala a casas para o c&#65533;lculo
		// em inserir o algarismo zero "0" imediatamente ap&#65533;s o
		// n&#65533;mero de c&#65533;digo do munic&#65533;pio,
		// desprezando-se os d&#65533;gitos de controle.
		String str = "";
		for (int i = 0; i < ie.length() - 2; i++) {
			if (Character.isDigit(ie.charAt(i))) {
				if (i == 3) {
					str += "0";
					str += ie.charAt(i);
				} else {
					str += ie.charAt(i);
				}
			}
		}

		// C&#65533;lculo do primeiro d&#65533;gito verificador
		int soma = 0;
		int pesoInicio = 1;
		int pesoFim = 2;
		int d1 = -1; // primeiro d&#65533;gito verificador
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				int x = Integer.parseInt(String.valueOf(str.charAt(i))) * pesoInicio;
				String strX = Integer.toString(x);
				for (int j = 0; j < strX.length(); j++) {
					soma += Integer.parseInt(String.valueOf(strX.charAt(j)));
				}
			} else {
				int y = Integer.parseInt(String.valueOf(str.charAt(i))) * pesoFim;
				String strY = Integer.toString(y);
				for (int j = 0; j < strY.length(); j++) {
					soma += Integer.parseInt(String.valueOf(strY.charAt(j)));
				}
			}
		}

		int dezenaExata = soma;
		while (dezenaExata % 10 != 0) {
			dezenaExata++;
		}
		d1 = dezenaExata - soma; // resultado - primeiro d&#65533;gito
									// verificador

		// C&#65533;lculo do segundo d&#65533;gito verificador
		soma = d1 * 2;
		pesoInicio = 3;
		pesoFim = 11;
		int d2 = -1;
		for (int i = 0; i < ie.length() - 2; i++) {
			if (i < 2) {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoInicio;
				pesoInicio--;
			} else {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoFim;
				pesoFim--;
			}
		}

		d2 = 11 - (soma % 11); // resultado - segundo d&#65533;gito verificador
		if ((soma % 11 == 0) || (soma % 11 == 1)) {
			d2 = 0;
		}

		// valida os digitos verificadores
		String dv = d1 + "" + d2;
		if (!dv.equals(ie.substring(ie.length() - 2, ie.length()))) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Par&#65533;
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIEPara(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 9) {
			return false;
		}

		// valida os dois primeiros d&#65533;gitos
		if (!ie.substring(0, 2).equals("15")) {
			return false;
		}

		// Calcula o d&#65533;gito verificador
		int soma = 0;
		int peso = 9;
		int d = -1; // d&#65533;gito verificador
		for (int i = 0; i < ie.length() - 1; i++) {
			soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
			peso--;
		}

		d = 11 - (soma % 11);
		if ((soma % 11) == 0 || (soma % 11) == 1) {
			d = 0;
		}

		// valida o digito verificador
		String dv = d + "";
		if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Para&#65533;ba
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIEParaiba(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 9) {
			return false;
		}

		// Calcula o d&#65533;gito verificador
		int soma = 0;
		int peso = 9;
		int d = -1; // d&#65533;gito verificador
		for (int i = 0; i < ie.length() - 1; i++) {
			soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
			peso--;
		}

		d = 11 - (soma % 11);
		if (d == 10 || d == 11) {
			d = 0;
		}

		// valida o digito verificador
		String dv = d + "";
		if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Paran&#65533;
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIEParana(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 10) {
			return false;
		}

		// C&#65533;lculo do primeiro d&#65533;gito
		int soma = 0;
		int pesoInicio = 3;
		int pesoFim = 7;
		int d1 = -1; // d&#65533;gito verificador
		for (int i = 0; i < ie.length() - 2; i++) {
			if (i < 2) {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoInicio;
				pesoInicio--;
			} else {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoFim;
				pesoFim--;
			}
		}

		d1 = 11 - (soma % 11);
		if ((soma % 11) == 0 || (soma % 11) == 1) {
			d1 = 0;
		}

		// c&#65533;lculo do segundo d&#65533;gito
		soma = d1 * 2;
		pesoInicio = 4;
		pesoFim = 7;
		int d2 = -1; // segundo d&#65533;gito
		for (int i = 0; i < ie.length() - 2; i++) {
			if (i < 3) {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoInicio;
				pesoInicio--;
			} else {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoFim;
				pesoFim--;
			}
		}

		d2 = 11 - (soma % 11);
		if ((soma % 11) == 0 || (soma % 11) == 1) {
			d2 = 0;
		}

		// valida os digitos verificadores
		String dv = d1 + "" + d2;
		if (!dv.equals(ie.substring(ie.length() - 2, ie.length()))) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Pernambuco
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIEPernambuco(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 14) {
			return false;
		}

		// C&#65533;lculo do d&#65533;gito verificador
		int soma = 0;
		int pesoInicio = 5;
		int pesoFim = 9;
		int d = -1; // d&#65533;gito verificador

		for (int i = 0; i < ie.length() - 1; i++) {
			if (i < 5) {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoInicio;
				pesoInicio--;
			} else {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoFim;
				pesoFim--;
			}
		}

		d = 11 - (soma % 11);
		if (d > 9) {
			d -= 10;
		}

		System.out.println(soma);
		System.out.println(11 - (soma % 11));
		System.out.println(d);

		// valida o digito verificador
		String dv = d + "";
		if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Piau&#65533;
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIEPiaui(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 9) {
			return false;
		}

		// C&#65533;lculo do d&#65533;gito verficador
		int soma = 0;
		int peso = 9;
		int d = -1; // d&#65533;gito verificador
		for (int i = 0; i < ie.length() - 1; i++) {
			soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
			peso--;
		}

		d = 11 - (soma % 11);
		if (d == 11 || d == 10) {
			d = 0;
		}

		// valida o digito verificador
		String dv = d + "";
		if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Rio de Janeiro
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIERioJaneiro(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 8) {
			return false;
		}

		// C&#65533;lculo do d&#65533;gito verficador
		int soma = 0;
		int peso = 7;
		int d = -1; // d&#65533;gito verificador
		for (int i = 0; i < ie.length() - 1; i++) {
			if (i == 0) {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * 2;
			} else {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
				peso--;
			}
		}

		d = 11 - (soma % 11);
		if ((soma % 11) <= 1) {
			d = 0;
		}

		// valida o digito verificador
		String dv = d + "";
		if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Rio Grande do Norte
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIERioGrandeNorte(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 10 && ie.length() != 9) {
			return false;
		}

		// valida os dois primeiros d&#65533;gitos
		if (!ie.substring(0, 2).equals("20")) {
			return false;
		}

		// calcula o d&#65533;gito para inscri&#65533;&#65533;o de 9
		// d&#65533;gitos
		if (ie.length() == 9) {
			int soma = 0;
			int peso = 9;
			int d = -1; // d&#65533;gito verificador
			for (int i = 0; i < ie.length() - 1; i++) {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
				peso--;
			}

			d = ((soma * 10) % 11);
			if (d == 10) {
				d = 0;
			}

			// valida o digito verificador
			String dv = d + "";
			if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
				return false;
			}
		} else {
			int soma = 0;
			int peso = 10;
			int d = -1; // d&#65533;gito verificador
			for (int i = 0; i < ie.length() - 1; i++) {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
				peso--;
			}
			d = ((soma * 10) % 11);
			if (d == 10) {
				d = 0;
			}

			// valida o digito verificador
			String dv = d + "";
			if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
				return false;
			}
		}

		return true;

	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Rio Grande do Sul
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIERioGrandeSul(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 10) {
			return false;
		}

		// C&#65533;lculo do d&#65533;fito verificador
		int soma = Integer.parseInt(String.valueOf(ie.charAt(0))) * 2;
		int peso = 9;
		int d = -1; // d&#65533;gito verificador
		for (int i = 1; i < ie.length() - 1; i++) {
			soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
			peso--;
		}

		d = 11 - (soma % 11);
		if (d == 10 || d == 11) {
			d = 0;
		}

		// valida o digito verificador
		String dv = d + "";
		if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Rond&#65533;nia
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIERondonia(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 14) {
			return false;
		}

		// C&#65533;lculo do d&#65533;gito verificador
		int soma = 0;
		int pesoInicio = 6;
		int pesoFim = 9;
		int d = -1; // d&#65533;gito verificador
		for (int i = 0; i < ie.length() - 1; i++) {
			if (i < 5) {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoInicio;
				pesoInicio--;
			} else {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoFim;
				pesoFim--;
			}
		}

		d = 11 - (soma % 11);
		if (d == 11 || d == 10) {
			d -= 10;
		}

		// valida o digito verificador
		String dv = d + "";
		if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Rora&#65533;ma
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIERoraima(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 9) {
			return false;
		}

		// valida os dois primeiros d&#65533;gitos
		if (!ie.substring(0, 2).equals("24")) {
			return false;
		}

		int soma = 0;
		int peso = 1;
		int d = -1; // d&#65533;gito verificador
		for (int i = 0; i < ie.length() - 1; i++) {
			soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
			peso++;
		}

		d = soma % 9;

		// valida o digito verificador
		String dv = d + "";
		if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Santa Catarina
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIESantaCatarina(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 9) {
			return false;
		}

		// C&#65533;lculo do d&#65533;fito verificador
		int soma = 0;
		int peso = 9;
		int d = -1; // d&#65533;gito verificador
		for (int i = 0; i < ie.length() - 1; i++) {
			soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
			peso--;
		}

		d = 11 - (soma % 11);
		if ((soma % 11) == 0 || (soma % 11) == 1) {
			d = 0;
		}

		// valida o digito verificador
		String dv = d + "";
		if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do S&#65533;o Paulo
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIESaoPaulo(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 12 && ie.length() != 13) {
			return false;
		}

		if (ie.length() == 12) {
			int soma = 0;
			int peso = 1;
			int d1 = -1; // primeiro d&#65533;gito verificador
			// c&#65533;lculo do primeiro d&#65533;gito verificador (nona
			// posi&#65533;&#65533;o)
			for (int i = 0; i < ie.length() - 4; i++) {
				if (i == 1 || i == 7) {
					soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * ++peso;
					peso++;
				} else {
					soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
					peso++;
				}
			}

			d1 = soma % 11;
			String strD1 = Integer.toString(d1); // O d&#65533;gito &#65533;
													// igual ao algarismo mais a
													// direita do resultado de
													// (soma % 11)
			d1 = Integer.parseInt(String.valueOf(strD1.charAt(strD1.length() - 1)));

			// c&#65533;lculo do segunfo d&#65533;gito
			soma = 0;
			int pesoInicio = 3;
			int pesoFim = 10;
			int d2 = -1; // segundo d&#65533;gito verificador
			for (int i = 0; i < ie.length() - 1; i++) {
				if (i < 2) {
					soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoInicio;
					pesoInicio--;
				} else {
					soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoFim;
					pesoFim--;
				}
			}

			d2 = soma % 11;
			String strD2 = Integer.toString(d2); // O d&#65533;gito &#65533;
													// igual ao algarismo mais a
													// direita do resultado de
													// (soma % 11)
			d2 = Integer.parseInt(String.valueOf(strD2.charAt(strD2.length() - 1)));

			// valida os d&#65533;gitos verificadores
			if (!ie.substring(8, 9).equals(d1 + "")) {
				return false;
			}
			if (!ie.substring(11, 12).equals(d2 + "")) {
				return false;
			}

		} else {
			// valida o primeiro caracter
			if (ie.charAt(0) != 'P') {
				return false;
			}

			String strIE = ie.substring(1, 10); // Obt&#65533;m somente os
												// d&#65533;gitos utilizados no
												// c&#65533;lculo do
												// d&#65533;gito verificador
			int soma = 0;
			int peso = 1;
			int d1 = -1; // primeiro d&#65533;gito verificador
			// c&#65533;lculo do primeiro d&#65533;gito verificador (nona
			// posi&#65533;&#65533;o)
			for (int i = 0; i < strIE.length() - 1; i++) {
				if (i == 1 || i == 7) {
					soma += Integer.parseInt(String.valueOf(strIE.charAt(i))) * ++peso;
					peso++;
				} else {
					soma += Integer.parseInt(String.valueOf(strIE.charAt(i))) * peso;
					peso++;
				}
			}

			d1 = soma % 11;
			String strD1 = Integer.toString(d1); // O d&#65533;gito &#65533;
													// igual ao algarismo mais a
													// direita do resultado de
													// (soma % 11)
			d1 = Integer.parseInt(String.valueOf(strD1.charAt(strD1.length() - 1)));

			// valida o d&#65533;gito verificador
			if (!ie.substring(9, 10).equals(d1 + "")) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Sergipe
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIESergipe(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 9) {
			return false;
		}

		// c&#65533;lculo do d&#65533;gito verificador
		int soma = 0;
		int peso = 9;
		int d = -1; // d&#65533;gito verificador
		for (int i = 0; i < ie.length() - 1; i++) {
			soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
			peso--;
		}

		d = 11 - (soma % 11);
		if (d == 11 || d == 11 || d == 10) {
			d = 0;
		}

		// valida o digito verificador
		String dv = d + "";
		if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Tocantins
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIETocantins(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 9 && ie.length() != 11) {
			return false;
		} else if (ie.length() == 9) {
			ie = ie.substring(0, 2) + "02" + ie.substring(2);
		}

		int soma = 0;
		int peso = 9;
		int d = -1; // d&#65533;gito verificador
		for (int i = 0; i < ie.length() - 1; i++) {
			if (i != 2 && i != 3) {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * peso;
				peso--;
			}
		}
		d = 11 - (soma % 11);
		if ((soma % 11) < 2) {
			d = 0;
		}

		// valida o digito verificador
		String dv = d + "";
		if (!ie.substring(ie.length() - 1, ie.length()).equals(dv)) {
			return false;
		}

		return true;
	}

	/**
	 * Valida inscri&#65533;&#65533;o estadual do estado do Distrito Federal
	 * 
	 * @param ie
	 *            (Inscri&#65533;&#65533;o estadual)
	 * @throws Exception
	 */
	private boolean validaIEDistritoFederal(String ie) {
		// valida quantida de d&#65533;gitos
		if (ie.length() != 13) {
			return false;
		}

		// c&#65533;lculo do primeiro d&#65533;gito verificador
		int soma = 0;
		int pesoInicio = 4;
		int pesoFim = 9;
		int d1 = -1; // primeiro d&#65533;gito verificador
		for (int i = 0; i < ie.length() - 2; i++) {
			if (i < 3) {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoInicio;
				pesoInicio--;
			} else {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoFim;
				pesoFim--;
			}
		}

		d1 = 11 - (soma % 11);
		if (d1 == 11 || d1 == 10) {
			d1 = 0;
		}

		// c&#65533;lculo do segundo d&#65533;gito verificador
		soma = d1 * 2;
		pesoInicio = 5;
		pesoFim = 9;
		int d2 = -1; // segundo d&#65533;gito verificador
		for (int i = 0; i < ie.length() - 2; i++) {
			if (i < 4) {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoInicio;
				pesoInicio--;
			} else {
				soma += Integer.parseInt(String.valueOf(ie.charAt(i))) * pesoFim;
				pesoFim--;
			}
		}

		d2 = 11 - (soma % 11);
		if (d2 == 11 || d2 == 10) {
			d2 = 0;
		}

		// valida os digitos verificadores
		String dv = d1 + "" + d2;
		if (!dv.equals(ie.substring(ie.length() - 2, ie.length()))) {
			return false;
		}

		return true;
	}

}
