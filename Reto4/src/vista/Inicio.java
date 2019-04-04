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
import javax.swing.JSpinner;

public class Inicio extends JPanel {
	private JTextField txtBuscador;
	private JTextField txtAquiVaEl;

	/**
	 * Create the panel.
	 */
	public Inicio() {
		setLayout(null);
		
		txtBuscador = new JTextField();
		txtBuscador.setText("Buscador");
		txtBuscador.setBounds(130, 77, 154, 20);
		add(txtBuscador);
		txtBuscador.setColumns(10);
		
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setBounds(299, 76, 78, 23);
		add(btnNewButton);
		String ciudad;
		
		JRadioButton btnHotel = new JRadioButton("Hotel");
		btnHotel.setBounds(94, 133, 60, 23);
		add(btnHotel);
		
		JRadioButton btnApartamento = new JRadioButton("Apartamento");
		btnApartamento.setBounds(162, 133, 100, 23);
		add(btnApartamento);
		
		JRadioButton btnCasa = new JRadioButton("Casa");
		btnCasa.setBounds(257, 133, 60, 23);
		add(btnCasa);
		
		
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(btnHotel);
		grupo1.add(btnApartamento);
		grupo1.add(btnCasa);
		
		JLabel lblPrecioMinimo = new JLabel("Precio minimo:");
		lblPrecioMinimo.setBounds(130, 178, 68, 14);
		add(lblPrecioMinimo);
	
		JLabel lblPrecioMaximo = new JLabel("Precio Maximo:");
		lblPrecioMaximo.setBounds(238, 178, 83, 14);
		add(lblPrecioMaximo);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(140, 203, 39, 20);
		add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(248, 203, 39, 20);
		add(spinner_1);
		
		txtAquiVaEl = new JTextField();
		txtAquiVaEl.setText("AQUI VA EL LOGO");
		txtAquiVaEl.setBounds(86, 11, 301, 58);
		add(txtAquiVaEl);
		txtAquiVaEl.setColumns(10);
		
		

	}
}
