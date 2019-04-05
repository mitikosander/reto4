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
		
		//Cargamos la pantalla principal
		vista.mostrarPantalla(vista.getInicio());
		
		initalizeEvents();
		
	}

	private void initalizeEvents() {

		vista.getInicio().getBtnBuscarinicio().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPantalla(vista.getPagar());

			}
		});

	}

}
