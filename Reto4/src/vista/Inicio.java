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
	private JButton btnBuscarinicio;
	private JRadioButton btnHotel;
	private JRadioButton btnApartamento;
	private JRadioButton btnCasa;
	private ButtonGroup grupo1;
	private JLabel lblPrecioMinimo;
	private JLabel lblPrecioMaximo;
	private JSpinner spinner;
	private JSpinner spinner_1;
	
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
		
		
		btnBuscarinicio = new JButton("Buscar");
		btnBuscarinicio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnBuscarinicio.setBounds(299, 76, 78, 23);
		add(btnBuscarinicio);
		String ciudad;
		
		btnHotel = new JRadioButton("Hotel");
		btnHotel.setBounds(94, 133, 60, 23);
		add(btnHotel);
		
		btnApartamento = new JRadioButton("Apartamento");
		btnApartamento.setBounds(162, 133, 100, 23);
		add(btnApartamento);
		
		btnCasa = new JRadioButton("Casa");
		btnCasa.setBounds(257, 133, 60, 23);
		add(btnCasa);
		
		
		 grupo1 = new ButtonGroup();
		grupo1.add(btnHotel);
		grupo1.add(btnApartamento);
		grupo1.add(btnCasa);
		
		lblPrecioMinimo = new JLabel("Precio minimo:");
		lblPrecioMinimo.setBounds(130, 178, 68, 14);
		add(lblPrecioMinimo);
	
		 lblPrecioMaximo = new JLabel("Precio Maximo:");
		lblPrecioMaximo.setBounds(238, 178, 83, 14);
		add(lblPrecioMaximo);
		
		 spinner = new JSpinner();
		spinner.setBounds(140, 203, 39, 20);
		add(spinner);
		
		 spinner_1 = new JSpinner();
		spinner_1.setBounds(248, 203, 39, 20);
		add(spinner_1);
		
		txtAquiVaEl = new JTextField();
		txtAquiVaEl.setText("AQUI VA EL LOGO");
		txtAquiVaEl.setBounds(86, 11, 301, 58);
		add(txtAquiVaEl);
		txtAquiVaEl.setColumns(10);
		
		

	}

	public JTextField getTxtBuscador() {
		return txtBuscador;
	}

	public void setTxtBuscador(JTextField txtBuscador) {
		this.txtBuscador = txtBuscador;
	}

	public JTextField getTxtAquiVaEl() {
		return txtAquiVaEl;
	}

	public void setTxtAquiVaEl(JTextField txtAquiVaEl) {
		this.txtAquiVaEl = txtAquiVaEl;
	}

	public JButton getBtnBuscarinicio() {
		return btnBuscarinicio;
	}

	public void setBtnBuscarinicio(JButton btnBuscarinicio) {
		this.btnBuscarinicio = btnBuscarinicio;
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

	public ButtonGroup getGrupo1() {
		return grupo1;
	}

	public void setGrupo1(ButtonGroup grupo1) {
		this.grupo1 = grupo1;
	}

	public JLabel getLblPrecioMinimo() {
		return lblPrecioMinimo;
	}

	public void setLblPrecioMinimo(JLabel lblPrecioMinimo) {
		this.lblPrecioMinimo = lblPrecioMinimo;
	}

	public JLabel getLblPrecioMaximo() {
		return lblPrecioMaximo;
	}

	public void setLblPrecioMaximo(JLabel lblPrecioMaximo) {
		this.lblPrecioMaximo = lblPrecioMaximo;
	}

	public JSpinner getSpinner() {
		return spinner;
	}

	public void setSpinner(JSpinner spinner) {
		this.spinner = spinner;
	}

	public JSpinner getSpinner_1() {
		return spinner_1;
	}

	public void setSpinner_1(JSpinner spinner_1) {
		this.spinner_1 = spinner_1;
	}
	
}
