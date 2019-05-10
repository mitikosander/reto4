package modelo;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vista.Vista;

public class Metodos {

	private static ArrayList<String> ciudades;
	private static ArrayList<String> hoteles;
	private static ArrayList<String> apartamentos;
	private static ArrayList<String> casas;
	private static ArrayList<String> precios;
	private ArrayList<modelo.Alojamiento> busquedas;
	static String fecha;
	static String fecha2;
	// metodo para guardar el nombre de las ciudades en un arraylist con el que
	// cargaremos el combobox

	public ArrayList<String> cargarciudades() {
		ciudades = new ArrayList<String>();
		String sql = "SELECT ubicacion FROM hoteles";
		BBDD conectar = new BBDD();
		try {
			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				ciudades.add(rs.getString(1));

			}
			return ciudades;
		} catch (SQLException e) {
			System.err.println("Consulta erronea, motivo del error: " + e);
			return ciudades = null;
		}

	}
	
	public ArrayList<String> cargarciudadesCasas() {
		casas = new ArrayList<String>();
		String sql = "SELECT ubicacion FROM casas";
		BBDD conectar = new BBDD();
		try {
			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				casas.add(rs.getString(1));

			}
			return casas;
		} catch (SQLException e) {
			System.err.println("Consulta erronea, motivo del error: " + e);
			return casas = null;
		}

	}
	
	public ArrayList<String> cargarciudadesapartamentos() {
		apartamentos = new ArrayList<String>();
		String sql = "SELECT ubicacion FROM apartamentos";
		BBDD conectar = new BBDD();
		try {
			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				apartamentos.add(rs.getString(1));

			}
			return apartamentos;
		} catch (SQLException e) {
			System.err.println("Consulta erronea, motivo del error: " + e);
			return apartamentos = null;
		}

	}
	
	public ArrayList<String> cargarApartamentos(String nombreubicacion) {
		Vista vista = new Vista();

		BBDD conectar = new BBDD();
		apartamentos = new ArrayList<String>();
		String sql = "SELECT nombre FROM apartamentos WHERE ubicacion LIKE '"+nombreubicacion+"' ";

		try {
			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				apartamentos.add(rs.getString(1));

			}
			return apartamentos;
		} catch (Exception e) {
			System.err.println("Consulta no valida");
			return apartamentos = null;
		}

		
	}
	
	public ArrayList<String> cargarcasas(String nombreubicacion) {
		Vista vista = new Vista();

		BBDD conectar = new BBDD();
		casas = new ArrayList<String>();
		String sql = "SELECT nombre FROM casas WHERE ubicacion LIKE '"+nombreubicacion+"' ";

		try {
			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				casas.add(rs.getString(1));

			}
			return casas;
		} catch (Exception e) {
			System.err.println("Consulta no valida");
			return casas = null;
		}

		
	}

	public ArrayList<String> cargarHoteles(String nombreubicacion) {
		Vista vista = new Vista();

		BBDD conectar = new BBDD();
		hoteles = new ArrayList<String>();
		String sql = "SELECT nombre FROM hoteles WHERE ubicacion LIKE '"+nombreubicacion+"' ";

		try {
			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				hoteles.add(rs.getString(1));


	
	//metodo para guardar el nombre de las ciudades en un arraylist con el que cargaremos el combobox
	

	public  ArrayList<String> cargarciudades(){
		ciudades = new ArrayList<String>();
		String sql="SELECT ubicacion FROM hoteles";
		BBDD conectar=new BBDD();
		
		
		try {
			PreparedStatement ps=conectar.conectarBase().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {

				ciudades.add(rs.getString(1));
				
				
			}
			
			return ciudades;
		}catch(SQLException e) {
			System.err.println("Consulta erronea, motivo del error: "+e);
			return ciudades=null;
			}

		
	}
	public double cargarprecioshoteles(String nombrehotel) {
		Vista vista = new Vista();
		BBDD conectar = new BBDD();
		double precios = 0;
		String sql = "SELECT precio FROM hoteles WHERE nombre LIKE '"+nombrehotel+"' ";

		try {
			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
			 precios = rs.getDouble("precio");

			}
			
		} catch (Exception e) {
			System.err.println("Consulta no valida");
			
		}
		return precios;

		
	}
	
	public double cargarpreciosapartamentos(String nombreapartamento) {
		Vista vista = new Vista();

		BBDD conectar = new BBDD();
		double precios = 0;
		String sql = "SELECT precio FROM hoteles WHERE nombre LIKE '"+nombreapartamento+"' ";

		try {
			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
			 precios = rs.getDouble("precio");

			}
			
		} catch (Exception e) {
			System.err.println("Consulta no valida");
			
		}
		return precios;

		
	}
	
	public double cargarprecioscasas(String nombrecasas) {
		Vista vista = new Vista();

		BBDD conectar = new BBDD();
		double precios = 0;
		String sql = "SELECT precio FROM hoteles WHERE nombre LIKE '"+nombrecasas+"' ";

		try {
			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
			 precios = rs.getDouble("precio");

			}
			
		} catch (Exception e) {
			System.err.println("Consulta no valida");
			
		}
		return precios;

		
	}
	

	// Metodo para buscar alojamiento segun los valores indicados en la busqueda
	public ArrayList<Alojamiento> buscarAlojamientos() {
		ArrayList<Alojamiento> ret = new ArrayList<Alojamiento>();
		
		Vista vista = new Vista();
		BBDD conectar = new BBDD();
		String sql = "SELECT * FROM hoteles WHERE ubicacion LIKE '" + vista.getInicio().getCombo_ubicacion() + "'";
		Alojamiento alojamiento = new Alojamiento();
		try {
			if (vista.getInicio().getCombo_ubicacion().getSelectedItem() != null) {
				PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {

					alojamiento.setNum_habitaciones(rs.getInt(1));
					alojamiento.setNum_camas(rs.getInt(2));
					alojamiento.setTipo_cama(rs.getString(3));
					alojamiento.setPension(rs.getString(4));
					alojamiento.setUbicacion(rs.getString(5));
					alojamiento.setNombre(rs.getString(6));
					ret.add(alojamiento);
				}
				rs.close();
				System.out.println("Lista cargada");
			} else {
				System.err.println("Error al cargar la lista, Ubicacion nula");
			}

		} catch (SQLException e) {
			System.err.println("Conexion fallida, causa del error: " + e);
		}

		return ret;

	}
	public  DefaultTableModel  cargarTablahoteles(String ubicacion){
		
		Vista vista=new Vista();
		
		String sql="SELECT nombre,precio,tipo_cama,n_camas,n_habitaciones FROM hoteles WHERE ubicacion LIKE '"+ubicacion+"'";
		BBDD conectar=new BBDD();
		busquedas=null;
		
		
		DefaultTableModel modelo = new DefaultTableModel();
		
		
		modelo.addColumn("Nombre: ");
		modelo.addColumn("Precio: ");
		modelo.addColumn("Tipo Cama: ");
		modelo.addColumn("Nº Camas: ");
		modelo.addColumn("Nº Habitaciones: ");
		
		try {
			
			PreparedStatement ps=conectar.conectarBase().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				//Creamos un array para carda fila de la tabla
				Object [] fila = new Object[5]; // Hay 5 columnas en la tabla asi que asignamos 5 posiciones
				
				//insertamos los datos en su posicion del array
				for(int i=0;i<fila.length;i++) {
					fila[i]=rs.getObject(i+1);
				}
				
				//anyadimos la fila a la tabla
				modelo.addRow(fila);
				
				
				
			}
		}catch(SQLException e) {
			System.err.println("Conexion fallida, causa del error: "+ e);
		}
		
		//pasamos la tabla poblada lista para usar
		return modelo;
		
		
	}
	
