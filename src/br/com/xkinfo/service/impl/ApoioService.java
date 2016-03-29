package br.com.xkinfo.service.impl;

import java.awt.Color;
import java.awt.Component;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import br.com.xkinfo.service.IApoioService;

public class ApoioService implements IApoioService{

	String numeros = "0123456789";
	String especiais = "!@#$%/ï¿½*()_+ï¿½ï¿½ï¿½\\ï¿½ï¿½ï¿½=\"ï¿½?|ï¿½[]ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½ï¿½|ï¿½~;,<>:^}'`{";
	private static MessageDigest md = null;

	static {
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public String converteDataBanco(Calendar data) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd");
		String dia = sdf.format(data.getTime());
		return dia;
	}

	public String converteDataBrasil (Calendar data) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("dd/MM/yyyy");
		String dia = sdf.format(data.getTime());
		return dia;
	}

	@Override
	public Integer converteBoolean(boolean campo) throws Exception {
		Integer ret = null;
		if (campo == true){
			ret = 1;
		}
		if (campo == false) {
			ret = 0;
		}
		return ret;
	}

	@Override
	public Calendar converteCalendar(Date data) throws Exception{
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
		return cal;
	}

	@Override
	public String formatar(String valor, String mascara) {
		String dado = "";
		for (int i = 0; i < valor.length(); i++) {
			char c = valor.charAt(i);
			if (Character.isDigit(c)) {
				dado += c;
			}
		}
		int indMascara = mascara.length();
		int indCampo = dado.length();

		for (; indCampo > 0 && indMascara > 0;) {
			if (mascara.charAt(--indMascara) == '#') {
				indCampo--;
			}
		}
		String saida = "";
		for (; indMascara < mascara.length(); indMascara++) {
			saida += ((mascara.charAt(indMascara) == '#') ? dado.charAt(indCampo++) : mascara.charAt(indMascara));
		}
		return saida;
	}

	@Override
	public String formatarCPF(String cpf) throws Exception {
		while (cpf.length() < 11) {
			cpf = "0" + cpf;
		}
		return formatar(cpf, "###.###.###-##");
	}

	@Override
	public String formatarCNPJ(String cnpj) throws Exception {
		while (cnpj.length() < 14) {
			cnpj = "0" + cnpj;
		}
		return formatar(cnpj, "##.###.###/####-##");
	}

	@Override
	public String formatarCEP(long cep) throws Exception {
		long cep1, cep2;
		cep1 = cep / 1000;
		cep2 = cep % 1000;
		return String.format("%05d-%03d", cep1, cep2);
	}

	@Override
	public String formatarTelefone(String telefone) throws Exception {
		if (telefone.length() > 11) {
			return formatar(telefone, "(0##)#####-####");
		} else {
			return formatar(telefone, "(0##)####-####");
		}
	}

	@Override
	public String formatarZerosEsquerda(int numero, int tamanho) throws Exception {
		return String.format("%0" + String.valueOf(tamanho) + "d", numero);

	}

	@SuppressWarnings("rawtypes")
	@Override
	public void setComboBoxValue(JComboBox comboBox, String value) throws Exception {
		String item = "";
		for (int i = 0; i < comboBox.getItemCount(); i++) {
			item = comboBox.getItemAt(i).toString();
			if (item.equals(value)) {
				comboBox.setSelectedIndex(i);
				break;
			}
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void limpaCampos(JFrame frame) throws Exception {
		Component componentes[] = ((JPanel) frame.getContentPane()).getComponents();
		for (Component c : componentes) {
			if (c instanceof JTextField) {
				((JTextField) c).setText("");
			} else if (c instanceof JTextArea) {
				((JTextArea) c).setText("");
			} else if (c instanceof JComboBox) {
				((JComboBox) c).setSelectedIndex(0);
			} else if (c instanceof JRadioButton) {
				((JRadioButton) c).setSelected(true);
			}
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void limpaCampos(JPanel panel) throws Exception {
		Component componentes[] = panel.getComponents();
		for (Component c : componentes) {
			if (c instanceof JTextField) {
				((JTextField) c).setText("");
			} else if (c instanceof JTextArea) {
				((JTextArea) c).setText("");
			} else if (c instanceof JComboBox) {
				((JComboBox) c).setSelectedIndex(0);
			} else if (c instanceof JRadioButton) {
				((JRadioButton) c).setSelected(true);
			}
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void limpaCampos(JDialog dialog) throws Exception {
		Component componentes[] = ((JPanel) dialog.getContentPane()).getComponents();
		for (Component c : componentes) {
			if (c instanceof JTextField) {
				((JTextField) c).setText("");
			} else if (c instanceof JTextArea) {
				((JTextArea) c).setText("");
			} else if (c instanceof JComboBox) {
				((JComboBox) c).setSelectedIndex(0);
			} else if (c instanceof JRadioButton) {
				((JRadioButton) c).setSelected(true);
			}
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void desabilitaCampos(JFrame frame) throws Exception {
		Component componentes[] = ((JPanel) frame.getContentPane()).getComponents();
		for (Component c : componentes) {
			if (c instanceof JTextField) {
				((JTextField) c).setEnabled(false);
			} else if (c instanceof JTextArea) {
				((JTextArea) c).setEnabled(false);
			} else if (c instanceof JComboBox) {
				((JComboBox) c).setEnabled(false);
			} else if (c instanceof JRadioButton) {
				((JRadioButton) c).setEnabled(false);
			}
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void desabilitaCampos(JPanel panel) throws Exception {
		Component componentes[] = panel.getComponents();
		for (Component c : componentes) {
			if (c instanceof JTextField) {
				((JTextField) c).setEnabled(false);
			} else if (c instanceof JTextArea) {
				((JTextArea) c).setEnabled(false);
			} else if (c instanceof JComboBox) {
				((JComboBox) c).setEnabled(false);
			} else if (c instanceof JRadioButton) {
				((JRadioButton) c).setEnabled(false);
			}
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void desabilitaCampos(JDialog dialog) throws Exception {
		Component componentes[] = ((JPanel) dialog.getContentPane()).getComponents();
		for (Component c : componentes) {
			if (c instanceof JTextField) {
				((JTextField) c).setEnabled(false);
			} else if (c instanceof JTextArea) {
				((JTextArea) c).setEnabled(false);
			} else if (c instanceof JComboBox) {
				((JComboBox) c).setEnabled(false);
			} else if (c instanceof JRadioButton) {
				((JRadioButton) c).setEnabled(false);
			}
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void habilitaCampos(JFrame frame) throws Exception {
		Component componentes[] = ((JPanel) frame.getContentPane()).getComponents();
		for (Component c : componentes) {
			if (c instanceof JTextField) {
				((JTextField) c).setEnabled(true);
			} else if (c instanceof JTextArea) {
				((JTextArea) c).setEnabled(true);
			} else if (c instanceof JComboBox) {
				((JComboBox) c).setEnabled(true);
			} else if (c instanceof JRadioButton) {
				((JRadioButton) c).setEnabled(true);
			}
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void habilitaCampos(JPanel panel) throws Exception {
		Component componentes[] = panel.getComponents();
		for (Component c : componentes) {
			if (c instanceof JTextField) {
				((JTextField) c).setEnabled(true);
			} else if (c instanceof JTextArea) {
				((JTextArea) c).setEnabled(true);
			} else if (c instanceof JComboBox) {
				((JComboBox) c).setEnabled(true);
			} else if (c instanceof JRadioButton) {
				((JRadioButton) c).setEnabled(true);
			}
		}
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void habilitaCampos(JDialog dialog) throws Exception {
		Component componentes[] = ((JPanel) dialog.getContentPane()).getComponents();
		for (Component c : componentes) {
			if (c instanceof JTextField) {
				((JTextField) c).setEnabled(true);
			} else if (c instanceof JTextArea) {
				((JTextArea) c).setEnabled(true);
			} else if (c instanceof JComboBox) {
				((JComboBox) c).setEnabled(true);
			} else if (c instanceof JRadioButton) {
				((JRadioButton) c).setEnabled(true);
			}
		}
	}

	@Override
	public boolean isCNPJ(String cnpj) throws Exception {
		// considera-se erro CNPJ's formados por uma sequencia de numeros iguais
		if (cnpj.equals("00000000000000") || cnpj.equals("11111111111111")
				|| cnpj.equals("22222222222222") || cnpj.equals("33333333333333")
				|| cnpj.equals("44444444444444") || cnpj.equals("55555555555555")
				|| cnpj.equals("66666666666666") || cnpj.equals("77777777777777")
				|| cnpj.equals("88888888888888") || cnpj.equals("99999999999999")
				|| (cnpj.length() != 14)) {
			return (false);
		}
		char dig13, dig14;
		int sm, i, r, num, peso;
		try {
			// Calculo do 1o. Digito Verificador
			sm = 0;
			peso = 2;
			for (i = 11; i >= 0; i--) {
				num = (int) (cnpj.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso + 1;
				if (peso == 10) {
					peso = 2;
				}
			}
			r = sm % 11;
			if ((r == 0) || (r == 1)) {
				dig13 = '0';
			} else {
				dig13 = (char) ((11 - r) + 48);
			}
			// Calculo do 2o. Digito Verificador
			sm = 0;
			peso = 2;
			for (i = 12; i >= 0; i--) {
				num = (int) (cnpj.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso + 1;
				if (peso == 10) {
					peso = 2;
				}
			}
			r = sm % 11;
			if ((r == 0) || (r == 1)) {
				dig14 = '0';
			} else {
				dig14 = (char) ((11 - r) + 48);
			}
			if ((dig13 == cnpj.charAt(12)) && (dig14 == cnpj.charAt(13))) {
				return (true);
			} else {
				return (false);
			}
		} catch (InputMismatchException erro) {
			return (false);
		}
	}

	@Override
	public boolean isCPF(String cpf) throws Exception {
		// considera-se erro CPF's formados por uma sequencia de numeros iguais
		if (cpf.equals("00000000000") || cpf.equals("11111111111")
				|| cpf.equals("22222222222") || cpf.equals("33333333333")
				|| cpf.equals("44444444444") || cpf.equals("55555555555")
				|| cpf.equals("66666666666") || cpf.equals("77777777777")
				|| cpf.equals("88888888888") || cpf.equals("99999999999")
				|| (cpf.length() != 11)) {
			return (false);
		}
		char dig10, dig11;
		int sm, i, r, num, peso;
		try {
			// Calculo do 1o. Digito Verificador
			sm = 0;
			peso = 10;
			for (i = 0; i < 9; i++) {
				// (48 eh a posicao de '0' na tabela ASCII)
				num = (int) (cpf.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}
			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11)) {
				dig10 = '0';
			} else {
				dig10 = (char) (r + 48); // converte no respectivo caractere numerico
			}
			// Calculo do 2o. Digito Verificador
			sm = 0;
			peso = 11;
			for (i = 0; i < 10; i++) {
				num = (int) (cpf.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso - 1;
			}
			r = 11 - (sm % 11);
			if ((r == 10) || (r == 11)) {
				dig11 = '0';
			} else {
				dig11 = (char) (r + 48);
			}
			if ((dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10))) {
				return (true);
			} else {
				return (false);
			}
		} catch (InputMismatchException erro) {
			return (false);
		}
	}

	@Override
	public boolean isEmail(String email) throws Exception {
		return !(email.contains("@") && email.contains(".") && !email.contains("@."));
	}

	@Override
	public int getModulo10(String numero) {
		int acumulador = 0;
		int resto = 0;
		int dv = 0;
		String[] numeros = new String[numero.length() + 1];
		int multiplicador = 2;
		String aux;
		String aux2;
		String aux3;
		for (int i = numero.length(); i > 0; i--) {
			//Multiplica da direita pra esquerda, alternando os algarismos 2 e 1  
			if (multiplicador % 2 == 0) {
				// pega cada numero isoladamente    
				numeros[i] = String.valueOf(Integer.valueOf(numero.substring(i - 1, i)) * 2);
				multiplicador = 1;
			} else {
				numeros[i] = String.valueOf(Integer.valueOf(numero.substring(i - 1, i)) * 1);
				multiplicador = 2;
			}
		}
		for (int i = (numeros.length - 1); i > 0; i--) {
			aux = String.valueOf(Integer.valueOf(numeros[i]));
			if (aux.length() > 1) {
				aux2 = aux.substring(0, aux.length() - 1);
				aux3 = aux.substring(aux.length() - 1, aux.length());
				numeros[i] = String.valueOf(Integer.valueOf(aux2) + Integer.valueOf(aux3));
			} else {
				numeros[i] = aux;
			}
		}
		for (int i = numeros.length; i > 0; i--) {
			if (numeros[i - 1] != null) {
				acumulador += Integer.valueOf(numeros[i - 1]);
			}
		}
		resto = acumulador % 10;
		if (resto > 0) {
			dv = 10 - resto;
		} else {
			dv = 0;
		}
		return dv;
	}

	@Override
	public int getModulo11(String numero) {
		//variáveis de instancia  
		int acumulador = 0;
		int resto = 0;
		int dv = 0;
		String[] numeros = new String[numero.length() + 1];
		int multiplicador = 2;
		for (int i = numero.length(); i > 0; i--) {
			//Multiplica da direita pra esquerda, incrementando o multiplicador de 2 a 9  
			//Caso o multiplicador seja maior que 9 o mesmo recomeça em 2  
			if (multiplicador > 9) {
				// pega cada numero isoladamente    
				multiplicador = 2;
				numeros[i] = String.valueOf(Integer.valueOf(numero.substring(i - 1, i)) * multiplicador);
				multiplicador++;
			} else {
				numeros[i] = String.valueOf(Integer.valueOf(numero.substring(i - 1, i)) * multiplicador);
				multiplicador++;
			}
		}
		for (int i = numeros.length; i > 0; i--) {
			if (numeros[i - 1] != null) {
				acumulador += Integer.valueOf(numeros[i - 1]);
			}
		}
		resto = acumulador % 11;
		dv = 11 - resto;
		return dv;
	}

	@Override
	public boolean isNumero(String texto) {
		for (int i = 0; i < texto.length(); i++) {
			if (numeros.indexOf(texto.substring(i, i + 1)) == -1) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isTemNumero(String texto) throws Exception {
		for (int i = 0; i < texto.length(); i++) {
			if (numeros.indexOf(texto.substring(i, i + 1)) != -1) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isCaracterEspecial(String texto) throws Exception {
		for (int i = 0; i < texto.length(); i++) {
			if (especiais.indexOf(texto.substring(i, i + 1)) != -1) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean isData(String data) throws Exception {
		//Valida todo o formato da data, bem como se o dia sao validos para o mes informado, anos bissextos e etc.
		//nao valida se a data informada e superior que data atual, pois o sistema aceitaria, em algumas ocasioes, datas futuras.
		data = data.trim();
		if (data.length() == 10) {
			if (!data.substring(2, 3).equals("/") || !data.substring(5, 6).equals("/")) {
				throw new Exception("Formato de data invalido!\nA data deve estar no formato dd/mm/aaaa.");
			} else {
				String aux = "";
				for (int i = 0; i < data.length(); i++) {
					aux = data.substring(i, i + 1);
					if (i != 2 && i != 5 && !isNumero(aux)) {
						throw new Exception("A data nao pode conter letras ou caracteres especiais,\nexceto barras de separacao (/)");
					}
				}
			}
		} else {
			throw new Exception("Formato de data invalido!\nA data deve estar no formato dd/mm/aaaa.");
		}
		int ano = Integer.parseInt(data.substring(6, 10));
		if (ano < 1900) {
			throw new Exception("Data muito antiga, nao suportada pelo sistema!\nSera possivel o cadastro de datas superiores ao ano de 1900.");
		}
		int mes = Integer.parseInt(data.substring(3, 5));
		int dia = Integer.parseInt(data.substring(0, 2));
		int numeroDias = 0;
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
			numeroDias = 31;
		} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			numeroDias = 30;
		} else if (ano % 4 == 0) {
			numeroDias = 29;
		} else {
			numeroDias = 28;
		}
		if (dia <= 0 || dia > numeroDias) {
			throw new Exception("O dia informado e invalido!");
		} else if (mes <= 0 || mes > 12) {
			throw new Exception("O mes informado e invalido!");
		}
		return true;
	}

	@SuppressWarnings("deprecation")
	public static String devolveData(Date d) {
		int aux;
		String data = "";
		if (d.getDate() < 10) {
			data += "0" + d.getDate();
		} else {
			data += d.getDate();
		}
		data = data + "/";
		if ((d.getMonth() + 1) < 10) {
			aux = d.getMonth() + 1;
			data += "0" + aux;
		} else {
			aux = d.getMonth() + 1;
			data += aux;
		}
		data = data + "/";
		aux = d.getYear() + 1900;
		data += aux + "";
		return data;
	}

	@SuppressWarnings("deprecation")
	public static Date devolveData(String dt) throws Exception {
		// RETORNA NULL SE A DATA NÃO ESTIVER SIDO PREENCHIDA
		if (dt.substring(0, 2).equals("  ")) {
			return null;
		}

		String data = "";
		data = dt.substring(3, 5) + "/" + dt.substring(0, 2) + "/" + dt.substring(6, 10);
		Date d;
		try {
			d = new Date(data);
		} catch (Exception e) {
			throw new Exception("Data invalida!");
		}
		return d;
	}

	public JTextField errado(JTextField t) {
		t.setBackground(new Color(255, 0, 0));
		return t;

	}

	public JTextArea errado(JTextArea t) {
		t.setBackground(new Color(255, 0, 0));
		return t;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox errado(JComboBox t) {
		t.setBackground(new Color(255, 0, 0));
		return t;
	}

	public JRadioButton errado(JRadioButton t) {
		t.setBackground(new Color(255, 0, 0));
		return t;
	}

	public JCheckBox errado(JCheckBox t) {
		t.setBackground(new Color(255, 0, 0));
		return t;
	}

	public JTextField certo(JTextField t) {
		t.setBackground(new Color(255, 255, 255));
		return t;

	}

	public JTextArea certo(JTextArea t) {
		t.setBackground(new Color(255, 255, 255));
		return t;
	}

	@SuppressWarnings("rawtypes")
	public JComboBox certo(JComboBox t) {
		t.setBackground(new Color(255, 255, 255));
		return t;
	}

	public JRadioButton certo(JRadioButton t) {
		t.setBackground(new Color(255, 255, 255));
		return t;
	}

	public JCheckBox certo(JCheckBox t) {
		t.setBackground(new Color(255, 255, 255));
		return t;
	}

	@Override
	public boolean isTelefone(String telefone) throws Exception {
		telefone = telefone.trim();
		if (telefone.length() == 13) {
			for (int i = 0; i < telefone.length(); i++) {
				if (telefone.substring(i, i + 1).equals("(") || telefone.substring(i, i + 1).equals(")")) {
					if (isNumero(telefone.substring(i + 1, i + 2)) == false && isNumero(telefone.substring(i + 2, i + 3)) == false) {
						throw new Exception("O telefone/fax nao pode conter separacoes sequidas!");
					}
				} else if (telefone.substring(i, i + 1).equals("-")) {
					if (isNumero(telefone.substring(i + 1, i + 2)) == false && isNumero(telefone.substring(i + 2, i + 3)) == false && isNumero(telefone.substring(i + 3, i + 4)) == false && isNumero(telefone.substring(i + 4, i + 5)) == false) {
						throw new Exception("O telefone/fax nao pode conter separacoes seguidas!\n Os parenteses devem conter 2(dois) numeros entre si, e deve-se ter 4(quatro) numeros apos o hifen!");
					}
				} else if (isNumero(telefone.substring(i, i + 1)) == false) {
					throw new Exception("O telefone/fax nao pode conter numeros e suas separacoes!");
				}
			}
		} else {
			throw new Exception("O formato do telefone/fax é (XX)XXXX-XXXX.\nDigite um telefone/fax no formato válido.");
		}
		return true;
	}

	@Override
	public boolean isCEP(String aux) throws Exception {
		aux = aux.trim();
		if (aux.length() == 9) {
			if (isNumero(aux.substring(0, 5)) == true && isNumero(aux.substring(6, 9)) == true) {
				if (aux.substring(5, 6).equals("-")) {
					return true;
				} else {
					throw new Exception("O formato do CEP é XXXXX-XXX.\nDigite um CEP no formato valido.");
				}
			} else {
				throw new Exception("O formato do CEP é XXXXX-XXX.\nDigite um CEP no formato valido.");
			}
		} else {
			throw new Exception("O formato do CEP é XXXXX-XXX.\nDigite um CEP no formato valido.");
		}
	}

	@Override
	public String devolveValorExibicao(double num) throws Exception {
		DecimalFormat f = new DecimalFormat("######0.00");
		String aux = "" + f.format(num);
		return aux;
	}

	@Override
	public double devolverValorDouble(String texto) throws Exception {
		texto = texto.replace(',', '.');
		DecimalFormat f = new DecimalFormat("######0.00");
		try {
			double aux = Double.parseDouble(texto);
			f.format(aux);
			return aux;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Numero inválido!");
		}
	}

	private static char[] hexCodes(byte[] text) {
		char[] hexOutput = new char[text.length * 2];
		String hexString;
		for (int i = 0; i < text.length; i++) {
			hexString = "00" + Integer.toHexString(text[i]);
			hexString.toUpperCase().getChars(hexString.length() - 2, hexString.length(), hexOutput, i * 2);
		}
		return hexOutput;
	}

	@Override
	public String criptografar(String pwd) {
		if (md != null) {
			return new String(hexCodes(md.digest(pwd.getBytes())));
		}
		return null;
	}
}
