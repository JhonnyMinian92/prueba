package prueba;

public class Producto {

	int numero;
	String descripcion;
	Double precio_unitario;
	
	public Producto() {
	}
	
	public Producto(int numero, String descripcion, Double precio_unitario) {
		this.numero = numero;
		this.descripcion = descripcion;
		this.precio_unitario = precio_unitario;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(Double precio_unitario) {
		this.precio_unitario = precio_unitario;
	}
	
}