public  DefaultTableModel  cargarTablaapartamentos(String ubicacion){
		
		Vista vista=new Vista();
  
	//Metodo para buscar alojamiento segun los valores indicados en la busqueda
	public  TableModel  cargarTablaAlojamientos(String ubicacion){
	
	Vista vista=new Vista();
	
	String sql="SELECT nombre,precio,tipo_cama,n_camas,n_habitaciones FROM hoteles WHERE ubicacion LIKE '"+ubicacion+"'";
	BBDD conectar=new BBDD();
	busquedas=null;
	
	
	TableModel modelo = new TableModel();
	
	
	modelo.addColumn("Nombre: ");
	modelo.addColumn("Precio: ");
	modelo.addColumn("Tipo Cama: ");
	modelo.addColumn("Nº Camas: ");
	modelo.addColumn("Nº Habitaciones: ");
	
	try {
		
		PreparedStatement ps=conectar.conectarBase().prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			
			//Creamos un array para carda fila de la tabla
			Object [] fila = new Object[5]; // Hay 5 columnas en la tabla asi que asignamos 5 posiciones
			
			//insertamos los datos en su posicion del array
			for(int i=0;i<fila.length;i++) {
				fila[i]=rs.getObject(i+1);
			}
			
			//anyadimos la fila a la tabla
			modelo.addRow(fila);
			
			
			
		}
	}catch(SQLException e) {
		System.err.println("Conexion fallida, causa del error: "+ e);
	}
	
	//pasamos la tabla poblada lista para usar
	return modelo;
	
	
	}

	//Metodo para recibir de la BBDD el precio de nuestra selección 
	public double cargarPrecioHotelSelecc(String nombrehotel){
		double precio=0;

		
		String sql="SELECT Nombre,Precio,Estrellas,Ubicacion FROM apartamentos WHERE ubicacion LIKE '"+ubicacion+"'";
		BBDD conectar=new BBDD();
		busquedas=null;
		
		
		DefaultTableModel modelo = new DefaultTableModel();
		
		
		modelo.addColumn("Nombre: ");
		modelo.addColumn("Precio: ");
		modelo.addColumn("Estrellas ");
		modelo.addColumn("Ubicacion ");
		
		try {
			
			PreparedStatement ps=conectar.conectarBase().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				
				//Creamos un array para carda fila de la tabla
				Object [] fila = new Object[4]; // Hay 5 columnas en la tabla asi que asignamos 5 posiciones
				
				//insertamos los datos en su posicion del array
				for(int i=0;i<fila.length;i++) {
					fila[i]=rs.getObject(i+1);
				}
				
				//anyadimos la fila a la tabla
				modelo.addRow(fila);
				
				
				
			}
		}catch(SQLException e) {
			System.err.println("Conexion fallida, causa del error: "+ e);
		}
		
		//pasamos la tabla poblada lista para usar
		return modelo;
		
		
	}

	/*public double cargarPrecioHotelSelecc(String nombrehotel) {
		double precio = 0;

		String sql = "SELECT precio FROM hoteles WHERE nombre LIKE '" + nombrehotel + "'";
		BBDD conectar = new BBDD();

		try {
			PreparedStatement ps = conectar.conectarBase().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				precio = rs.getDouble(0);
			}
		} catch (SQLException e) {
			System.err.println("Conexion fallida, causa del error:" + e);
		}

		return precio;
	}*/

	public static void imprimirfecha() {
		Vista vista = new Vista();
		String dia = Integer.toString(vista.getInicio().getCalendar_entrada().getCalendar().get(Calendar.DAY_OF_MONTH)); 
		String mes = Integer.toString(vista.getInicio().getCalendar_entrada().getCalendar().get(Calendar.MONTH) + 1);
		String year = Integer.toString(vista.getInicio().getCalendar_entrada().getCalendar().get(Calendar.YEAR)); 
		 fecha = (dia + "-" + mes+ "-" + year); 

		String dia2 = Integer.toString(vista.getInicio().getCalendar_salida().getCalendar().get(Calendar.DAY_OF_MONTH)); 
		String mes2 = Integer.toString(vista.getInicio().getCalendar_salida().getCalendar().get(Calendar.MONTH) + 1);
		String year2 = Integer.toString(vista.getInicio().getCalendar_salida().getCalendar().get(Calendar.YEAR)); 
		 fecha2 = (dia2 + "-" + mes2+ "-" + year2); 
		
	}
	
