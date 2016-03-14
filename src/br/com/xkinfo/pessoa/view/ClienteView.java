package br.com.xkinfo.pessoa.view;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;

public class ClienteView extends JPanel {

	/**
	 * Create the panel.
	 */
	public ClienteView() {
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Cadastro de Clientes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

	}

}
