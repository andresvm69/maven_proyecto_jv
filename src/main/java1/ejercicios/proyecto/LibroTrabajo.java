package ejercicios.proyecto;

public class LibroTrabajo extends Libro{

		public String codigoAutorizacion;
		

		public String getCodigoAutorizacion() {
			return codigoAutorizacion;
		}

		public void setCodigoAutorizacion(String codigoAutorizacion) {
			this.codigoAutorizacion = codigoAutorizacion;
		}		
		public String toString() {
			return "Nombre: " + nombre + " - Autor: " + autor + " - A�o " + anhio + " - Estado " + estado + " - Fecha Entrega "+ fechaDeEntrega ;
		}
}
 