package vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import com.toedter.calendar.JCalendar;
import java.awt.Dimension;
import javax.swing.SpinnerNumberModel;



public class Inicio extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtBuscador;
	private JTextField txtAquiVaEl;
	private JButton btn_buscar_inicio;
	private JRadioButton btnApartamento;
	private JRadioButton btnHotel;
	private JRadioButton btnCasa;
	private JSpinner spinner_minimo;
	private JSpinner spinner_maximo;
	public static JCalendar calendar_entrada;
	public static JCalendar calendar_salida;
	private JSpinner spinner_ninios;
	private JSpinner spinner_adultos;
	private JSpinner spinner_habita;
	private JComboBox<String> combo_ubicacion;
    private Dimension dim;

	/**
	 * Create the panel.
	 */
	public Inicio() {
		setLayout(null);
		  dim=super.getToolkit().getScreenSize();
	        super.setSize(dim);
	        super.setVisible(true);
		
	       
	    
		btn_buscar_inicio = new JButton("Buscar");
		btn_buscar_inicio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn_buscar_inicio.setBounds(213, 349, 78, 23);
		add(btn_buscar_inicio);
		

		
		btnHotel = new JRadioButton("Hotel");
		btnHotel.setBounds(116, 115, 60, 23);

		
		btnApartamento = new JRadioButton("Apartamento");
		btnApartamento.setBounds(210, 115, 100, 23);

		btnCasa = new JRadioButton("Casa");
		btnCasa.setBounds(334, 115, 60, 23);

		
		
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(btnHotel);
		grupo1.add(btnApartamento);
		grupo1.add(btnCasa);
		
		JLabel lblPrecioMinimo = new JLabel("Precio minimo:");
		lblPrecioMinimo.setBounds(24, 111, 85, 14);
		add(lblPrecioMinimo);
	
		JLabel lblPrecioMaximo = new JLabel("Precio Maximo:");
		lblPrecioMaximo.setBounds(134, 111, 98, 14);
		add(lblPrecioMaximo);
		
		 spinner_minimo = new JSpinner();
		 spinner_minimo.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_minimo.setBounds(70, 135, 39, 20);
		add(spinner_minimo);
		
		spinner_maximo = new JSpinner();
		spinner_maximo.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_maximo.setBounds(178, 135, 39, 20);
		add(spinner_maximo);
		
		txtAquiVaEl = new JTextField();
		txtAquiVaEl.setText("AQUI VA EL LOGO");
		txtAquiVaEl.setBounds(86, 11, 301, 58);
		add(txtAquiVaEl);
		txtAquiVaEl.setColumns(10);
		
		JLabel lblFechaDeEntrada = new JLabel("Fecha de entrada");
		lblFechaDeEntrada.setBounds(24, 166, 101, 14);
		add(lblFechaDeEntrada);
		
		JLabel lblFechaDeSalida = new JLabel("Fecha de salida");
		lblFechaDeSalida.setBounds(297, 166, 96, 14);
		add(lblFechaDeSalida);
		
		calendar_entrada = new JCalendar();
		calendar_entrada.setBounds(24, 185, 184, 153);
		add(calendar_entrada);
		
		
		calendar_salida = new JCalendar();
		calendar_salida.setBounds(297, 185, 184, 153);
		add(calendar_salida);
		
		 
		JLabel lblNios = new JLabel("Ni\u00F1os:");
		lblNios.setBounds(245, 111, 56, 14);
		add(lblNios);
		
		spinner_ninios = new JSpinner();
		spinner_ninios.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_ninios.setBounds(262, 135, 29, 20);
		add(spinner_ninios);
		
		JLabel lblAdultos = new JLabel("Adultos:");
		lblAdultos.setBounds(301, 111, 48, 14);
		add(lblAdultos);
		
		spinner_adultos = new JSpinner();
		spinner_adultos.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_adultos.setBounds(318, 135, 29, 20);
		add(spinner_adultos);
		
		JLabel lblHabitaciones = new JLabel("Habitaciones: ");
		lblHabitaciones.setBounds(359, 111, 90, 14);
		add(lblHabitaciones);
		
		spinner_habita = new JSpinner();
		spinner_habita.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_habita.setBounds(398, 135, 29, 20);
		add(spinner_habita);
		
		combo_ubicacion = new JComboBox<String>();
		combo_ubicacion.setBounds(134, 77, 158, 23);
		add(combo_ubicacion);


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


	public JButton getBtn_buscar_inicio() {
		return btn_buscar_inicio;
	}


	public void setBtn_buscar_inicio(JButton btn_buscar_inicio) {
		this.btn_buscar_inicio = btn_buscar_inicio;
	}


	public JRadioButton getBtnApartamento() {
		return btnApartamento;
	}


	public void setBtnApartamento(JRadioButton btnApartamento) {
		this.btnApartamento = btnApartamento;
	}


	public JRadioButton getBtnHotel() {
		return btnHotel;
	}


	public void setBtnHotel(JRadioButton btnHotel) {
		this.btnHotel = btnHotel;
	}


	public JRadioButton getBtnCasa() {
		return btnCasa;
	}


	public void setBtnCasa(JRadioButton btnCasa) {
		this.btnCasa = btnCasa;
	}


	public JSpinner getSpinner_minimo() {
		return spinner_minimo;
	}


	public void setSpinner_minimo(JSpinner spinner_minimo) {
		this.spinner_minimo = spinner_minimo;
	}


	public JSpinner getSpinner_maximo() {
		return spinner_maximo;
	}


	public void setSpinner_maximo(JSpinner spinner_maximo) {
		this.spinner_maximo = spinner_maximo;
	}


	public JCalendar getCalendar_entrada() {
		return calendar_entrada;
	}


	public void setCalendar_entrada(JCalendar calendar_entrada) {
		this.calendar_entrada = calendar_entrada;
	}


	public JCalendar getCalendar_salida() {
		return calendar_salida;
	}


	public void setCalendar_salida(JCalendar calendar_salida) {
		this.calendar_salida = calendar_salida;
	}


	public JSpinner getSpinner_ninios() {
		return spinner_ninios;
	}


	public void setSpinner_ninios(JSpinner spinner_ninios) {
		this.spinner_ninios = spinner_ninios;
	}


	public JSpinner getSpinner_adultos() {
		return spinner_adultos;
	}


	public void setSpinner_adultos(JSpinner spinner_adultos) {
		this.spinner_adultos = spinner_adultos;
	}


	public JSpinner getSpinner_habita() {
		return spinner_habita;
	}


	public void setSpinner_habita(JSpinner spinner_habita) {
		this.spinner_habita = spinner_habita;
	}


	public JComboBox<String> getCombo_ubicacion() {
		return combo_ubicacion;
	}


	public void setCombo_ubicacion(JComboBox<String> combo_ubicacion) {
		this.combo_ubicacion = combo_ubicacion;
	}
	
	
}
