package ejercicios.nonaccess.finall;

public final class EstudianteCiencias extends Estudiante {
	
	private String velocidadInternet;
	
	public final String horarioEntrada = "08:00";
	public String ciudadNacimineto="Quito";
	
	
	public EstudianteCiencias() { 
		//No se puede reasignar a un atributo final
		horarioEntrada ="08:30"; 
		ciudadNacimineto="Guayaquil";
	}
	

}
