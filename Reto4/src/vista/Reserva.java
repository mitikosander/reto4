package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Reserva extends JPanel {
	private JTextField tf_nombre_reserva;
	private JTextField tf_tipo_pagar;
	private JTextField tf_datos_reserva;
	private JTextField tf_precio_reserva;
	private JTextField tf_fecha_ida;
	private JTextField tf_fecha_vuelta;

	/**
	 * Create the panel.
	 */
	public Reserva() {
		setLayout(null);
		
		JLabel lblNombreDelEstablecimiento = new JLabel("Nombre del establecimiento : ");
		lblNombreDelEstablecimiento.setBounds(27, 67, 150, 14);
		add(lblNombreDelEstablecimiento);
		
		tf_nombre_reserva = new JTextField();
		tf_nombre_reserva.setBounds(189, 64, 86, 20);
		add(tf_nombre_reserva);
		tf_nombre_reserva.setColumns(10);
		
		JLabel lblTipoDeEstablecimiento = new JLabel("Tipo de establecimiento:");
		lblTipoDeEstablecimiento.setBounds(27, 95, 130, 14);
		add(lblTipoDeEstablecimiento);
		
		tf_tipo_pagar = new JTextField();
		tf_tipo_pagar.setBounds(189, 95, 86, 20);
		add(tf_tipo_pagar);
		tf_tipo_pagar.setColumns(10);
		
		JLabel lblFechaIda = new JLabel("Fecha ida: ");
		lblFechaIda.setBounds(27, 124, 59, 14);
		add(lblFechaIda);
		
		JLabel lblFechaVuelta = new JLabel("Fecha vuelta:");
		lblFechaVuelta.setBounds(10, 159, 78, 14);
		add(lblFechaVuelta);
		
		JLabel lblDatosVarios = new JLabel("Datos varios:");
		lblDatosVarios.setBounds(27, 184, 78, 14);
		add(lblDatosVarios);
		
		tf_datos_reserva = new JTextField();
		tf_datos_reserva.setBounds(91, 181, 86, 20);
		add(tf_datos_reserva);
		tf_datos_reserva.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(313, 216, 46, 14);
		add(lblPrecio);
		
		tf_precio_reserva = new JTextField();
		tf_precio_reserva.setBounds(354, 213, 86, 20);
		add(tf_precio_reserva);
		tf_precio_reserva.setColumns(10);
		
		JButton btnPagar_reserva = new JButton("Pagar");
		btnPagar_reserva.setBounds(251, 241, 89, 23);
		add(btnPagar_reserva);
		
		JButton btnCancelar_reserva = new JButton("Cancelar");
		btnCancelar_reserva.setBounds(112, 241, 89, 23);
		add(btnCancelar_reserva);
		
		tf_fecha_ida = new JTextField();
		tf_fecha_ida.setBounds(91, 121, 86, 20);
		add(tf_fecha_ida);
		tf_fecha_ida.setColumns(10);
		
		tf_fecha_vuelta = new JTextField();
		tf_fecha_vuelta.setBounds(91, 153, 86, 20);
		add(tf_fecha_vuelta);
		tf_fecha_vuelta.setColumns(10);

	}
}