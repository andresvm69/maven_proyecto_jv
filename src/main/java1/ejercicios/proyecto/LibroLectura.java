package ejercicios.proyecto;

import java.time.LocalDate;

public class LibroLectura extends Libro{

	public int TiempoAproximadoLectura;
	
	private LocalDate fechaInicio;
	private LocalDate fechaFin;

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}

	public int getTiempoAproximadoLectura() {
		return TiempoAproximadoLectura;
	}

	public void setTiempoAproximadoLectura(int tiempoAproximadoLectura) {
		TiempoAproximadoLectura = tiempoAproximadoLectura;
	}
	public String toString() {
		return "Nombre: " + nombre + " - Autor: " + autor + " - Año " + anhio + " - Estado " + estado + " - Fecha Entrega "+ fechaDeEntrega ;
	}


}
