package examen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		#################################CONCESIONARIO AMBACAR, elija una opción:
//			1.Ingresar Auto
//			2.Consultar Auto
//			3.Actualizar Kilometraje
//			4.Imprimir Reporte
//			5.SALIR#################################
		Scanner teclado = new Scanner(System.in);
		Scanner lector = new Scanner(System.in);
		String opcion;
		String op;
		
		do {
			System.out.println("#################################CONCESIONARIO AMBACAR, elija una opción:");
			System.out.println("1. Ingresar Auto");
			System.out.println("2. Consultar Auto");
			System.out.println("3. Actualizar Kilometraje");
			System.out.println("4. Imprimir Reporte");
			System.out.println("5. SALIR#################################");
			
			opcion = teclado.nextLine();
			
			switch(opcion){
			case "1": 
			do {
				System.out.println("a. Auto Nacional ");
				System.out.println("b. Auto Importado");
				System.out.println("Seleccione una opcion: ");
				opcion = teclado.nextLine();
				switch(opcion){
				case"a":
					System.out.println("Ingrese la Marca: ");
					String marca = teclado.nextLine();
					System.out.println("Ingrese Modelo: ");
					String modelo = teclado.nextLine();
					System.out.println("Ingrese Año de Fabricacion: ");
					int anhio = teclado.nextInt();
					System.out.println("Ingrese Placa: ");
					String placa = teclado.nextLine();
					System.out.println("Ingrese Kilometraje: ");
					int kilo = teclado.nextInt();
					break;
				}
			}while (!opcion.equals("b")); 
				System.out.println("Ingrese la Marca: ");
				String marca = teclado.nextLine();
				System.out.println("Ingrese Modelo: ");
				String modelo = teclado.nextLine();
				System.out.println("Ingrese Año de Fabricacion: ");
				int anhio = teclado.nextInt();
				System.out.println("Ingrese Placa: ");
				String placa = teclado.nextLine();
				System.out.println("Ingrese Kilometraje: ");
				int kilo = teclado.nextInt();
				System.out.println("Ingrese el codigo de importacion ");
				String codigo = teclado.nextLine();	
				System.out.println("Ingrese el valor de importacion ");
				int valor = teclado.nextInt();

			break;
			case "2":
				do {
				System.out.println("a. Ingresar un libro");
				System.out.println("b. Prestar un libro");
				System.out.println("c. Aplazar fecha de entrega");
					opcion = teclado.nextLine();
					switch(opcion){
					case"a":
						System.out.println("Ingrese Codigo: ");
						String codigo1 = teclado.nextLine();
						System.out.println("Ingrese Nombre: ");
						String nombre = teclado.nextLine();
						System.out.println("Ingrese Autor: ");
						String autor1 = teclado.nextLine();
						System.out.println("Ingrese Año de publicacion: ");
						int anhio = teclado.nextInt();
						System.out.println("Ingrese Editorial: ");
						String Editorial = teclado.nextLine();
						System.out.println("Ingrese Cantidad de paginas: ");
						int Cantidad = teclado.nextInt();
						System.out.println("Ingrese Precio: ");
						int precio = teclado.nextInt();
						break;
					case"b":
						System.out.println("Ingrese el codigo del libro: ");
						String codigoL = teclado.nextLine();
						break;
					}
				}while (!opcion.equals("c")); 
				System.out.println("Ingrese el codigo del libro ");
				String codigoLib = teclado.nextLine();	
				
				System.out.println("Ingrese la cedula del estudiante que se presto el libro");
				int cedula1 = teclado.nextInt();

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
