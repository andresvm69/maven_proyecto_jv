package ejercicios.proyecto;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

import ejercicios.colecion.Poliza;

public class Main {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Scanner lector = new Scanner(System.in);
		String opcion;
		String op;
		String autor;
		int reserva =0;
		Libro sistema[] = new Libro[10];
		do {
			System.out.println("**************BIBLIOTECA UCE**************");
			System.out.println("Escoja opcion: ");
			System.out.println("1. Estudiantes");
			System.out.println("2. Bibliotecario");
			System.out.println("3. SALIR");
			opcion = teclado.nextLine();
			
			switch(opcion){
			case "1": 
			do {
				System.out.println("a. Consultarlibros ");
				System.out.println("b. Reservar libro");
				opcion = teclado.nextLine();
				switch(opcion){
				case"a":
					System.out.println("Ingrese el nombre/o autor del libro: ");
					autor = teclado.nextLine();
					break;
				}
			}while (!opcion.equals("b")); 
				System.out.println("Ingrese el codigo del libro a reservar ");
				String codigo = teclado.nextLine();	
				
				System.out.println("Ingrese la cedula del estudiante ");
				int cedula = teclado.nextInt();
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
						System.out.println("Ingrese Precio: ");
						int precio = teclado.nextInt();
						System.out.println("Ingrese Cantidad de paginas: ");
						int Cantidad = teclado.nextInt();
						System.out.println("Ingrese Editorial: ");
						String Editorial = teclado.nextLine();
						for(int i = 0 ; i < reserva ; i++) {
							Libro datos = new Libro();
							datos.setNombre(nombre);
							datos.setAutor(autor1);
							datos.setAño(anhio);
							datos.setEditorial(Editorial);
							datos.setCantidadDePaginas(Cantidad);
							datos.setPrecio(precio);
							sistema[i] = datos;
							
							reserva = reserva + 1;

						}
						do {
							System.out.println("1. Libro de trabajo ");
							System.out.println("2. Libro lectura ");
							opcion = teclado.nextLine();
							switch(opcion){
							case"1":
								System.out.println("Ingrese el nombre/o autor del libro: ");
								autor = teclado.nextLine();
								break;
							}
						}while(!opcion.equals("2")); 
							System.out.println("Ingrese el codigo de autorizacion: ");
							String codigoAut = teclado.nextLine();	
							
							System.out.println("Ingrese el tiempo aproximado de lectura (minutos) ");
							int tiempo = teclado.nextInt();
						break;
					case"b":
						System.out.println("Ingrese el codigo del libro: ");
						String codigoL = teclado.nextLine();
						for (int i = 0; i <= sistema.length; i++) {
							Libro libro = sistema[i];
							boolean reservado = libro.getCodigo().contains(codigoL);
							if (reservado == true) {
								do {
									System.out.println("1. Aplaza ");
									System.out.println("2. No Aplazar ");
									opcion = teclado.nextLine();
									switch(opcion){
									case"1":
										System.out.println("Aplazar libro");
										LocalDate diaHoy=LocalDate.now();
										LocalDate diaFin=diaHoy.plusDays(5);	
										
										break;
									}
								}while(!opcion.equals("2")); 
									System.out.println("No se puede Aplazar");
								
							} else {
								System.out.println("No se ha encontrado el libro");
							}
						}
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
	