public boolean comprobarLogin(String dni,String password) {
		BBDD conectar=new BBDD();
		String sql="SELECT DNI,Contrasena FROM usuarios WHERE DNI LIKE '"+dni+"' AND Contrasena LIKE '"+password+"'";
		

			try {
			PreparedStatement ps=conectar.conectarBase().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			rs.last();
			if(rs.getRow()>0) {
				return true;
			}else {
				return false;
			}
					
			}catch(Exception e) {
			System.err.println("Consulta erronea"+e);
			return false;
		}
		}
	

	


	// Metodo para generar un fichero de texto
	public static void modificarfichero() {
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter("C:\\Users\\alain\\Desktop\\prueba.txt");
			pw = new PrintWriter(fichero);

			imprimirfecha();
				
				pw.println(fecha);
				pw.println(fecha2);
			

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Nuevamente aprovechamos el finally para
				// asegurarnos que se cierra el fichero.
				if (null != fichero)
					fichero.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}


	//Metodo para generar un fichero de texto
	private static void modificarfichero() {
		 FileWriter fichero = null;
       PrintWriter pw = null;
       try
       {
           fichero = new FileWriter("C:\\Users\\in1dm3b_15\\Desktop\\prueba.txt");
           pw = new PrintWriter(fichero);

           for (int i = 0; i < 10; i++) {
           	pw.println("lo que quieras");
               pw.println("Linea " + i);
           }

       } catch (Exception e) {
           e.printStackTrace();
       } finally {
          try {
          // Nuevamente aprovechamos el finally para 
          // asegurarnos que se cierra el fichero.
          if (null != fichero)
             fichero.close();
          } catch (Exception e2) {
             e2.printStackTrace();
          }
       }
	
	}	
	
	private static boolean verificarFecha() {
	    Date entrada = vista.Inicio.calendar_entrada.getDate();
        Date salida = vista.Inicio.calendar_salida.getDate();
        
        if(entrada.before(salida)) {
        	//esta bien, la fecha de entrada es antes de el de salida
        	return true;
        	
        }else {
        	//esta mal, la fecha de entrada es mas tarde que el de la salida y eso es imposible
        	return false;
        }
        
	}
	

}
