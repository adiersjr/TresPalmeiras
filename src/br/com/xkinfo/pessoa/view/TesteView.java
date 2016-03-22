package br.com.xkinfo.pessoa.view;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;

public class TesteView extends JPanel {

	/**
	 * Create the panel.
	 */
	public TesteView() {
		
		JLabel lblTesteDeTela = new JLabel("teste de tela");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(218, Short.MAX_VALUE)
					.addComponent(lblTesteDeTela)
					.addGap(186))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(133)
					.addComponent(lblTesteDeTela)
					.addContainerGap(153, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
