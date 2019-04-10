package vista;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.CompoundBorder;
import javax.swing.JLabel;

public class Mostrar_Lista extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public Mostrar_Lista() {
		setLayout(null);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBounds(42, 37, 376, 329);
		add(table);
		
		JLabel lblListaDeHoteles = new JLabel("Lista de Hoteles");
		lblListaDeHoteles.setBounds(176, 11, 85, 14);
		add(lblListaDeHoteles);

	}
}
