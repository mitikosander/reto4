package vista;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;


public class Datos_Personas extends JPanel {


	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnContinuar_dtpersonas; 
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblDni;
	private JLabel lblFechaDeNacimiento;
	private JDateChooser dateChooser;

	/**
	 * Create the panel.
	 */
	public Datos_Personas() {
		setLayout(null);
		
		btnContinuar_dtpersonas = new JButton("Continuar");
		btnContinuar_dtpersonas.setBounds(351, 266, 89, 23);
		add(btnContinuar_dtpersonas);
		
		lblNombre = new JLabel("Nombre: ");
		lblNombre.setBounds(128, 28, 57, 14);
		add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(128, 43, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(128, 68, 46, 14);
		add(lblApellido);
		
		textField_1 = new JTextField();
		textField_1.setBounds(128, 86, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		lblDni = new JLabel("DNI:");
		lblDni.setBounds(128, 117, 46, 14);
		add(lblDni);
		
		textField_2 = new JTextField();
		textField_2.setBounds(128, 131, 86, 20);
		add(textField_2);
		textField_2.setColumns(10);
		
		lblFechaDeNacimiento = new JLabel("Fecha de nacimiento: ");
		lblFechaDeNacimiento.setBounds(128, 162, 105, 14);
		add(lblFechaDeNacimiento);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(128, 189, 95, 20);
		add(dateChooser);

	}
}
