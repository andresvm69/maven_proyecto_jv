package ejercicios.deber.ordenamiento;

import ejercicios.ordenamiento.Estudiante;

public class Paciente Comparable<Paciente>{

	public String nombre;
	public String apellido;
	public int edad;
	public String sintoma;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSintoma() {
		return sintoma;
	}
	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
		
	}
	
	public int compareTo(Paciente o) {
		// TODO Auto-generated method stub
		//3 posibles retornos
		//0
		//-1
		//1
		if(this.edad> o.getEdad()) {
			return 1;
		}else if(this.edad== o.getEdad()) {
			return 0;
		}else {
			return-1;
		}	
	}
	//toString para que sea legible ya quye antes sin esto no se podia entender

	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", apellido=" + apellido + ", edad =" + edad + ", sintoma="
				+ sintoma + "]";
	}


}
