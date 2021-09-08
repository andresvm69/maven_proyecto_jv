package deber;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion;
		Scanner teclado = new Scanner(System.in);
		
		Estudiante cedula1 = new Estudiante();
		cedula1.getCedula();
		
		Estudiante cedula2 = new Estudiante();
		cedula2.getCedula();
		
		Estudiante cedula3 = new Estudiante();
		cedula3.getCedula();
		
		Estudiante cedula4 = new Estudiante();
		cedula4.getCedula();
		
		Estudiante cedula5 = new Estudiante();
		cedula5.getCedula();
		
		Estudiante[] cedula = new Estudiante[5];
		cedula [0]=cedula1;
		cedula [1]=cedula2;
		cedula [2]=cedula3;
		cedula [3]=cedula4;
		cedula [4]=cedula5;
		
		do {
		
		System.out.println("1. Ingresar Estudiante");
		System.out.println("2. Buscar Estudiante");
		System.out.println("3. Salir");
		System.out.println(" ELIJA UNA OPCION");
		opcion = teclado.nextInt();
		System.out.println(" ");
		
		if (opcion == 1) {
			System.out.print("Ingrese las cedulas de los estudiantes: ");
//			int CE = teclado.nextInt();
//			System.out.println("El valor a retirar es: " + CE);
			System.out.println(" ");
			char A[] = new char[5];
			for (int fila = 0; fila < 5; fila++) {
					System.out.println("Ingrese el valor fila:" + fila );
					Scanner lector=new Scanner (System.in);
					char n= lector.next().charAt(0);
					A[fila]=n;	
			}

		} else if (opcion == 2) {
			System.out.println("Ingrese cedula a buscar");
			String cadena1 = cedula;
			String cadena2 = teclado.nextLine();
			boolean resultado2 = cadena1.equals(cadena2);
			System.out.println("El numero de cedula corresponde:" + resultado2);
			System.out.println(" ");


		} else if (opcion != 3) {
			System.out.println("Elija otra opcion");
			System.out.println(" ");}
		
		
		} while (opcion != 3);
		System.out.println("GRACIAS POR PREFERIRNOS ");

	}

}
