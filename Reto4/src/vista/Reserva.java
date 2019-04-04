package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Reserva extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public Reserva() {
		setLayout(null);
		
		JLabel lblNombreDelEstablecimiento = new JLabel("Nombre del establecimiento : ");
		lblNombreDelEstablecimiento.setBounds(27, 67, 150, 14);
		add(lblNombreDelEstablecimiento);
		
		textField = new JTextField();
		textField.setBounds(189, 64, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblTipoDeEstablecimiento = new JLabel("Tipo de establecimiento:");
		lblTipoDeEstablecimiento.setBounds(27, 95, 130, 14);
		add(lblTipoDeEstablecimiento);
		
		textField_1 = new JTextField();
		textField_1.setBounds(189, 95, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblFechaIda = new JLabel("Fecha ida: ");
		lblFechaIda.setBounds(27, 124, 59, 14);
		add(lblFechaIda);
		
		JLabel lblFechaVuelta = new JLabel("Fecha vuelta:");
		lblFechaVuelta.setBounds(27, 149, 78, 14);
		add(lblFechaVuelta);
		
		JLabel lblDatosVarios = new JLabel("Datos varios:");
		lblDatosVarios.setBounds(27, 174, 78, 14);
		add(lblDatosVarios);
		
		textField_2 = new JTextField();
		textField_2.setBounds(115, 171, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(313, 216, 46, 14);
		add(lblPrecio);
		
		textField_3 = new JTextField();
		textField_3.setBounds(354, 213, 86, 20);
		add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.setBounds(251, 241, 89, 23);
		add(btnPagar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(112, 241, 89, 23);
		add(btnCancelar);

	}
}
