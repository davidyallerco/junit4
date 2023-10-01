package pe.net.partnerdigital.junit4.servicios;

import static pe.net.partnerdigital.junit4.utils.FechaUtils.adicionarDias;

import java.util.Date;

import pe.net.partnerdigital.junit4.entidades.Pelicula;
import pe.net.partnerdigital.junit4.entidades.Ubicacion;
import pe.net.partnerdigital.junit4.entidades.Usuario;

public class UbicacionService {
	
	public Ubicacion alquilarPelicula(Usuario usuario, Pelicula pelicula) {
		Ubicacion ubicacion = new Ubicacion();
		ubicacion.setPelicula(pelicula);
		ubicacion.setUsuario(usuario);
		ubicacion.setFechaUbicacion(new Date());
		ubicacion.setValor(pelicula.getPrecioUbicacion());

		//Entrega no dia seguinte
		Date fechaEntrega = new Date();
		fechaEntrega = adicionarDias(fechaEntrega, 1);
		ubicacion.setFechaRetorno(fechaEntrega);
		
		//Salvando a locacao...	
		//TODO adicionar método para salvar
		
		return ubicacion;
	}

	public static void main(String[] args) {
		
	}

}
