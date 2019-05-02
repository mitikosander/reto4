package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import modelo.Modelo;
import vista.Vista;

public class Controlador {
	private static Vista vista;
	private Modelo modelo;
	private ArrayList<modelo.Alojamiento> alojamientos;
	public double TotalaPagar =0;
	public double Adevolver =0;
	public double Introducido= 0;
	public Controlador(Vista vista, Modelo modelo) {
		Controlador.vista = vista;
		this.modelo = modelo;
		
		//Cargamos la pantalla principal y el combo con las ubicaciones
		
		vista.mostrarPantalla(vista.getInicio());
		rellenarComboUbicaciones();
	
		
		initalizeEvents();
		
	}

	private void initalizeEvents() {

		vista.getInicio().getBtn_buscar_inicio().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				vista.mostrarPantalla(vista.getListahoteles());
				
				//Usamos el metodo que cargara los hoteles de la ubicacion seleccionada
				rellenarTablaHoteles(alojamientos, vista.getListahoteles().getTable());
			}
		});
		
		vista.getListahoteles().getBtnaceptar_mostrar_lista().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				vista.mostrarPantalla(vista.getPagar());
				
				
			}
		});
		
		vista.getListahoteles().getBtnCancelar_mostrar_lista().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				vista.mostrarPantalla(vista.getInicio());
				
				//método para coger el precio del hotel seleccionado desde la base de datos
			
			}
				
		});
		
		vista.getPagar().getbtnCancelar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vista.mostrarPantalla(vista.getInicio());
			}
		});
		
		vista.getPagar().getbtn50euro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 50 eurazos
				if (Introducido>=TotalaPagar) {
					Adevolver= Introducido-TotalaPagar;
				}else {
					Introducido = Introducido + 50;
				}
			}
		});
		vista.getPagar().getbtn20euro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 20 eurazos
				if (Introducido>=TotalaPagar) {
					Adevolver= Introducido-TotalaPagar;
				}else {
					Introducido = Introducido + 20;
				}
			}
		});
		vista.getPagar().getbtn10euro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 10 eurazos
				if (Introducido>=TotalaPagar) {
					Adevolver= Introducido-TotalaPagar;
				}else {
					Introducido = Introducido + 10;
				}
			}
		});
		vista.getPagar().getbtn5euro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 5 eurazos
				if (Introducido>=TotalaPagar) {
					Adevolver= Introducido-TotalaPagar;
				}else {
					Introducido = Introducido + 5;
				}
			}
		});
		vista.getPagar().getbtn2euro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 2 eurazos
				if (Introducido>=TotalaPagar) {
					Adevolver= Introducido-TotalaPagar;
				}else {
					Introducido = Introducido + 2;
				}
			}
		});
		vista.getPagar().getbtn1euro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 1 eurazo
				if (Introducido>=TotalaPagar) {
					Adevolver= Introducido-TotalaPagar;
				}else {
					Introducido = Introducido + 1;
				}
			}
		});
		vista.getPagar().getbtn50cnt().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 50 centimazos
				if (Introducido>=TotalaPagar) {
					Adevolver= Introducido-TotalaPagar;
				}else {
					Introducido = Introducido + 0.50;
				}
			}
		});
		vista.getPagar().getbtn20cnt().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 20 centimazos
				if (Introducido>=TotalaPagar) {
					Adevolver= Introducido-TotalaPagar;
				}else {
					Introducido = Introducido + 0.20;
				}
			}
		});
		vista.getPagar().getbtn10cnt().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 51 centimazos
				if (Introducido>=TotalaPagar) {
					Adevolver= Introducido-TotalaPagar;
				}else {
					Introducido = Introducido + 0.10;
				}
			}
		});
		vista.getPagar().getbtn5cnt().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 5 centimazos
				if (Introducido>=TotalaPagar) {
					Adevolver= Introducido-TotalaPagar;
				}else {
					Introducido = Introducido + 0.05;
				}
			}
		});
		vista.getPagar().getbtn2cnt().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 2 centimazos
				if (Introducido>=TotalaPagar) {
					Adevolver= Introducido-TotalaPagar;
				}else {
					Introducido = Introducido + 0.02;
				}
			}
		});
		vista.getPagar().getbtn1cnt().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 1centimazo
				if (Introducido>=TotalaPagar) {
					Adevolver= Introducido-TotalaPagar;
				}else {
					Introducido = Introducido + 0.01;
				}
			}
		});
	}
		
	
	
		
		
	
	public void SumarIntroducido(double cantidad) {
		double TotalIntroducido = 0;
		double cambios=0;
		double Total=0;
		TotalIntroducido = TotalIntroducido + cantidad;
		vista.getPagar().gettextField_1().setText(Double.toString(TotalIntroducido));
		// Datos.sacarResto=Datos.Total-Datos.TotalIntroducido;
		if (Total > TotalIntroducido) {
			vista.getPagar().gettextField_2().setText(Double.toString(0));

		} else {
			vista.getPagar().gettextField_2().setText(Double.toString(TotalIntroducido - Total));
			cambios = TotalIntroducido - Total;
		}
	}
	
	//Metodo para rellenar el combobox con los datos consultados a la BBDD
	
	private void rellenarComboUbicaciones() {
		
		//1.Rellenar combo de lineas con los datos de la BBDD	

		ArrayList<String> nombreParadas =modelo.getMetodos().cargarciudades();
		
		//Eliminar las paradas repetidas pasando a un Set que no admite repetidos
		
		Set<String> hs=new HashSet<>();
		hs.addAll(nombreParadas);
		nombreParadas.clear();
		nombreParadas.addAll(hs);
		
		// Rellenar las paradas
		for (int i = 0; i <nombreParadas.size(); i++) {
			if(nombreParadas.get(i) !=null) {
			vista.getInicio().getCombo_ubicacion().addItem(nombreParadas.get(i));
			}
	}
}
	
	//Metodo para rellenar la tabla con los nombres y precios de los hoteles
	private void rellenarTablaHoteles(ArrayList<modelo.Alojamiento> alojamientos, JTable t1) {
		
		
		DefaultTableModel modelotabla = new DefaultTableModel(4,1);
		t1=new JTable(modelotabla);
		vista.getListahoteles().getTable().add(t1);
		
		
		for(int i=0;i<alojamientos.size();i++) {
			 modelotabla.addRow(new Object[] {alojamientos.get(i).getNombre(),alojamientos.get(i).getNum_camas(),alojamientos.get(i).getNum_habitaciones(),alojamientos.get(i).getPrecio()});
		}
		
		
	}

}
