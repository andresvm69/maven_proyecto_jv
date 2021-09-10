package ejercicios.deber.ordenamiento;

import java.util.Scanner;

import ejercicios.ordenamiento.Paciente;

public class Registro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoString=new Scanner (System.in);
		
		Paciente paciente1 =new Paciente();
		paciente1.setNombre("");
		paciente1.setApellido("");
		paciente1.setEdad(2);
		paciente1.setSintoma(" " );
		
		do {
		
		System.out.println("1. Registrar paciente");
		System.out.println("2. Imprimir reporte");
		System.out.println("3. Salir");
		System.out.println(" ELIJA UNA OPCION");
		opcion = teclado.nextInt();
		System.out.println(" ");
		
		if (opcion == 1) {
			System.out.print("Ingrese su nombre: ");
			String nombre = tecladoString.nextLine();
			System.out.print("Ingrese su apellido: ");
			String apellido = tecladoString.nextLine();
			System.out.print("Ingrese su edad: ");
			int edad = teclado.nextInt();
			System.out.print("Ingrese el sintoma: ");
			String sintoma = tecladoString.nextLine();


			System.out.println(" ");

		} else if (opcion == 2) {
			
			System.out.println("Su nombre es: "+ nombre);
			System.out.println("Su apellido es: "+ apellido);
			System.out.println("Su edad es: "+ edad);
			System.out.println("Su edad es: "+ sintoma);
			
		} else if (opcion != 3) {
			System.out.println("Elija otra opcion");
			System.out.println(" ");}
		
		} while (opcion != 3);
		System.out.println("GRACIAS");

	}

}