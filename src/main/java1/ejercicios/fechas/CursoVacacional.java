package ejercicios.fechas;

import java.time.LocalDate;


public class CursoVacacional {
	
	private String nombre;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private Instructor Instructor;
	
	
	//Metodos SET Y GET	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
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
	public Instructor getInstructor() {
		return Instructor;
	}
	public void setInstructor(Instructor instructor) {
		Instructor = instructor;
	}
}
