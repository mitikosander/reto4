package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BBDD {
    //Declaramos los datos para la conexion
    static String passBBDD="admin";
    static String userBBDD="admin";
    final static String NOMBREBBDD="reto4";
    final static String IPBBDD="127.0.0.1";
    static String rutaBBDD="jdbc:mysql:/"+IPBBDD+"/"+NOMBREBBDD+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    private Connection conexion;
    
    //Creamos el metodo para conectar a la base
    public Connection conectarBase() {
		
		//llamamos al Driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver cargado");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Driver no encontrado");
		}
		
		//establecemos la conexion pasando los parametros definidos
		try {
			 conexion = DriverManager.getConnection(
					   rutaBBDD,
					   userBBDD,
					   passBBDD);
			System.out.println("Conexion completa");
			return conexion;
			
		} catch (SQLException e) {
			System.err.println("Error en la conexion");
			return null;
		}
	
		
	}
    
  //Método para desconectar la BBDD
	
  	public void desconectar() {
          if(conexion != null) {
              try {
                  conexion.close();
                  conexion = null;
              } catch (SQLException e) {
              }
          }
      }
}
