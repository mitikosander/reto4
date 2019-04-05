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
import com.toedter.calendar.JCalendar;

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
		btnHotel.setBounds(116, 115, 60, 23);
		add(btnHotel);
		
		JRadioButton btnApartamento = new JRadioButton("Apartamento");
		btnApartamento.setBounds(210, 115, 100, 23);
		add(btnApartamento);
		
		JRadioButton btnCasa = new JRadioButton("Casa");
		btnCasa.setBounds(334, 115, 60, 23);
		add(btnCasa);
		
		
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(btnHotel);
		grupo1.add(btnApartamento);
		grupo1.add(btnCasa);
		
		JLabel lblPrecioMinimo = new JLabel("Precio minimo:");
		lblPrecioMinimo.setBounds(187, 145, 68, 14);
		add(lblPrecioMinimo);
	
		JLabel lblPrecioMaximo = new JLabel("Precio Maximo:");
		lblPrecioMaximo.setBounds(94, 145, 83, 14);
		add(lblPrecioMaximo);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(187, 180, 39, 20);
		add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(94, 180, 39, 20);
		add(spinner_1);
		
		txtAquiVaEl = new JTextField();
		txtAquiVaEl.setText("AQUI VA EL LOGO");
		txtAquiVaEl.setBounds(86, 11, 301, 58);
		add(txtAquiVaEl);
		txtAquiVaEl.setColumns(10);
		
		JLabel lblFechaDeEntrada = new JLabel("Fecha de entrada");
		lblFechaDeEntrada.setBounds(26, 211, 101, 14);
		add(lblFechaDeEntrada);
		
		JLabel lblFechaDeSalida = new JLabel("Fecha de salida");
		lblFechaDeSalida.setBounds(299, 211, 96, 14);
		add(lblFechaDeSalida);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(26, 230, 184, 153);
		add(calendar);
		
		JCalendar calendar_1 = new JCalendar();
		calendar_1.setBounds(299, 230, 184, 153);
		add(calendar_1);
		
		JLabel lblNios = new JLabel("Ni\u00F1os:");
		lblNios.setBounds(264, 145, 46, 14);
		add(lblNios);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(264, 180, 29, 20);
		add(spinner_2);
		
		JLabel lblAdultos = new JLabel("Adultos:");
		lblAdultos.setBounds(320, 145, 46, 14);
		add(lblAdultos);
		
		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(320, 180, 29, 20);
		add(spinner_3);
		
		JLabel lblHabitaciones = new JLabel("Habitaciones: ");
		lblHabitaciones.setBounds(400, 145, 68, 14);
		add(lblHabitaciones);
		
		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(400, 180, 29, 20);
		add(spinner_4);
		
		

	}

	public JTextField getTxtBuscador() {
		return txtBuscador;
	}

	public void setTxtBuscador(JTextField txtBuscador) {
		this.txtBuscador = txtBuscador;
	}
}
