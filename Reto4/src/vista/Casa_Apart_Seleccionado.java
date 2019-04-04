package vista;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Casa_Apart_Seleccionado extends JPanel {
	private JTextField tf_ubicacion_CasaApart;
	private JTextField tf_mcuadrados_CasaApart;
	private JTextField tf_ncamas_CasaApart;
	private JTextField tf_tipohabita_CasaApart;
	private JTextField tf_fentrada_CasaApart;
	private JTextField tf_fsalida_CasaApart;
	private JTextField tf_precio_CasaApart;

	/**
	 * Create the panel.
	 */
	public Casa_Apart_Seleccionado() {
		setLayout(null);
		
		JLabel lblUbicacion = new JLabel("Ubicacion:");
		lblUbicacion.setBounds(47, 51, 56, 14);
		add(lblUbicacion);
		
		JLabel lblMetrosCuadrados = new JLabel("Metros cuadrados:");
		lblMetrosCuadrados.setBounds(46, 76, 107, 14);
		add(lblMetrosCuadrados);
		
		JLabel lblNDeCamas = new JLabel("N\u00BA de camas:");
		lblNDeCamas.setBounds(47, 101, 89, 14);
		add(lblNDeCamas);
		
		JLabel lblTipoHabitaciones = new JLabel("Tipo habitaciones: ");
		lblTipoHabitaciones.setBounds(47, 126, 106, 14);
		add(lblTipoHabitaciones);
		
		JLabel lblFechaDeEntrada = new JLabel("Fecha de entrada:");
		lblFechaDeEntrada.setBounds(47, 150, 89, 14);
		add(lblFechaDeEntrada);
		
		JLabel lblFechaDeSalida = new JLabel("Fecha de salida : ");
		lblFechaDeSalida.setBounds(47, 175, 89, 14);
		add(lblFechaDeSalida);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(316, 227, 46, 14);
		add(lblPrecio);
		
		JButton btnCancelar_CasaApart = new JButton("Cancelar");
		btnCancelar_CasaApart.setBounds(37, 249, 89, 23);
		add(btnCancelar_CasaApart);
		
		JButton btnReservar_CasaApart = new JButton("Reservar");
		btnReservar_CasaApart.setBounds(316, 252, 89, 23);
		add(btnReservar_CasaApart);
		
		tf_ubicacion_CasaApart = new JTextField();
		tf_ubicacion_CasaApart.setBounds(152, 48, 86, 20);
		add(tf_ubicacion_CasaApart);
		tf_ubicacion_CasaApart.setColumns(10);
		
		tf_mcuadrados_CasaApart = new JTextField();
		tf_mcuadrados_CasaApart.setBounds(152, 73, 86, 20);
		add(tf_mcuadrados_CasaApart);
		tf_mcuadrados_CasaApart.setColumns(10);
		
		tf_ncamas_CasaApart = new JTextField();
		tf_ncamas_CasaApart.setBounds(152, 98, 86, 20);
		add(tf_ncamas_CasaApart);
		tf_ncamas_CasaApart.setColumns(10);
		
		tf_tipohabita_CasaApart = new JTextField();
		tf_tipohabita_CasaApart.setBounds(152, 123, 86, 20);
		add(tf_tipohabita_CasaApart);
		tf_tipohabita_CasaApart.setColumns(10);
		
		tf_fentrada_CasaApart = new JTextField();
		tf_fentrada_CasaApart.setBounds(152, 147, 86, 20);
		add(tf_fentrada_CasaApart);
		tf_fentrada_CasaApart.setColumns(10);
		
		tf_fsalida_CasaApart = new JTextField();
		tf_fsalida_CasaApart.setBounds(152, 172, 86, 20);
		add(tf_fsalida_CasaApart);
		tf_fsalida_CasaApart.setColumns(10);
		
		tf_precio_CasaApart = new JTextField();
		tf_precio_CasaApart.setBounds(354, 221, 86, 20);
		add(tf_precio_CasaApart);
		tf_precio_CasaApart.setColumns(10);

	}

}
