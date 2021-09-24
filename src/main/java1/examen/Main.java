package examen;

import java.util.Arrays;
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
		
		Auto[] listaAutos = new Auto[2];

		Auto auto1 = new Auto();
		auto1.getMarca();
		auto1.getModelo();
		auto1.getPlaca();
		auto1.getAñoFabricacion();
		auto1.getKilometraje();
		
		Auto auto2 = new Auto();
		auto2.getMarca();
		auto2.getModelo();
		auto2.getPlaca();
		auto2.getAñoFabricacion();
		auto2.getKilometraje();
		
		listaAutos [0]=auto1;
		listaAutos [1]=auto2;
		
		
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
					System.out.println("Ingrese el codigo Nacional: ");
					String codigo = teclado.nextLine();	
					System.out.println("Ingrese la Marca: ");
					String marca = teclado.nextLine();
					System.out.println("Ingrese Modelo: ");
					String modelo = teclado.nextLine();
					System.out.println("Ingrese Kilometraje: ");
					int kilo = teclado.nextInt();
					System.out.println("Ingrese Año de Fabricacion: ");
					int anhio1 = teclado.nextInt();
					System.out.println("Ingrese la Placa: ");
					String placa1 = teclado.nextLine();
					break;
				}
			}while (!opcion.equals("b")); 
				System.out.println("Ingrese el codigo de importacion: ");
				String codigo = teclado.nextLine();
				System.out.println("Ingrese el valor de importacion: ");
				int valor = teclado.nextInt();
				System.out.println("Ingrese la Marca: ");
				String marca = teclado.nextLine();
				System.out.println("Ingrese Modelo: ");
				String modelo = teclado.nextLine();
				System.out.println("Ingrese Año de Fabricacion: ");
				int anhio = teclado.nextInt();
				System.out.println("Ingrese la Placa: ");
				String placa = teclado.nextLine();
				System.out.println("Ingrese Kilometraje: ");
				int kilo1 = teclado.nextInt();
			break;
			case "2":
				do {
				System.out.println("Ingresar el numero de placa del Auto");
				String placaA = teclado.nextLine();
					opcion = teclado.nextLine();
				}while (!opcion.equals("c")); 
			case "3": 
				System.out.println("Ingrese el numero de Placa del Auto");
				String placaAA = teclado.nextLine();	
				break;
				default:
					System.out.println("No ha elejido ninguna opcion valida");
				break;
				case "4"://reporte
					Arrays.sort(listaAutos);
					System.out.println("Lista de Autos");
					System.out.println(Arrays.toString(listaAutos));
					break;
			}

		} while (!opcion.equals("3"));// similar a opcion!=3
		System.out.println("Gracias por preferirnos");


	}

}
