package vista;

import javax.swing.JPanel;

public class Vista {
//Aqui crear la instancia en privado de los objetos de cada clase
	private Contenedor ventana;
	private Inicio inicio;
	
	
	public Vista() {
		//Aqui completamos la instancia del objeto para poder acceder a sus atributos
		ventana=new Contenedor();
		inicio=new Inicio();
	}
	
	public  void mostrarPantalla(JPanel panel) {
		ventana.frame.setContentPane(panel);
		ventana.frame.setVisible(true);
		
	}
	
}
