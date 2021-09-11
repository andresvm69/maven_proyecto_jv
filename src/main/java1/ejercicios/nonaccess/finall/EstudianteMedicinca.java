package ejercicios.nonaccess.finall;

public class EstudianteMedicinca extends Estudiante{
	
	private String codigoMSP;
	
	protected final void realizarPracticas() {
		System.out.println("Realiza 50 horas de practicas");

	}
	

	protected void realizarPasantias() {
		System.out.println("Realiza 100 horas de practicas");
	}

}
