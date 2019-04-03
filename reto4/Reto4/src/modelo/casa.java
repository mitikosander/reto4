package modelo;

public class casa extends alojamiento {
	private int num_ba�os;
	private double metroscuadrados;
	
	//constructor vacio
	public casa() {
		super();
	}
	//constructor con herencia
	public casa(int num_habitaciones, int num_camas, String tipo_cama, String pension, String ubicacion, String nombre,
			boolean wifi, boolean piscina, boolean spa, boolean parking, boolean aire, boolean restaurante, boolean bar,
			boolean gimnasio, int num_ba�os, double metroscuadrados) {
		super(num_habitaciones, num_camas, tipo_cama, pension, ubicacion, nombre, wifi, piscina, spa, parking, aire,
				restaurante, bar, gimnasio);
		this.num_ba�os=num_ba�os;
		this.metroscuadrados=metroscuadrados;
		
	}
	
	//getters and setters
	public int getNum_ba�os() {
		return num_ba�os;
	}
	public void setNum_ba�os(int num_ba�os) {
		this.num_ba�os = num_ba�os;
	}
	public double getMetroscuadrados() {
		return metroscuadrados;
	}
	public void setMetroscuadrados(double metroscuadrados) {
		this.metroscuadrados = metroscuadrados;
	}
	
	
	
	
	
}
