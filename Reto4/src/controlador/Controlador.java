package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import modelo.Alojamiento;
import modelo.Cliente;
import modelo.Metodos;
import modelo.Modelo;
import vista.Vista;

public class Controlador {
	private static Vista vista;
	private Modelo modelo;
	private ArrayList<modelo.Alojamiento> alojamientos;
	public double Adevolver = 0;
	public double Introducido = 0;
	public double preciototal=0;
	public String  preciotabla="";
	public String nombrehotel = "";
	public String nombreubicacion = "";

	public Controlador(Vista vista, Modelo modelo) {
		Controlador.vista = vista;
		this.modelo = modelo;

		// Cargamos la pantalla principal
		vista.mostrarPantalla(vista.getInicio());

		// Cargamos el comboBox con las ciudades
		
		initalizeEvents();

	}

	private void initalizeEvents() {
		
		vista.getInicio().getBtnseleccionar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				if(vista.getInicio().getRdbtnHotel().isSelected()) {
					rellenarComboCiudades();
				}else {
					if(vista.getInicio().getRdbtnApartamento().isSelected()) {
						rellenarComboCiudadesapartamentos();
					}else {
						rellenarComboCiudadescasas();
						}
				}

			}
		});
		
		vista.getInicio().getBtn_buscar_inicio().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				//nombreubicacion = (vista.getInicio().getCombo_ubicacion().getSelectedItem().toString());		
				//rellenarComboAlojamientos();
				if(vista.getInicio().getRdbtnHotel().isSelected()) {
					vista.mostrarPantalla(vista.getListahoteles());
				
				//Usamos el metodo que cargara los hoteles de la ubicacion seleccionada
				DefaultTableModel modelos=modelo.getMetodos().cargarTablahoteles((String) vista.getInicio().getCombo_ubicacion().getSelectedItem());
				
				vista.getListahoteles().getTable().setModel(modelos);
				}else {
					if(vista.getInicio().getRdbtnApartamento().isSelected()) {
						vista.mostrarPantalla(vista.getListahoteles());
						
						//Usamos el metodo que cargara los hoteles de la ubicacion seleccionada
						DefaultTableModel modelos=modelo.getMetodos().cargarTablaapartamentos((String) vista.getInicio().getCombo_ubicacion().getSelectedItem());
						
						vista.getListahoteles().getTable().setModel(modelos);
					}else {
						vista.mostrarPantalla(vista.getListahoteles());
						
						//Usamos el metodo que cargara los hoteles de la ubicacion seleccionada
						DefaultTableModel modelos=modelo.getMetodos().cargarTablahoteles((String) vista.getInicio().getCombo_ubicacion().getSelectedItem());
						
						vista.getListahoteles().getTable().setModel(modelos);
						}
				}
				
							}
		});
		
		/*vista.getListahoteles().getBtnAceptar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				vista.mostrarPantalla(vista.getListahoteles());
				rellenarprecios();
				vista.getListahoteles().getTextField_precio().setText(Double.toString(precioHotel));
				modelo.getMetodos().modificarfichero();
			}
		});
		
		
		vista.getListahoteles().getBtnaceptar_mostrar_lista().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				nombrehotel = (vista.getListahoteles().getcombo_alojamientos().getSelectedItem().toString());
				rellenarprecios();
				vista.getPagar().gettextField().setText(Double.toString(precioHotel));
				vista.mostrarPantalla(vista.getPagar());

			}
		});
*/
		
		
		vista.getListahoteles().getBtnCancelar_mostrar_lista().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				vista.mostrarPantalla(vista.getInicio());

			}
		});
		vista.getListahoteles().getBtnaceptar_mostrar_lista().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				/*String datotabla = String.valueOf(vista.getListahoteles().getTable().getValueAt(vista.getListahoteles().getTable().getSelectedRow(), 0));
				vista.mostrarPantalla(vista.getHotel_seleccionado());
				vista.getHotel_seleccionado().gettF_nombre_Hotel().setText(datotabla);*/
				vista.mostrarPantalla(vista.getInicio_sesion());
			}
		});
		vista.getPagar().getbtnCancelar().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				vista.mostrarPantalla(vista.getInicio());

			}
		});
		
		vista.getHotel_seleccionado().getBtnReservar_Hotel().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				//vista.mostrarPantalla(vista.getInicio_sesion());

			}
		});
		
		
		
		vista.getInicio_sesion().getBtnAceptar_Inicio_Sesion().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				confirmarlogin();
				 preciotabla = String.valueOf(vista.getListahoteles().getTable().getValueAt(vista.getListahoteles().getTable().getSelectedRow(), 1));
				 preciototal = Double.parseDouble(preciotabla);
				 vista.mostrarPantalla(vista.getPagar());
				vista.getPagar().gettextField().setText(preciotabla);

			}
		});
		
		vista.getInicio_sesion().getBtnCancelar_Inicio_Sesion().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				vista.mostrarPantalla(vista.getInicio());

			}
		});
		
		
		vista.getHotel_seleccionado().getBtnCancelar_Hotel().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Tras la busqueda inicial vamos a la pantall de seleccion de hoteles
				vista.mostrarPantalla(vista.getInicio());

			}
		});
		
		vista.getPagar().getbtn50euro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 50 eurazos
				SumarIntroducido(50);
			}
		});
		vista.getPagar().getbtn20euro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 20 eurazos
				SumarIntroducido(20);
			}
		});
		vista.getPagar().getbtn10euro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 10 eurazos
				SumarIntroducido(10);
			}
		});
		vista.getPagar().getbtn5euro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 5 eurazos
				SumarIntroducido(5);
			}
		});
		vista.getPagar().getbtn2euro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 2 eurazos
				SumarIntroducido(2);
			}
		});
		vista.getPagar().getbtn1euro().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 1 eurazo
				SumarIntroducido(1);
			}
		});
		vista.getPagar().getbtn50cnt().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 50 centimazos
				SumarIntroducido(0.50);
			}
		});
		vista.getPagar().getbtn20cnt().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 20 centimazos
				SumarIntroducido(0.20);
			}
		});
		vista.getPagar().getbtn10cnt().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 51 centimazos
				SumarIntroducido(0.10);
			}
		});
		vista.getPagar().getbtn5cnt().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 5 centimazos
				SumarIntroducido(0.05);
			}
		});
		vista.getPagar().getbtn2cnt().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Introducimos 2 centimazos
				SumarIntroducido(0.02);
			}
		});
		vista.getPagar().getbtn1cnt().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SumarIntroducido(0.01);
			}
				});
			}
	



	// Metodo para rellenar el combobox con los datos consultados a la BBDD

	private void rellenarComboCiudades() {
		// Sacar las lineas de la BBDD y rellenar el combobox
		// 1.Sacar datos de la BBDD

		ArrayList<String> ciudad = modelo.getMetodos().cargarciudades();

		// 2.Rellenar combo de lineas

		for (int i = 0; i < ciudad.size(); i++) {
			vista.getInicio().getCombo_ubicacion().addItem(ciudad.get(i));
		}

	}
	private void rellenarComboCiudadesapartamentos() {
		// Sacar las lineas de la BBDD y rellenar el combobox
		// 1.Sacar datos de la BBDD

		ArrayList<String> ciudad = modelo.getMetodos().cargarciudadesapartamentos();

		// 2.Rellenar combo de lineas

		for (int i = 0; i < ciudad.size(); i++) {
			vista.getInicio().getCombo_ubicacion().addItem(ciudad.get(i));
		}

	}
	
	private void rellenarComboCiudadescasas() {
		// Sacar las lineas de la BBDD y rellenar el combobox
		// 1.Sacar datos de la BBDD

		ArrayList<String> ciudad = modelo.getMetodos().cargarciudadesCasas();

		// 2.Rellenar combo de lineas

		for (int i = 0; i < ciudad.size(); i++) {
			vista.getInicio().getCombo_ubicacion().addItem(ciudad.get(i));
		}

	}
	private void confirmarlogin() {
		String user=vista.getInicio_sesion().getTf_Usuario_Inicio_Sesion().getText();
		String password=String.valueOf(vista.getInicio_sesion().getPf_Contra_Inicio_Sesion().getPassword());
		
		boolean validarLogin=modelo.getMetodos().comprobarLogin(user, password);
		if(validarLogin==true) {
		
			vista.mostrarPantalla(vista.getPagar());
			
		}else {
			//mostramos el error pero borramos los campos para hacer un intendo de nuevo
			System.out.println("esta mal");
			vista.mostrarPantalla(vista.getInicio_sesion());
		}
	}
	private void rellenarresumendatos() {
		
	}
	

	
	
	public void SumarIntroducido(double cantidad) {
		Introducido=Introducido+cantidad;
		vista.getPagar().gettextField_1().setText(Double.toString(Introducido));
		//Datos.sacarResto=Datos.Total-Datos.TotalIntroducido;
		if(preciototal > Introducido) {
			vista.getPagar().gettextField_2().setText(Double.toString(0));
			
		}else {
			Adevolver=Introducido-preciototal;
					;
			vista.getPagar().gettextField_2().setText(Double.toString(Adevolver));
			
		}
	}


}
