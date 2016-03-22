package br.com.xkinfo.pessoa.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.com.xkinfo.pessoa.model.Cargo;
import br.com.xkinfo.pessoa.util.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ConsultaCargo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTable tabela;

	DefaultTableCellRenderer direita;
	DefaultTableCellRenderer esquerda;
	DefaultTableCellRenderer centro;

	public ConsultaCargo() {
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

	private void inicio(){
		setModalityType(ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o:");

		textField = new JTextField();
		textField.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();

		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
				gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblDescricao)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(80, Short.MAX_VALUE))
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
				);
		gl_contentPanel.setVerticalGroup(
				gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDescricao)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE))
				);
		{
			tabela = new JTable();
			scrollPane.setViewportView(tabela);
		}
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

	private void btnSair(ActionEvent e){
		dispose();
	}

	private void ativar(WindowEvent e){
		tabela.updateUI();
		tabela.getRowHeight(0);
		tabela.setModel(new CargoTableModel());
	}

	private void montarTabela(){
		ListSelectionModel linhaModeloSelecao = tabela.getSelectionModel();
		linhaModeloSelecao.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// Ignora o evento enquanto os valores da linha selecionada
				// estão sendo atualizados
				if (e.getValueIsAdjusting()) {
					return;
				}
				// Verifica se existe uma linha selecionada. O
				// valor deve ser maior ou igual a 0, que é o número da linha
				if (tabela.getSelectedRow() >= 0) {
					Integer linhaSelecionada = tabela.getSelectedRow();
					Cargo cargoSelecionado = ((CargoTableModel) tabela.getModel()).getCargos().get(linhaSelecionada);
					if (cargoSelecionado != null) {
						CadastroCargo cadastro = new CadastroCargo(cargoSelecionado);
						setModalityType(ModalityType.MODELESS);
						cadastro.setVisible(true);
						tabela.setModel(new CargoTableModel());
					}
				}
			}
		});
	}

	private void btnNovo(ActionEvent e){
		CadastroCargo cadastro = new CadastroCargo();
		setModalityType(ModalityType.MODELESS);
		cadastro.setVisible(true);
		tabela.setModel(new CargoTableModel());
	}
}
