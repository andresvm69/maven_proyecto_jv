package ejercicios.variables.locales.globales;

import deber.Estudiante;

public class Main{
	public static void main(String[] args) {
	
	Persona juan =new Persona();
	juan.setNombre("juan");
	juan.setEdad(21);
	System.out.println("valor del atributo estatico: "+Persona.provincia);
	System.out.println("valor del atributo estatico: "+Persona.canton);

	}
	

}
