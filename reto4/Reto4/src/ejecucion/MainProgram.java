package ejecucion;

import java.io.FileWriter;
import java.io.PrintWriter;

public class MainProgram {

	public static void main(String[] args) {
	modificarfitxero();
		}
		public static   void modificarfitxero() {
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
	
