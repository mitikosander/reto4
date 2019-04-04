package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Modelo;
import vista.Vista;

public class Controlador {
	private static Vista vista;
	private Modelo modelo;

	public Controlador(Vista vista, Modelo modelo) {
		Controlador.vista = vista;
		this.modelo = modelo;
		initalizeEvents();
	}

	private void initalizeEvents() {
		vista.getInicio().getBtnBuscarinicio().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPantalla(vista.getPagar());

			}
		});
			
/*
		
			//resetear el panel registro poniendolo vacio.
			private void resetRegistro() {
				// TODO Auto-generated method stub
				vista.PanelRegistro.gettFNombreRegistro().setText(null);
				vista.PanelRegistro.getTfDNIRegistro().setText(null);
				vista.PanelRegistro.getcBSexoRegistro().setSelectedIndex(0);
				vista.PanelRegistro.getpFRegistroContrasena().setText(null);
				vista.PanelRegistro.getpFContrasenaRegistro().setText(null);
			}
		});
*/
	
	}

}
