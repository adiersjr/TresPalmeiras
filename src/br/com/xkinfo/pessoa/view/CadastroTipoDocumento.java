package br.com.xkinfo.pessoa.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.xkinfo.pessoa.model.TipoDocumento;
import br.com.xkinfo.service.ServiceFactory;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;

public class CadastroTipoDocumento extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private static final long serialVersionUID = 1L;
	private TipoDocumento tipoDocumento;
	private JTextField tfDescricao;
	private JTextField tfCodigo;
	private String botao;
	private int controle;
	private JButton btnExcluir;
	private JCheckBox cbPessoal;

	public CadastroTipoDocumento() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		botao = "Inserir";
		inicio();
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		controle = 0;
		btnExcluir.setVisible(false);
	}

	public CadastroTipoDocumento(TipoDocumento tipoDocumento){
		setModalityType(ModalityType.APPLICATION_MODAL);
		botao = "Alterar";
		inicio();
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.tipoDocumento = tipoDocumento;
		tfCodigo.setText(String.valueOf(tipoDocumento.getId()));
		tfDescricao.setText(tipoDocumento.getDescricao());
		cbPessoal.setSelected(tipoDocumento.isPessoal());
		controle = 1;
	}


	private void inicio(){
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.WEST);
		JLabel lblCodigo = new JLabel("C\u00F3digo:");
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o:");
		tfDescricao = new JTextField();
		tfDescricao.setColumns(10);
		tfCodigo = new JTextField();
		tfCodigo.setEnabled(false);
		tfCodigo.setEditable(false);
		tfCodigo.setColumns(10);

		cbPessoal = new JCheckBox("Pessoal");
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
				gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(cbPessoal)
								.addGroup(gl_contentPanel.createSequentialGroup()
										.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(lblDescricao)
												.addComponent(lblCodigo))
										.addGap(18)
										.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
												.addComponent(tfCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(tfDescricao, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(182, Short.MAX_VALUE))
				);
		gl_contentPanel.setVerticalGroup(
				gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
						.addContainerGap(81, Short.MAX_VALUE)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCodigo)
								.addComponent(tfCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(tfDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDescricao))
						.addGap(18)
						.addComponent(cbPessoal)
						.addGap(44))
				);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnInserir = new JButton(botao);
				btnInserir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						btnOk(e);
					}
				});
				buttonPane.add(btnInserir);
			}
			{
				btnExcluir = new JButton("Excluir");
				btnExcluir.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						btnExcluir(e);
					}
				});
				btnExcluir.setActionCommand("OK");
				buttonPane.add(btnExcluir);
				getRootPane().setDefaultButton(btnExcluir);
			}
			{
				JButton btnSair = new JButton("Sair");
				btnSair.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						btnSair(e);
					}
				});
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
				if (ServiceFactory.getTipodocumentoservice().incluirTipoDocumento(tfDescricao.getText(), cbPessoal.isSelected())){
					dispose();
				};
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} else {              // ALTERAR
			try {
				if(ServiceFactory.getTipodocumentoservice().alterarTipoDocumento(Integer.parseInt(tfCodigo.getText()), tfDescricao.getText(), cbPessoal.isSelected())){
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
			if (ServiceFactory.getTipodocumentoservice().excluirTipoDocumento(tipoDocumento.getId()))
			dispose();
	} catch (Exception e1) {
		e1.printStackTrace();
	}
}

}
