package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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
		
		//Cargamos el comboBox con las ciudades
		rellenarComboUbicaciones();
		initalizeEvents();
		
	}

	private void initalizeEvents() {

		vista.getInicio().getBtn_buscar_inicio().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				modelo.getMetodos().buscarAlojamientos();
				vista.mostrarPantalla(vista.getPagar());
			
			}
		});

		
		
	}
	
	//Metodo para rellenar el combobox con los datos consultados a la BBDD
	private void rellenarComboUbicaciones() {

		ArrayList<String> nombreParadas = modelo.getMetodos().cargarciudades();

		// Rellenar las paradas
		for (int i = 0; i < nombreParadas.size(); i++) {
			vista.getInicio().getCombo_ubicacion().addItem(nombreParadas.get(i));
		}
	}

}
