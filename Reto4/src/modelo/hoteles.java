package modelo;

public class hoteles extends alojamiento{
    
    //ATRIBUTOS
    private int  num_estrellas;
    
    //CONSTRUCTOR
    public hoteles() {
		super();
	}
    
	//CONSTRUCTOR CON HERENCIA
	public hoteles(int num_habitaciones, int num_camas, String tipo_cama, String pension, String ubicacion,
			String nombre, boolean wifi, boolean piscina, boolean spa, boolean parking, boolean aire,
			boolean restaurante, boolean bar, boolean gimnasio, int num_estrellas) {
		super(num_habitaciones, num_camas, tipo_cama, pension, ubicacion, nombre, wifi, piscina, spa, parking, aire,
				restaurante, bar, gimnasio);
		this.num_estrellas=num_estrellas;
	}

	//GETTERS AND SETTERS
	public int getNum_estrellas() {
		return num_estrellas;
	}

	public void setNum_estrellas(int num_estrellas) {
		this.num_estrellas = num_estrellas;
	}


   

}
