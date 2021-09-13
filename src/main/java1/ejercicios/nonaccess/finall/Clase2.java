package ejercicios.nonaccess.finall;

public class Clase2 {

	public final String horadeInicio = "07:00";
	
	public Clase2() { 
		//No se puede reasignar a un atributo final
		horadeInicio = "07:00";
	}
	
	protected final void realizarTarea() {
		System.out.println("Realiza 10 ejercicios");

	}
}
