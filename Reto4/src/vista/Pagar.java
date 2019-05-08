package vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;


public class Pagar extends JPanel {
	private JTextField txtAPagar;
	private JTextField txtIntroducido;
	private JTextField txtDevolver;
	private JLabel lblTotalAPagar;
	private JLabel lblPagado;
	private JLabel lblADevolver;
	private JButton btn50euro;
	private JButton btn20euro;
	private JButton btn10euro;
	private JButton btn5euro;
	private JButton btn2euro;
	private JButton btn1euro;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JButton btn50cnt;
	private JButton btn20cnt;
	private JButton btn10cnt;
	private JButton btn5cnt;
	private JButton btn2cnt;
	private JButton btn1cnt;
	
	/**
	 * Create the panel.
	 */

	private static final long serialVersionUID = 1L;
	
	public Pagar() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{33, 60, 60, 60, 60, 60, 60, 0};
		gridBagLayout.rowHeights = new int[]{39, 22, 22, 22, 25, 25, 25, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		btn5euro = new JButton("5\u20AC");
		btn5euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		lblTotalAPagar = new JLabel("Total a pagar:");
		GridBagConstraints gbc_lblTotalAPagar = new GridBagConstraints();
		gbc_lblTotalAPagar.anchor = GridBagConstraints.WEST;
		gbc_lblTotalAPagar.insets = new Insets(0, 0, 5, 5);
		gbc_lblTotalAPagar.gridwidth = 2;
		gbc_lblTotalAPagar.gridx = 2;
		gbc_lblTotalAPagar.gridy = 1;
		add(lblTotalAPagar, gbc_lblTotalAPagar);
		

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.BOTH;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridwidth = 2;
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 1;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		lblPagado = new JLabel("Total Introducido :");
		GridBagConstraints gbc_lblPagado = new GridBagConstraints();
		gbc_lblPagado.anchor = GridBagConstraints.NORTH;
		gbc_lblPagado.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblPagado.insets = new Insets(0, 0, 5, 5);
		gbc_lblPagado.gridwidth = 2;
		gbc_lblPagado.gridx = 2;
		gbc_lblPagado.gridy = 2;
		add(lblPagado, gbc_lblPagado);
		

		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.BOTH;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.gridx = 4;
		gbc_textField_1.gridy = 2;
		add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		
		lblADevolver = new JLabel("A devolver :");
		GridBagConstraints gbc_lblADevolver = new GridBagConstraints();
		gbc_lblADevolver.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblADevolver.insets = new Insets(0, 0, 5, 5);
		gbc_lblADevolver.gridwidth = 2;
		gbc_lblADevolver.gridx = 2;
		gbc_lblADevolver.gridy = 3;
		add(lblADevolver, gbc_lblADevolver);
		

		btn10euro = new JButton("10 \u20AC");
		btn10euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btn50euro = new JButton("50\u20AC");
		btn50euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.BOTH;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.gridx = 4;
		gbc_textField_2.gridy = 3;
		add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		GridBagConstraints gbc_btn50euro = new GridBagConstraints();
		gbc_btn50euro.fill = GridBagConstraints.BOTH;
		gbc_btn50euro.insets = new Insets(0, 0, 5, 5);
		gbc_btn50euro.gridx = 1;
		gbc_btn50euro.gridy = 4;
		add(btn50euro, gbc_btn50euro);
		
		btn20euro = new JButton("20\u20AC");
		btn20euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btn20euro = new GridBagConstraints();
		gbc_btn20euro.fill = GridBagConstraints.BOTH;
		gbc_btn20euro.insets = new Insets(0, 0, 5, 5);
		gbc_btn20euro.gridx = 2;
		gbc_btn20euro.gridy = 4;
		add(btn20euro, gbc_btn20euro);
		GridBagConstraints gbc_btn10euro = new GridBagConstraints();
		gbc_btn10euro.fill = GridBagConstraints.BOTH;
		gbc_btn10euro.insets = new Insets(0, 0, 5, 5);
		gbc_btn10euro.gridx = 3;
		gbc_btn10euro.gridy = 4;
		add(btn10euro, gbc_btn10euro);
		GridBagConstraints gbc_btn5euro = new GridBagConstraints();
		gbc_btn5euro.fill = GridBagConstraints.BOTH;
		gbc_btn5euro.insets = new Insets(0, 0, 5, 5);
		gbc_btn5euro.gridx = 4;
		gbc_btn5euro.gridy = 4;
		add(btn5euro, gbc_btn5euro);
		
		btn50cnt = new JButton("50cnt");
		btn50cnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		btn1euro = new JButton("1\u20AC");
		btn1euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btn2euro = new JButton("2\u20AC");
		btn2euro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btn2euro = new GridBagConstraints();
		gbc_btn2euro.fill = GridBagConstraints.BOTH;
		gbc_btn2euro.insets = new Insets(0, 0, 5, 5);
		gbc_btn2euro.gridx = 5;
		gbc_btn2euro.gridy = 4;
		add(btn2euro, gbc_btn2euro);
		GridBagConstraints gbc_btn1euro = new GridBagConstraints();
		gbc_btn1euro.fill = GridBagConstraints.BOTH;
		gbc_btn1euro.insets = new Insets(0, 0, 5, 0);
		gbc_btn1euro.gridx = 6;
		gbc_btn1euro.gridy = 4;
		add(btn1euro, gbc_btn1euro);
		GridBagConstraints gbc_btn50cnt = new GridBagConstraints();
		gbc_btn50cnt.fill = GridBagConstraints.BOTH;
		gbc_btn50cnt.insets = new Insets(0, 0, 5, 5);
		gbc_btn50cnt.gridx = 1;
		gbc_btn50cnt.gridy = 5;
		add(btn50cnt, gbc_btn50cnt);
		
		btn10cnt = new JButton("10cnt");
		btn10cnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		btn20cnt = new JButton("20cnt");
		btn20cnt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btn20cnt = new GridBagConstraints();
		gbc_btn20cnt.fill = GridBagConstraints.BOTH;
		gbc_btn20cnt.insets = new Insets(0, 0, 5, 5);
		gbc_btn20cnt.gridx = 2;
		gbc_btn20cnt.gridy = 5;
		add(btn20cnt, gbc_btn20cnt);
		GridBagConstraints gbc_btn10cnt = new GridBagConstraints();
		gbc_btn10cnt.fill = GridBagConstraints.BOTH;
		gbc_btn10cnt.insets = new Insets(0, 0, 5, 5);
		gbc_btn10cnt.gridx = 3;
		gbc_btn10cnt.gridy = 5;
		add(btn10cnt, gbc_btn10cnt);
		
		btn5cnt = new JButton("5cnt");
		GridBagConstraints gbc_btn5cnt = new GridBagConstraints();
		gbc_btn5cnt.fill = GridBagConstraints.BOTH;
		gbc_btn5cnt.insets = new Insets(0, 0, 5, 5);
		gbc_btn5cnt.gridx = 4;
		gbc_btn5cnt.gridy = 5;
		add(btn5cnt, gbc_btn5cnt);
		
		btn2cnt = new JButton("2cnt");
		GridBagConstraints gbc_btn2cnt = new GridBagConstraints();
		gbc_btn2cnt.fill = GridBagConstraints.BOTH;
		gbc_btn2cnt.insets = new Insets(0, 0, 5, 5);
		gbc_btn2cnt.gridx = 5;
		gbc_btn2cnt.gridy = 5;
		add(btn2cnt, gbc_btn2cnt);
		
		btn1cnt = new JButton("1cnt");
		GridBagConstraints gbc_btn1cnt = new GridBagConstraints();
		gbc_btn1cnt.fill = GridBagConstraints.BOTH;
		gbc_btn1cnt.insets = new Insets(0, 0, 5, 0);
		gbc_btn1cnt.gridx = 6;
		gbc_btn1cnt.gridy = 5;
		add(btn1cnt, gbc_btn1cnt);
		
		btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.fill = GridBagConstraints.VERTICAL;
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridwidth = 2;
		gbc_btnCancelar.gridx = 1;
		gbc_btnCancelar.gridy = 7;
		add(btnCancelar, gbc_btnCancelar);
		
		btnAceptar = new JButton("Aceptar");
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.fill = GridBagConstraints.VERTICAL;
		gbc_btnAceptar.gridwidth = 2;
		gbc_btnAceptar.gridx = 5;
		gbc_btnAceptar.gridy = 7;
		add(btnAceptar, gbc_btnAceptar);
	}
	public JTextField gettxtAPagar() {
		return (this.txtAPagar);
	}

