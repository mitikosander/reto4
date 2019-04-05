package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Inicio_Sesion extends JPanel {
	private JTextField tf_Usuario_Inicio_Sesion;
	private JPasswordField pf_Contra_Inicio_Sesion;

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
		
		tf_Usuario_Inicio_Sesion = new JTextField();
		tf_Usuario_Inicio_Sesion.setBounds(188, 87, 86, 20);
		add(tf_Usuario_Inicio_Sesion);
		tf_Usuario_Inicio_Sesion.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(81, 133, 97, 14);
		add(lblContrasea);
		
		JButton btnAceptar_Inicio_Sesion = new JButton("Aceptar");
		btnAceptar_Inicio_Sesion.setBounds(243, 184, 89, 23);
		add(btnAceptar_Inicio_Sesion);
		
		JButton btnCancelar_Inicio_Sesion = new JButton("Cancelar");
		btnCancelar_Inicio_Sesion.setBounds(81, 184, 89, 23);
		add(btnCancelar_Inicio_Sesion);
		
		pf_Contra_Inicio_Sesion = new JPasswordField();
		pf_Contra_Inicio_Sesion.setBounds(188, 130, 86, 17);
		add(pf_Contra_Inicio_Sesion);

	}
}
