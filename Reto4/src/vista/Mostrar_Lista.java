package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.CompoundBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Mostrar_Lista extends JPanel {
	private JTable table;
	private JButton btnaceptar_mostrar_lista;
	private JButton btnCancelar_mostrar_lista;
	

	/**
	 * Create the panel.
	 */
	public Mostrar_Lista() {
		setLayout(null);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBounds(42, 37, 380, 303);
		add(table);
		
		JLabel lblListaDeHoteles = new JLabel("Lista de Hoteles");
		lblListaDeHoteles.setBounds(176, 11, 85, 14);
		add(lblListaDeHoteles);
		
		 btnaceptar_mostrar_lista = new JButton("Aceptar");
		btnaceptar_mostrar_lista.setBounds(333, 351, 89, 23);
		add(btnaceptar_mostrar_lista);
		
		 btnCancelar_mostrar_lista = new JButton("Cancelar");
		btnCancelar_mostrar_lista.setBounds(42, 351, 89, 23);
		add(btnCancelar_mostrar_lista);

	}

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public JButton getBtnaceptar_mostrar_lista() {
		return btnaceptar_mostrar_lista;
	}

	public void setBtnaceptar_mostrar_lista(JButton btnaceptar_mostrar_lista) {
		this.btnaceptar_mostrar_lista = btnaceptar_mostrar_lista;
	}

	public JButton getBtnCancelar_mostrar_lista() {
		return btnCancelar_mostrar_lista;
	}

	public void setBtnCancelar_mostrar_lista(JButton btnCancelar_mostrar_lista) {
		this.btnCancelar_mostrar_lista = btnCancelar_mostrar_lista;
	}
	
	
}