	public void settxtAPagar() {
		this.txtAPagar.setText("");
	}

	public JTextField gettxtIntroducido() {
		return (this.txtIntroducido);
	}

	public void settxtIntroducido() {
		this.txtIntroducido.setText("");
	}

	public JTextField txtDevolver() {
		return (this.txtDevolver);
	}

	public void settxtDevolver() {
		this.txtDevolver.setText("");
	}

	public JLabel getlblTotalAPagar() {
		return (this.lblTotalAPagar);
	}

	public void setlblTotalAPagar() {
		this.lblTotalAPagar.setText("Total A Pagar");
	}

	public JLabel getlblPagado() {
		return (this.lblPagado);
	}

	public void setlblPagado() {
		this.lblPagado.setText("Pagado");
	}

	public JLabel getlblADevolver() {
		return (this.lblADevolver);
	}

	public void setlblADevolver() {
		this.lblADevolver.setText("A Devolver");
	}

	public JButton getbtn50euro() {
		return (this.btn50euro);
	}

	public void setbtn50euro() {
		this.btn50euro.setText("50");
	}

	public JButton getbtn20euro() {
		return (this.btn20euro);
	}

	public void setbtn20euro() {
		this.btn20euro.setText("20");
	}

	public JButton getbtn10euro() {
		return (this.btn10euro);
	}

