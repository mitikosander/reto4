package vista;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Hotel_Seleccionado extends JPanel {
	private JTextField tF_nombre_Hotel;
	private JTextField tf_mc_Hotel;
	private JTextField tf_ncamas_Hotel;
	private JTextField tf_nestrellas_Hotel;
	private JTextField tf_ubicacion_Hotel;
	private JTextField tf_fentrada_Hotel;
	private JTextField tf_fsalida_Hotel;
	private JTextField tf_precio_Hotel;

	/**
	 * Create the panel.
	 */
	public Hotel_Seleccionado() {
		setLayout(null);
		
		JLabel lblNombreDeHotel = new JLabel("Nombre de Hotel:");
		lblNombreDeHotel.setBounds(84, 53, 89, 14);
		add(lblNombreDeHotel);
		
		JLabel lblMetrosCuadrados = new JLabel("Metros cuadrados :");
		lblMetrosCuadrados.setBounds(84, 78, 99, 14);
		add(lblMetrosCuadrados);
		
		JLabel lblNDeCamas = new JLabel("N\u00BA de camas:");
		lblNDeCamas.setBounds(84, 103, 73, 14);
		add(lblNDeCamas);
		
		JLabel lblNDeEstrellas = new JLabel("N\u00BA de estrellas:");
		lblNDeEstrellas.setBounds(84, 127, 78, 14);
		add(lblNDeEstrellas);
		
		JLabel lblUbicacin = new JLabel("Ubicaci\u00F3n: ");
		lblUbicacin.setBounds(89, 152, 73, 14);
		add(lblUbicacin);
		
		JLabel lblFechaDeEntrada = new JLabel("Fecha de entrada : ");
		lblFechaDeEntrada.setBounds(84, 177, 99, 14);
		add(lblFechaDeEntrada);
		
		JLabel lblNewLabel = new JLabel("Fecha de salida : ");
		lblNewLabel.setBounds(84, 202, 89, 14);
		add(lblNewLabel);
		
		JLabel lblPrecio = new JLabel("Precio :");
		lblPrecio.setBounds(279, 227, 46, 14);
		add(lblPrecio);
		
		tF_nombre_Hotel = new JTextField();
		tF_nombre_Hotel.setBounds(189, 53, 86, 20);
		add(tF_nombre_Hotel);
		tF_nombre_Hotel.setColumns(10);
		
		JButton btnReservar_Hotel = new JButton("Reservar");
		btnReservar_Hotel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnReservar_Hotel.setBounds(279, 252, 89, 23);
		add(btnReservar_Hotel);
		
		JButton btnCancelar_Hotel = new JButton("Cancelar");
		btnCancelar_Hotel.setBounds(73, 252, 89, 23);
		add(btnCancelar_Hotel);
		
		tf_mc_Hotel = new JTextField();
		tf_mc_Hotel.setBounds(189, 78, 86, 20);
		add(tf_mc_Hotel);
		tf_mc_Hotel.setColumns(10);
		
		tf_ncamas_Hotel = new JTextField();
		tf_ncamas_Hotel.setBounds(189, 103, 86, 20);
		add(tf_ncamas_Hotel);
		tf_ncamas_Hotel.setColumns(10);
		
		tf_nestrellas_Hotel = new JTextField();
		tf_nestrellas_Hotel.setBounds(189, 127, 86, 20);
		add(tf_nestrellas_Hotel);
		tf_nestrellas_Hotel.setColumns(10);
		
		tf_ubicacion_Hotel = new JTextField();
		tf_ubicacion_Hotel.setBounds(189, 152, 86, 20);
		add(tf_ubicacion_Hotel);
		tf_ubicacion_Hotel.setColumns(10);
		
		tf_fentrada_Hotel = new JTextField();
		tf_fentrada_Hotel.setBounds(189, 174, 86, 20);
		add(tf_fentrada_Hotel);
		tf_fentrada_Hotel.setColumns(10);
		
		tf_fsalida_Hotel = new JTextField();
		tf_fsalida_Hotel.setBounds(189, 202, 86, 20);
		add(tf_fsalida_Hotel);
		tf_fsalida_Hotel.setColumns(10);
		
		tf_precio_Hotel = new JTextField();
		tf_precio_Hotel.setBounds(335, 221, 86, 20);
		add(tf_precio_Hotel);
		tf_precio_Hotel.setColumns(10);

	}
}
