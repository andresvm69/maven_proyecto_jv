package prueba;

import java.util.Scanner;

public class Prueba1 {


	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int clave = 85;
		int opcion;
		int opcionSalir = -1;
		do {
		if (clave == 85) {
			System.out.println("Ingresar Clave");
			String Clave = teclado.next();
			do {
				
				System.out.println("**********************************************");
				System.out.println("BANCO PRODUBANCO, elija una opción :");
				System.out.println("1. Realizar transferencia");
				System.out.println("2. Consultar transacciones");
				System.out.println("3. SALIR");
				System.out.println("**********************************************");
				opcion = teclado.nextInt();
				System.out.println(" ");
				
				if (opcion == 1) {
					System.out.println("Realizar transferencia... ");
					System.out.println("Ingrese la cuenta del destinatario");
					int D = teclado.nextInt();
					System.out.println("La cuenta del destinatario es: " + D);
					System.out.println("Ingrese el monto a transferir");
					int Monto = teclado.nextInt();
					System.out.println("Su valor a transferir es: " + Monto);
					int deposito=1000;
					int Saldo= Monto-deposito;
					System.out.println("Su nuevo saldo es: " + Saldo);
					
					System.out.println(" ");

				} else if (opcion == 2) {
					System.out.println("Ingrese nueva clave: ");
					System.out.println("En este momento se estan procesando las transacciones, intente mas tarde");
					System.out.println(" ");


				} else if (opcion != 3) {
					System.out.println("Elija otra opcion");
					System.out.println(" ");}

				} while (opcion != 3);
				System.out.println("GRACIAS POR PREFERIRNOS ");
		

			
		}else if (clave != 85){
		System.out.println("Clave incorrecta ");
		System.out.println(" ");
		}
		} while ((opcionSalir== -1));
		System.out.println("GRACIAS POR PREFERIRNOS ");
		System.out.println(" ");



	}

}
