package ejercicios.seleccion.switchs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		 // el swicht hasta antes de la version 1.7 de 
		//  java no funcionaba para string solo funcionaba para enteros para bytes para int,short,char
		String opcion;
		
		do {
			System.out.println("Escoja opcion:");
			System.out.println("1. Realizar transferencia");
			System.out.println("2. Consultar pagos");
			System.out.println("3. SALIR");
			opcion = teclado.nextLine();
			
			switch(opcion){
			case "1":        
				System.out.println("Ingrese numero de cuenta");
				break;
			case "2": 
				System.out.println("No existen pagos");
				break;
			case "3": 
				System.out.println("Cerrando el sistema");
				break;
				default:
					System.out.println("No ha elejido ninguna opcion valida");
				break;
			}

		} while (!opcion.equals("3"));// similar a opcion!=3
		System.out.println("Gracias por preferirnos");

	}

}
