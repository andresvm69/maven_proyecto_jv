package ejercicios.proyecto;

public class Libro extends Main implements Comparable<Libro> {

	
		public String codigo;
		public String nombre;
		public String autor;
		public int anhio;
		public String estado;
		public int fechaDeEntrega;
		public String editorial;
		public int cantidadDePaginas;
		public int precio;
		
//		Metodos SET Y GET
		
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		public String getNombre() {
			return nombre;
		}
		public int getCantidadDePaginas() {
			return cantidadDePaginas;
		}
		public void setCantidadDePaginas(int cantidadDePaginas) {
			this.cantidadDePaginas = cantidadDePaginas;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getAutor() {
			return autor;
		}
		public void setAutor(String autor) {
			this.autor = autor;
		}	
		public String getEditorial() {
			return editorial;
		}
		public void setEditorial(String editorial) {
			editorial = editorial;
		}
		
		public int getAño() {
			return anhio;
		}
		public void setAño(int anhio) {
			this.anhio = anhio;
		}
		public String getEstado() {
			return estado;
		}
		public void setEstado(String estado) {
			this.estado = estado;
		}
		public int getFechaDeEntrega() {
			return fechaDeEntrega;
		}
		public void setFechaDeEntrega(int fechaDeEntrega) {
			this.fechaDeEntrega = fechaDeEntrega;
		}
		public int getPrecio() {
			return precio;
		}
		public void setPrecio(int precio) {
			this.precio = precio;
		}
		
		public int compareTo(Libro o) {
			if (this.estado < o.getEstado()) {
				return 1;

			} else if (this.estado == o.getEstado()) {
				return 0;

			} else {
				return -1;

			}
	

}
