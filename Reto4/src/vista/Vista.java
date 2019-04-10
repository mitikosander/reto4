package vista;

import javax.swing.JPanel;

public class Vista {

	
	//Aqui crear la instancia en privado de los objetos de cada clase
	private Contenedor ventana;
	private Inicio inicio;
	private Pagar pagar;
	private Vueltas vueltas;
	private Mostrar_Lista listahoteles;
	
	
	public Vista() {
		//Aqui completamos la instancia del objeto para poder acceder a sus atributos
		ventana=new Contenedor();
		inicio=new Inicio();
		pagar=new Pagar();
		vueltas=new Vueltas();
		listahoteles=new Mostrar_Lista();
	}
	
	public  void mostrarPantalla(JPanel panel) {
		ventana.setContentPane(panel);
		ventana.setVisible(true);
		
	}

	public Contenedor getVentana() {
		return ventana;
	}

	public void setVentana(Contenedor ventana) {
		this.ventana = ventana;
	}

	public Inicio getInicio() {
		return inicio;
	}

	public void setInicio(Inicio inicio) {
		this.inicio = inicio;
	}

	public Pagar getPagar() {
		return pagar;
	}

	public void setPagar(Pagar pagar) {
		this.pagar = pagar;
	}

	public Vueltas getVueltas() {
		return vueltas;
	}

	public void setVueltas(Vueltas vueltas) {
		this.vueltas = vueltas;
	}

	public Mostrar_Lista getListahoteles() {
		return listahoteles;
	}

	public void setListahoteles(Mostrar_Lista listahoteles) {
		this.listahoteles = listahoteles;
	}

	
	
}
