package ejercicios.nonaccess.finall;

public class EstudianteOdontologia extends EstudianteMedicinca {
	
	@Override
	protected void realizarPracticas() {//No se puede sobreescribir un metodo final del padre
		System.out.println("Realiza 100 horas de practicas");

	}
	
	
	protected void realizarPasantias() {
		System.out.println("Realiza 100 horas de practicas");
	}


}
