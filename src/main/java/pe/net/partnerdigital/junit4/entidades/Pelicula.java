package pe.net.partnerdigital.junit4.entidades;

public class Pelicula {

	private String nombre;
	private Integer stock;
	private Double precioUbicacion;  
	
	public Pelicula() {}
	
	public Pelicula(String nombre, Integer stock, Double precioUbicacion) {
		this.nombre = nombre;
		this.stock = stock;
		this.precioUbicacion = precioUbicacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNome(String nombre) {
		this.nombre = nombre;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Double getPrecioUbicacion() {
		return precioUbicacion;
	}
	public void setPrecioUbicacion(Double precioUbicacion) {
		this.precioUbicacion = precioUbicacion;
	}
}
