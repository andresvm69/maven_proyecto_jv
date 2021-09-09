package ejercicios.deber;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion;
		
		Scanner teclado = new Scanner(System.in);
		
		Estudiante[] lista = new Estudiante[5];

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
		
		lista [0]=cedula1;
		lista [1]=cedula2;
		lista [2]=cedula3;
		lista [3]=cedula4;
		lista [4]=cedula5;
		
		do {
		
		System.out.println("1. Ingresar Estudiante");
		System.out.println("2. Buscar Estudiante");
		System.out.println("3. Salir");
		System.out.println(" ELIJA UNA OPCION");
		opcion = teclado.nextInt();
		System.out.println(" ");
		
		if (opcion == 1) {
			System.out.print("Ingrese las cedulas de los estudiantes: ");
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
			String cedulaBuscar = teclado.nextLine();
			for(int i=0; i<5 ; i++) {
				Estudiante estudiante = lista[i];
				String cedula= estudiante.getCedula();
				boolean resultado = cedulaBuscar.equals(cedulaDelEstudianteFila);
				if(resultado == false) {
					System.out.println("El numero de cedula no encontrado");
					
				} else if (resultado == true) {
				System.out.println("El numero de cedula encontrado");
				System.out.println(" ");
		
		
		} while (opcion != 3);
		System.out.println("GRACIAS POR PREFERIRNOS ");

	}


	}
	
}
		}
