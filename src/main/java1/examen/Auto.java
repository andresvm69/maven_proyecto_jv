package examen;

public class Auto {
	public String marca;
	public String modelo;
	public int aņoFabricacion;
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
	public int getAņoFabricacion() {
		return aņoFabricacion;
	}
	public void setAņoFabricacion(int aņoFabricacion) {
		this.aņoFabricacion = aņoFabricacion;
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
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", aņoFabricacion=" + aņoFabricacion + ", placa=" + placa
				+ ", kilometraje=" + kilometraje + ", getMarca()=" + getMarca() + ", getModelo()=" + getModelo()
				+ ", getAņoFabricacion()=" + getAņoFabricacion() + ", getPlaca()=" + getPlaca() + ", getKilometraje()="
				+ getKilometraje() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


}
