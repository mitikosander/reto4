package modelo;

public class Modelo {
	
	private Metodos metodos;
	private Casa casa;
	private Hotel hotel;
	private Apartamento apartamento;
	private Alojamiento alojamiento;
	private BBDD basededatos;
	private TableModel modelotabla;
	
	public Modelo() {
		metodos=new Metodos();
		casa=new Casa();
		hotel=new Hotel();
		apartamento=new Apartamento();
		alojamiento=new Alojamiento();
		basededatos= new BBDD();
		modelotabla=new TableModel();
	}
	
	
	//añadimos los getters y setters
	public Metodos getMetodos() {
		return metodos;
	}
	public void setMetodos(Metodos metodos) {
		this.metodos = metodos;
	}
	public Casa getCasa() {
		return casa;
	}
	public void setCasa(Casa casa) {
		this.casa = casa;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public Apartamento getApartamento() {
		return apartamento;
	}
	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}
	public Alojamiento getAlojamiento() {
		return alojamiento;
	}
	public void setAlojamiento(Alojamiento alojamiento) {
		this.alojamiento = alojamiento;
	}
	public BBDD getBasededatos() {
		return basededatos;
	}
	public void setBasededatos(BBDD basededatos) {
		this.basededatos = basededatos;
	}
	public TableModel getModelotabla() {
		return modelotabla;
	}


	public void setModelotabla(TableModel modelotabla) {
		this.modelotabla = modelotabla;
	}
	
}
