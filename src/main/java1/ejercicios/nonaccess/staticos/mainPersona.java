package ejercicios.nonaccess.staticos;

public class mainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente1=new Paciente();
		paciente1.setNombre("Juanito");
		paciente1.setEdad(25);
		
		paciente1.registrar(paciente1.getNombre());
		Paciente.consultarNacionalidadStatica();
	}

}
