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
		txtBuscador.setBounds(140, 190, 86, 20);
		add(txtBuscador);
		txtBuscador.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBounds(140, 220, 78, 23);
		add(btnNewButton);
		String ciudad;
		
		JRadioButton btnHotel = new JRadioButton("Hotel");
		btnHotel.setBounds(100, 77, 60, 23);
		add(btnHotel);
		
		JRadioButton btnApartamento = new JRadioButton("Apartamento");
		btnApartamento.setBounds(100, 108, 100, 23);
		add(btnApartamento);
		
		JRadioButton btnCasa = new JRadioButton("Casa");
		btnCasa.setBounds(100, 141, 60, 23);
		add(btnCasa);
		
		
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(btnHotel);
		grupo1.add(btnApartamento);
		grupo1.add(btnCasa);
		
		JLabel lblPrecioMinimo = new JLabel("Precio minimo:");
		lblPrecioMinimo.setBounds(234, 77, 68, 14);
		add(lblPrecioMinimo);
		
		textField = new JTextField();
		textField.setBounds(257, 94, 46, 20);
		add(textField);
		textField.setColumns(10);
		//bebesita
		JLabel lblPrecioMaximo = new JLabel("Precio Maximo:");
		lblPrecioMaximo.setBounds(234, 125, 83, 14);
		add(lblPrecioMaximo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(257, 143, 46, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		

	}
}
