package modelo;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Metodos {
	
	
	
	private static ArrayList<modelo.Hotel> hoteles;
	private static Hotel h1;


	//Metodo para buscar los hoteles segun los valores indicados en la busqueda
	private static ArrayList<modelo.Hotel> cargarHoteles(){
		hoteles = null;
		String sql="SELECT * FROM HOTELES WHERE ";
		BBDD conexion=new BBDD();
		h1 = null;
		//a
		
		try {
			PreparedStatement ps=conexion.conectarBase().prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				h1.setNombre(rs.getString(1));
				h1.setNum_camas(rs.getInt(2));
				h1.setNum_estrellas(rs.getInt(3));
				h1.setAire(rs.getBoolean(4));
				h1.setBar(rs.getBoolean(5));
				h1.setGimnasio(rs.getBoolean(6));
				h1.setParking(rs.getBoolean(7));
				h1.setPension(rs.getString(8));
				h1.setPiscina(rs.getBoolean(9));
				h1.setRestaurante(rs.getBoolean(10));
				h1.setSpa(rs.getBoolean(11));
				h1.setTipo_cama(rs.getString(12));
				h1.setUbicacion(rs.getString(13));
				h1.setWifi(rs.getBoolean(14));
				
				hoteles.add(h1);
			}
			
		}catch(SQLException e) {
			System.err.println("Valor no valido");
		}
		
		return hoteles;
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
           	pw.println("es de prueba");
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
