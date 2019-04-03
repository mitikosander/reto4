package vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;

public class Inicio extends JPanel {
	private JTextField txtBuscador;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Inicio() {
		setLayout(null);
		
		txtBuscador = new JTextField();
		txtBuscador.setText("Buscador");
		txtBuscador.setBounds(174, 49, 86, 20);
		add(txtBuscador);
		txtBuscador.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBounds(302, 48, 78, 23);
		add(btnNewButton);
		
		JLabel lblFiltros = new JLabel("Filtros");
		lblFiltros.setBounds(33, 36, 46, 14);
		add(lblFiltros);
		String ciudad;
		
		JRadioButton btnHotel = new JRadioButton("Hotel");
		btnHotel.setBounds(33, 55, 60, 23);
		add(btnHotel);
		
		JRadioButton btnApartamento = new JRadioButton("Apartamento");
		btnApartamento.setBounds(33, 86, 100, 23);
		add(btnApartamento);
		
		JRadioButton btnCasa = new JRadioButton("Casa");
		btnCasa.setBounds(33, 119, 60, 23);
		add(btnCasa);
		
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(btnHotel);
		grupo1.add(btnApartamento);
		grupo1.add(btnCasa);
		
		JLabel lblPrecioMinimo = new JLabel("Precio minimo:");
		lblPrecioMinimo.setBounds(10, 146, 68, 14);
		add(lblPrecioMinimo);
		
		textField = new JTextField();
		textField.setBounds(33, 163, 46, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblPrecioMaximo = new JLabel("Precio Maximo:");
		lblPrecioMaximo.setBounds(10, 194, 83, 14);
		add(lblPrecioMaximo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(33, 212, 46, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(263, 86, 17, 179);
		add(scrollBar);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(152, 85, 128, 180);
		add(textArea);
		
		

	}
}
