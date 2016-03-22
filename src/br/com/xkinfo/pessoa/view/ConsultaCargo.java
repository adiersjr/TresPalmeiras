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
import javax.swing.SwingConstants;
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
		criarTela();
		
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
                        /*CadastroSituacao cadastroSituacao = new CadastroSituacao(cargoSelecionado, null, true);
                        cadastroSituacao.setLocationRelativeTo(this);
                        cadastroSituacao.setVisible(true);
                        tabela.setModel(new CargoTableModel());*/
                    }
                }
            }
        });
	}

	/**
	 * Create the dialog.
	 */
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
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						btnCancelar(e);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	private void criarTela(){
        tabela.getColumnModel().getColumn(0).setCellRenderer(esquerda);
        tabela.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        ((DefaultTableCellRenderer) tabela.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
    }
	
	private void btnCancelar(ActionEvent e){
		dispose();
	}
	
	private void ativar(WindowEvent e){
		tabela.updateUI();
		tabela.getRowHeight(0);
		tabela.setModel(new CargoTableModel());
		criarTela();
	}
}
