package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.Modelo;
import vista.Vista;

public class Controlador {
	private static Vista vista;
	private Modelo modelo;
	private ArrayList<modelo.Alojamiento> alojamientos;
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
				alojamientos=modelo.getMetodos().buscarAlojamientos();
				//Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				vista.mostrarPantalla(vista.getPagar());
			
			}
		});
		
		//desde la pantalla de seleccion de hoteles cargamos el precio desde un metodo en modelo,
		//y pasamos ese valor a la pantalla de pago para proceder a este
		
		rellenarTablaHoteles(alojamientos, vista.getListahoteles().getTable());
		
		
	}
	
	//Metodo para rellenar el combobox con los datos consultados a la BBDD
	
	private void rellenarComboUbicaciones() {

		ArrayList<String> nombreParadas = modelo.getMetodos().cargarciudades();

		// Rellenar las paradas
		for (int i = 0; i < nombreParadas.size(); i++) {
			vista.getInicio().getCombo_ubicacion().addItem(nombreParadas.get(i));
		}
	}
	
	//Metodo para rellenar la tabla con los nombres y precios de los hoteles
	private void rellenarTablaHoteles(ArrayList<modelo.Alojamiento> alojamientos, JTable t1) {
		
		
		DefaultTableModel modelotabla = new DefaultTableModel(4,0);
		t1=new JTable(modelotabla);
		vista.getListahoteles().getTable().add(t1);
		
		
		for(int i=0;i<alojamientos.size();i++) {
			 modelotabla.addRow(new Object[] {alojamientos.get(i).getNombre(),alojamientos.get(i).getNum_camas(),alojamientos.get(i).getNum_habitaciones(),alojamientos.get(i).getPrecio()});
		}
		
		
	}

}
