package br.com.xkinfo.pessoa.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import br.com.xkinfo.pessoa.model.Funcionario;
import br.com.xkinfo.service.ServiceFactory;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;

public class CadastroFuncionario extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	
	private String botao;
	
	private int controle;
	private JButton btnExcluir;
	private Funcionario funcionario;
	private JTextField tfCodigo;
	private JTextField tfNome;
	private JTextField tfUsuario;
	private JPasswordField tfSenha;
	
	public CadastroFuncionario() {
		setModalityType(ModalityType.APPLICATION_MODAL);
		botao = "Inserir";
		inicio();
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		controle = 0;
		btnExcluir.setVisible(false);
	}
	
	public CadastroFuncionario (Funcionario funcionario){
		setModalityType(ModalityType.APPLICATION_MODAL);
		botao = "Alterar";
		inicio();
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		
		controle = 1;
		this.funcionario = funcionario;
	}
	
	private void inicio(){
		setBounds(100, 100, 600, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblCodigo = new JLabel("C\u00F3d.:");
		
		tfCodigo = new JTextField();
		tfCodigo.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		
		tfNome = new JTextField();
		tfNome.setColumns(10);
		
		JCheckBox cbAtivo = new JCheckBox("Ativo");
		
		JLabel lblUsuario = new JLabel("Usu\u00E1rio:");
		
		JLabel lblSenha = new JLabel("Senha:");
		
		tfUsuario = new JTextField();
		tfUsuario.setColumns(10);
		
		tfSenha = new JPasswordField();
		
		JLabel lblDatanascimento = new JLabel("Data de Nascimento:");
		
		JFormattedTextField tfNascimento = new JFormattedTextField();
		
		JCheckBox cbControleAcesso = new JCheckBox("Controle de Acesso");
		
		JComboBox cbCargo = new JComboBox();
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblCodigo)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(tfCodigo, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(lblNome)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfNome, GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
							.addGap(18)
							.addComponent(cbAtivo))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(Alignment.LEADING, gl_contentPanel.createSequentialGroup()
									.addComponent(lblDatanascimento)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfNascimento))
								.addGroup(Alignment.LEADING, gl_contentPanel.createSequentialGroup()
									.addComponent(lblUsuario)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(tfUsuario, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addComponent(lblSenha)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfSenha, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
						.addComponent(cbControleAcesso)
						.addComponent(cbCargo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCodigo)
						.addComponent(tfCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNome)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbAtivo))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUsuario)
						.addComponent(tfUsuario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSenha)
						.addComponent(tfSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDatanascimento)
						.addComponent(tfNascimento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(cbControleAcesso)
					.addGap(18)
					.addComponent(cbCargo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(91, Short.MAX_VALUE))
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnIncluir = new JButton(botao);
				buttonPane.add(btnIncluir);
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
			 if (ServiceFactory.getFuncionarioservice().excluirFuncionario(funcionario.getId())){
				 dispose();
			 };
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
