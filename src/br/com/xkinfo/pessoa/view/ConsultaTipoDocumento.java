package br.com.xkinfo.pessoa.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import br.com.xkinfo.pessoa.model.Cargo;
import br.com.xkinfo.pessoa.model.TipoDocumento;
import br.com.xkinfo.pessoa.util.CargoTableModel;
import br.com.xkinfo.pessoa.util.TipoDocumentoTableModel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;

public class ConsultaTipoDocumento extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private static final long serialVersionUID = 1L;
	private JTextField tfDescricao;
	private JTable tabela;

	public ConsultaTipoDocumento() {
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
	
	public void inicio(){
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o:");
		
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
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDescricao)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tfDescricao, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnPesquisar)
					.addContainerGap())
				.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDescricao)
						.addComponent(tfDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPesquisar))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
		);
		
		tabela = new JTable();
		scrollPane.setViewportView(tabela);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Novo");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						btnNovo(e);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Sair");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						btnSair(e);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	private void ativar(WindowEvent e){
		tabela.updateUI();
		tabela.getRowHeight(0);
		tabela.setModel(new TipoDocumentoTableModel());
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
					TipoDocumento documentoSelecionado = ((TipoDocumentoTableModel) tabela.getModel()).getTipoDocumentos().get(linhaSelecionada);
					if (documentoSelecionado != null) {
						CadastroTipoDocumento cadastro = new CadastroTipoDocumento(documentoSelecionado);
						setModalityType(ModalityType.MODELESS);
						cadastro.setVisible(true);
						tabela.setModel(new TipoDocumentoTableModel());
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
		CadastroTipoDocumento cadastro = new CadastroTipoDocumento();
		setModalityType(ModalityType.MODELESS);
		cadastro.setVisible(true);
		tabela.setModel(new TipoDocumentoTableModel());
	}
	
	private void btnPesquisar(ActionEvent e){
		tabela.setModel(new TipoDocumentoTableModel(tfDescricao.getText()));
	}
}
