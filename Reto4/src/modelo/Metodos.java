package modelo;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import vista.Vista;

public class Metodos {
	
	

	
	
	private  ArrayList<modelo.Alojamiento> busquedas;
	private  ArrayList<String> ciudades;
	
	

	
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

	//Metodo para buscar alojamiento segun los valores indicados en la busqueda
	public  DefaultTableModel  cargarTablaAlojamientos(String ubicacion){
	
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

	
	public double cargarPrecioHotelSelecc(String nombrehotel){
		double precio=0;
		
		String sql="SELECT precio FROM hoteles WHERE nombre LIKE '"+nombrehotel+"'";
		BBDD conectar=new BBDD();
		
		try {
			PreparedStatement ps=conectar.conectarBase().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				precio=rs.getDouble(0);
			}
		}catch(SQLException e) {
			System.err.println("Conexion fallida, causa del error:" +e);
		}
		
		return precio;
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
	
}
