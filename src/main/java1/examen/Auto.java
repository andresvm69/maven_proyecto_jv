package examen;

public class Auto {
	public String marca;
	public String modelo;
	public int a�oFabricacion;
	public String placa;
	public int kilometraje;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getA�oFabricacion() {
		return a�oFabricacion;
	}
	public void setA�oFabricacion(int a�oFabricacion) {
		this.a�oFabricacion = a�oFabricacion;
	}
	public String getPlaca() {
		return marca;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getKilometraje() {
		return kilometraje;
	}
	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}	
	
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", a�oFabricacion=" + a�oFabricacion + ", placa=" + placa
				+ ", kilometraje=" + kilometraje + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getA�oFabricacion()=" + getA�oFabricacion() + ", getPlaca()=" + getPlaca() + ", getKilometraje()="
				+ getKilometraje() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


}