	public void setbtn10euro() {
		this.btn10euro.setText("10");
	}

	public JButton getbtn5euro() {
		return (this.btn5euro);
	}

	public void setbtn5euro() {
		this.btn5euro.setText("5");
	}

	public JButton getbtn2euro() {
		return (this.btn2euro);
	}

	public void setbtn2euro() {
		this.btn2euro.setText("2");
	}

	public JButton getbtn1euro() {
		return (this.btn1euro);
	}

	public void setbtn1euro() {
		this.btn1euro.setText("1");
	}

	public JButton getbtnDevolver() {
		return (this.btnAceptar);
	}

	public void setbtnDevolver() {
		this.btnAceptar.setText("Devolver");
	}

	public JButton getbtnCancelar() {
		return (this.btnCancelar);
	}

	public void setbtnCancelar() {
		this.btnCancelar.setText("Cancelar");
	}
	public JButton getbtn50cnt() {
		return (this.btn50cnt);
	}

	public void setbtn50cnt() {
		this.btn50cnt.setText("50 cnt");
	}
	public JButton getbtn20cnt() {
	return (this.btn20cnt);
	}

	public void setbtn20cnt() {
	this.btn20cnt.setText("20 cnt");
	}
	
	public JButton getbtn10cnt() {
	return (this.btn10cnt);
	}

	public void setbtn10cnt() {
	this.btn10cnt.setText("10 cnt");
	}
	public JButton getbtn5cnt() {
	return (this.btn5cnt);
	}

	public void setbtn5cnt() {
	this.btn5cnt.setText("5 cnt");
	}
	
	public JButton getbtn2cnt() {
	return (this.btn2cnt);
	}

	public void setbtn2cnt() {
	this.btn2cnt.setText("2 cnt");
	}
	
	public JButton getbtn1cnt() {
	return (this.btn1cnt);
	}

	public void setbtn1cnt() {
	this.btn1cnt.setText("1 cnt");
	}
	
}
