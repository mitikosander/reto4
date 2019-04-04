package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Inicio_Sesion extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public Inicio_Sesion() {
		setLayout(null);
		
		JLabel lblInicioDeSesion = new JLabel("INICIO DE SESION");
		lblInicioDeSesion.setFont(new Font("Stencil", Font.BOLD, 18));
		lblInicioDeSesion.setBounds(132, 11, 195, 41);
		add(lblInicioDeSesion);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario: ");
		lblNombreDeUsuario.setBounds(81, 90, 97, 14);
		add(lblNombreDeUsuario);
		
		textField = new JTextField();
		textField.setBounds(188, 87, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(81, 133, 97, 14);
		add(lblContrasea);
		
		textField_1 = new JTextField();
		textField_1.setBounds(188, 130, 86, 20);
		add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(243, 184, 89, 23);
		add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(81, 184, 89, 23);
		add(btnCancelar);

	}
}
