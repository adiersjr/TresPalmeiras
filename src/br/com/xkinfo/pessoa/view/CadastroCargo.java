package br.com.xkinfo.pessoa.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import br.com.xkinfo.pessoa.model.Cargo;
import br.com.xkinfo.service.ServiceFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;

public class CadastroCargo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private static final long serialVersionUID = 1L;
	private JTextField tfDescricao;
	private String botao;
	private JTextField tfCodigo;
	private int controle;
	private JButton btnExcluir;
	private Cargo cargo;

	public CadastroCargo(){
		setModalityType(ModalityType.APPLICATION_MODAL);
		botao = "Inserir";
		inicio();
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		controle = 0;
		btnExcluir.setVisible(false);
	}

	public CadastroCargo(Cargo cargo) {
		setModalityType(ModalityType.APPLICATION_MODAL);
		botao = "Alterar";
		inicio();
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		tfCodigo.setText(String.valueOf(cargo.getId()).trim());
		tfDescricao.setText(cargo.getDescricao().trim());
		controle = 1;
		this.cargo = cargo;
	}

	public void inicio() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JLabel lblCodigo = new JLabel("C\u00F3digo:");
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o:");
		tfCodigo = new JTextField();
		tfCodigo.setEditable(false);
		tfCodigo.setEnabled(false);
		tfCodigo.setColumns(10);
		tfDescricao = new JTextField();
		tfDescricao.setColumns(10);
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
				gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPanel.createSequentialGroup()
										.addComponent(lblCodigo)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(tfCodigo, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPanel.createSequentialGroup()
										.addComponent(lblDescricao)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(tfDescricao, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(189, Short.MAX_VALUE))
				);
		gl_contentPanel.setVerticalGroup(
				gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
						.addGap(21)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCodigo)
								.addComponent(tfCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDescricao)
								.addComponent(tfDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(145, Short.MAX_VALUE))
				);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnIncluir = new JButton(botao);
				btnIncluir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						btnOk(e);
					}
				});
				btnIncluir.setActionCommand("OK");
				buttonPane.add(btnIncluir);
				getRootPane().setDefaultButton(btnIncluir);
			}
			{
				JButton btnSair = new JButton("Sair");
				btnSair.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						btnSair(e);
					}
				});
				
				btnExcluir = new JButton("Excluir");
				btnExcluir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						btnExcluir(e);
					}
				});
				buttonPane.add(btnExcluir);
				btnSair.setActionCommand("Cancel");
				buttonPane.add(btnSair);
			}
		}
	}

	private void btnSair(ActionEvent e){
		dispose();
	}

	private void btnOk(ActionEvent e){
		if (controle == 0){   // INCLUIR
			try {
				if (ServiceFactory.getCargoservice().incluirCargo(tfDescricao.getText())){
					dispose();
				};
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} else {              // ALTERAR
			try {
				if(ServiceFactory.getCargoservice().alterarCargo(Integer.parseInt(tfCodigo.getText()), tfDescricao.getText())){
					dispose();
				};
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}	
		}
	}

	private void btnExcluir(ActionEvent e){
		try {
			 if (ServiceFactory.getCargoservice().excluirCargo(cargo.getId())){
				 dispose();
			 };
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
