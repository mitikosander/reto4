package modelo;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vista.Vista;

public class Metodos {
	
	
	
	private static ArrayList<modelo.Alojamiento> busquedas;
	


	//Metodo para buscar alojamiento segun los valores indicados en la busqueda
	private static ArrayList<modelo.Alojamiento> buscarAlojamientos(){
	String sql="";
	BBDD conectar=new BBDD();
	busquedas=null;
	Alojamiento a1=new Alojamiento();
	try {
		PreparedStatement ps=conectar.conectarBase().prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			busquedas.add(a1);
		}
	}catch(SQLException e) {
		System.err.println("Conexion fallida, causa del error: "+ e);
	}
	
	return busquedas;
	
		
		
	
	}
	
	
	//Metodo para generar el fichero de texto
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
