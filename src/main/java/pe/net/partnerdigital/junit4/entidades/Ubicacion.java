package pe.net.partnerdigital.junit4.entidades;

import java.util.Date;

public class Ubicacion {

	private Usuario usuario;
	private Pelicula pelicula;
	private Date fechaUbicacion;
	private Date fechaRetorno;
	private Double valor;
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Date getFechaUbicacion() {
		return fechaUbicacion;
	}
	public void setFechaUbicacion(Date fechaUbicacion) {
		this.fechaUbicacion = fechaUbicacion;
	}
	public Date getFechaRetorno() {
		return fechaRetorno;
	}
	public void setFechaRetorno(Date fechaRetorno) {
		this.fechaRetorno = fechaRetorno;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
}
