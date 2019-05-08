package vista;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;


import javax.swing.JFrame;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;


public class Bases_Legales extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private  JRadioButton rdbtnNewRadioButton;
	private  JButton btnSiguiente_Blegales;
	

	/**
	 * Create the panel.
	 */
	public Bases_Legales() {
		setLayout(null);
		
		   JPanel bigPane = new JPanel();
		   bigPane.setToolTipText("");
	        bigPane.setBackground(Color.WHITE);
	        // This is not recommended, but is used for demonstration purposes
	        bigPane.setPreferredSize(new Dimension(390, 490)); 

	        JScrollPane scrollPane = new JScrollPane(bigPane);
	        bigPane.setLayout(null);
	        
	        JTextPane txtpnBases = new JTextPane();
	        txtpnBases.setEditable(false);
	        txtpnBases.setText("1. Como reservar. \r\nEl usuario deber\u00E1 seguir las indicaciones y completar los apartados indicados en la secci\u00F3n correspondiente de esta p\u00E1gina web para realizar la reserva, y efectuar el pago de la misma en los t\u00E9rminos establecidos en el apartado 5 (CONDICIONES DE PAGO DE LA RESERVA) de las presentes condiciones. A partir del momento de hacer la reserva, entrar\u00E1n en vigor las condiciones de gastos por anulaci\u00F3n. OPTURSA le proporcionar\u00E1 un comprobante que deber\u00E1 imprimir y presentar en el hotel a su llegada. Es esencial que usted revise que todos los detalles de su reserva son correctos en el bono que usted podr\u00E1 imprimir.\r\n\r\n2. Responsabilidad. \r\nEn caso de que usted realice la reserva para dos o m\u00E1s personas, la persona que realice la reserva deber\u00E1 estar autorizado para poder representar a todos aquellos en nombre de los que haya hecho la misma, as\u00ED como aceptar la responsabilidad derivada de los pagos realizados en nombre de estas personas, incluidos los gastos por cancelaci\u00F3n o argos derivados de rectificaciones o modificaciones. Asimismo, deber\u00E1 informar a todos aquellos en cuyo nombre haya realizado la reserva, de los detalles de la reserva, as\u00ED como de cualquier otra informaci\u00F3n relevante. Aseg\u00FArese de que todos los datos personales facilitados durante su reserva deber\u00E1n ser correctos y veraces.\r\n\r\n");
	        txtpnBases.setBounds(0, 0, 369, 323);
	        bigPane.add(txtpnBases);
	        
	        JLabel lblterminos = new JLabel("Aceptas los t\u00E9rminos legales");
	        lblterminos.setBounds(0, 338, 174, 14);
	        bigPane.add(lblterminos);
	        
	        rdbtnNewRadioButton = new JRadioButton("New radio button");
	        rdbtnNewRadioButton.setBounds(177, 334, 18, 23);
	        bigPane.add(rdbtnNewRadioButton);
	        
	        btnSiguiente_Blegales = new JButton("Siguiente");
	        btnSiguiente_Blegales.setBounds(270, 334, 89, 23);
	        bigPane.add(btnSiguiente_Blegales);
	        scrollPane.setPreferredSize(new Dimension(390, 390));

	        
	       
	}
	
}
