package prueba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String claveIngresada;
		do {
		System.out.println("Ingrese clave");
		Scanner teclado = new Scanner(System.in);  
		
		claveIngresada=teclado.nextLine();
		
		if(claveIngresada.equals("85DB")) {
			System.out.println("BANCO PRODUBANCO, elija una opción :");
			System.out.println("1. Consultar Pagos");
			System.out.println("2. Realizar transferencia");
			System.out.println("3. SALIR");
					
		}else {			
			System.out.println("La clave no es la correcta");

		}
		}while(claveIngresada !="-1");
		System.out.println("Gracias por preferirnos");

		
	}

}
