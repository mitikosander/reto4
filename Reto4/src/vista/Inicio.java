package vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;



public class Inicio extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtBuscador;
	private JTextField textField;
	private JTextField textField_1;
	private JRadioButton btnHotel,btnApartamento,btnCasa;

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
		
		 btnHotel = new JRadioButton("Hotel");
		btnHotel.setBounds(100, 77, 60, 23);
		add(btnHotel);
		
		 btnApartamento = new JRadioButton("Apartamento");
		btnApartamento.setBounds(100, 108, 100, 23);
		add(btnApartamento);
		
		 btnCasa = new JRadioButton("Casa");
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
	
		JLabel lblPrecioMaximo = new JLabel("Precio Maximo:");
		lblPrecioMaximo.setBounds(234, 125, 83, 14);
		add(lblPrecioMaximo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(257, 143, 46, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		//Esta es la ultima prueba

	}

	public JTextField getTxtBuscador() {
		return txtBuscador;
	}

	public void setTxtBuscador(JTextField txtBuscador) {
		this.txtBuscador = txtBuscador;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1 = textField_1;
	}

	public JRadioButton getBtnHotel() {
		return btnHotel;
	}

	public void setBtnHotel(JRadioButton btnHotel) {
		this.btnHotel = btnHotel;
	}

	public JRadioButton getBtnApartamento() {
		return btnApartamento;
	}

	public void setBtnApartamento(JRadioButton btnApartamento) {
		this.btnApartamento = btnApartamento;
	}

	public JRadioButton getBtnCasa() {
		return btnCasa;
	}

	public void setBtnCasa(JRadioButton btnCasa) {
		this.btnCasa = btnCasa;
	}
	
	
}
