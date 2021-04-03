package prueba;

public class ProductoSoftware extends Producto {

	Double version;
	
	public ProductoSoftware() {
	}
	
	public ProductoSoftware(Double version) {
		this.version = version;
	}

	public Double getVersion() {
		return version;
	}

	public void setVersion(Double version) {
		this.version = version;
	}	
		
}