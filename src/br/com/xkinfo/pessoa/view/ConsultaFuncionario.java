package br.com.xkinfo.pessoa.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import br.com.xkinfo.pessoa.model.Funcionario;
import br.com.xkinfo.pessoa.util.FuncionarioTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class ConsultaFuncionario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private static final long serialVersionUID = 1L;
	private JTextField tfDescricao;
	private JTable tabela;
	@SuppressWarnings("rawtypes")
	private JComboBox cbDescricao;

	public ConsultaFuncionario() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				ativar(e);
			}
		});
		inicio();
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		montarTabela();
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void inicio(){
		setModalityType(ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		cbDescricao = new JComboBox();
		cbDescricao.setModel(new DefaultComboBoxModel(new String[] {"Nome", "Usu\u00E1rio"}));
		
		tfDescricao = new JTextField();
		tfDescricao.setColumns(10);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnPesquisar(e);
			}
		});
		
		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addComponent(cbDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(tfDescricao, GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnPesquisar))))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(cbDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(tfDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPesquisar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		tabela = new JTable();
		scrollPane.setViewportView(tabela);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnNovo = new JButton("Novo");
				btnNovo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						btnNovo(e);
					}
				});
				btnNovo.setActionCommand("OK");
				buttonPane.add(btnNovo);
				getRootPane().setDefaultButton(btnNovo);
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
	private void ativar(WindowEvent e){
		tabela.updateUI();
		tabela.getRowHeight(0);
		tabela.setModel(new FuncionarioTableModel());
	}

	private void montarTabela(){
		ListSelectionModel linhaModeloSelecao = tabela.getSelectionModel();
		linhaModeloSelecao.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// Ignora o evento enquanto os valores da linha selecionada
				// est�o sendo atualizados
				if (e.getValueIsAdjusting()) {
					return;
				}
				// Verifica se existe uma linha selecionada. O
				// valor deve ser maior ou igual a 0, que � o n�mero da linha
				if (tabela.getSelectedRow() >= 0) {
					Integer linhaSelecionada = tabela.getSelectedRow();
					Funcionario funcionarioSelecionado = ((FuncionarioTableModel) tabela.getModel()).getFuncionarios().get(linhaSelecionada);
					if (funcionarioSelecionado != null) {
						CadastroFuncionario cadastro = new CadastroFuncionario(funcionarioSelecionado);
						setModalityType(ModalityType.MODELESS);
						cadastro.setVisible(true);
						tabela.setModel(new FuncionarioTableModel());
						tfDescricao.setText("");
					}
				}
			}
		});
	}

	private void btnSair(ActionEvent e){
		dispose();
	}

	private void btnNovo(ActionEvent e){
		CadastroFuncionario cadastro = new CadastroFuncionario();
		setModalityType(ModalityType.MODELESS);
		cadastro.setVisible(true);
		tabela.setModel(new FuncionarioTableModel());
	}

	private void btnPesquisar(ActionEvent e){
		System.out.println(cbDescricao.getSelectedItem());
		System.out.println(cbDescricao.getSelectedIndex());
		tabela.setModel(new FuncionarioTableModel(tfDescricao.getText()));
	}
}
