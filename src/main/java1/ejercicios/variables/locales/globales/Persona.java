package ejercicios.variables.locales.globales;

public class Persona{
	
	public String nombre;
	public int edad;
	public static String provincia="PICHINCHA";
	public static String canton="QUITO";
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public static String getProvincia() {
		return provincia;
	}
	public static void setProvincia(String provincia) {
		Persona.provincia = provincia;
	}
	public static String getCanton() {
		return canton;
	}
	public static void setCanton(String canton) {
		Persona.canton = canton;
	}

}
