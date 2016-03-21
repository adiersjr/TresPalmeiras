package br.com.xkinfo.pessoa.view;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableCellRenderer;

import br.com.xkinfo.pessoa.model.Cargo;
import br.com.xkinfo.pessoa.util.CargoTableModel;
import java.awt.Dimension;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ConsultaCargo extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable tabela;
	private JTextField tfCodigo;
	private JTextField tfDescricao;

	private int coluna0 = 20;
	private int coluna1 = 150;
	DefaultTableCellRenderer direita;
    DefaultTableCellRenderer esquerda;
    DefaultTableCellRenderer centro;

	/**
	 * Create the panel.
	 * Construtor do Panel.
	 */
	public ConsultaCargo() {
		setFont(new Font("Tahoma", Font.PLAIN, 12));
		setPreferredSize(new Dimension(600, 400));
		setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Consulta Cargo", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));

		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));

		JScrollPane scrollPane = new JScrollPane();

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setPreferredSize(new Dimension(100, 23));
		btnCancelar.setMinimumSize(new Dimension(100, 23));

		JButton btnNovo = new JButton("Novo");
		btnNovo.setMinimumSize(new Dimension(100, 23));
		btnNovo.setPreferredSize(new Dimension(100, 23));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
								.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(btnNovo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap())
				);
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addContainerGap()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNovo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap())
				);

		JLabel lblCodigo = new JLabel("Codigo:");

		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o:");

		tfCodigo = new JTextField();
		tfCodigo.setEditable(false);
		tfCodigo.setColumns(10);

		tfDescricao = new JTextField();
		tfDescricao.setColumns(200);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblCodigo)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tfCodigo, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(lblDescricao)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tfDescricao, GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
						.addContainerGap())
				);
		gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblCodigo)
								.addComponent(tfCodigo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblDescricao)
								.addComponent(tfDescricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(29, Short.MAX_VALUE))
				);
		panel.setLayout(gl_panel);

		tabela = new JTable();
		tabela.setModel(new CargoTableModel()); /// COPIADO DO NETBEANS
		scrollPane.setViewportView(tabela);
		setLayout(groupLayout);

		// Copiado do Netbeans....
		tabela.getColumnModel().getColumn(0).setPreferredWidth(coluna0);
		tabela.getColumnModel().getColumn(1).setPreferredWidth(coluna1);
		tabela.getColumnModel().getColumn(0).setCellRenderer(centro);
		tabela.getColumnModel().getColumn(1).setCellRenderer(esquerda);
        ((DefaultTableCellRenderer) tabela.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
		
		// L�gica para manipular uma linha do JTable quando esta � selecionada    
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
                    Cargo cargoSelecionado = ((CargoTableModel) tabela.getModel()).getCargos().get(linhaSelecionada);
                    if (cargoSelecionado != null) {
                    	/*principal
                        CadastroCargo cadastroCargo = new CadastroCargo(cargoSelecionado);
                        //cadastroCargo.setLocationRelativeTo(scrollPane.getParent());
                        cadastroCargo.setVisible(true);
                        tabela.setModel(new CargoTableModel());*/
                    }
                }
            }
        });
	}
}
