package prueba;

public class ProductoHardware extends Producto {
	
	String ensamblaje;
	
	public ProductoHardware() {
	}
	
	public ProductoHardware(String ensamblaje) {
		this.ensamblaje = ensamblaje;
	}
	
	public String getEnsamblaje() {
		return ensamblaje;
	}

	public void setEnsamblaje(String ensamblaje) {
		this.ensamblaje = ensamblaje;
	}
	
}
