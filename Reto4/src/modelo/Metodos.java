package modelo;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
	public  ArrayList<modelo.Alojamiento> buscarAlojamientos(){
	Vista vista=new Vista();
	String sql="SELECT * FROM hoteles WHERE ubicacion LIKE '"+vista.getInicio().getCombo_ubicacion()+"'";
	BBDD conectar=new BBDD();
	busquedas=null;
	Alojamiento a1=new Alojamiento();
	try {
		if(vista.getInicio().getCombo_ubicacion().getSelectedItem()!=null) {
		PreparedStatement ps=conectar.conectarBase().prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			
			
			a1.setNum_habitaciones(rs.getInt(1));
			a1.setNum_camas(rs.getInt(2));
			a1.setTipo_cama(rs.getString(3));
			a1.setPension(rs.getString(4));
			a1.setUbicacion(rs.getString(5));
			a1.setNombre(rs.getString(6));
			a1.setWifi(rs.getBoolean(7));
			a1.setPiscina(rs.getBoolean(8));
			a1.setSpa(rs.getBoolean(9));
			a1.setParking(rs.getBoolean(10));
			a1.setAire(rs.getBoolean(11));
			a1.setRestaurante(rs.getBoolean(12));
			a1.setBar(rs.getBoolean(13));
			a1.setGimnasio(rs.getBoolean(14));
			a1.setPrecio(rs.getDouble(16));
			busquedas.add(a1);
			
		}
		System.out.println("Lista cargada");
		}else {
			System.err.println("Error al cargar la lista, Ubicacion nula");
		}
	
	}catch(SQLException e) {
		System.err.println("Conexion fallida, causa del error: "+ e);
	}
	
	return busquedas;
	
		
		
	
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
