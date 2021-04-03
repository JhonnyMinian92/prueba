package prueba;

public class Pedidos {

	class Pedido {

		int numero;
		
		public Pedido() {
		}
		
		public Pedido(int numero) {
			this.numero = numero;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}
		
	}
	
	class LineaDetalle {

		int numero;
		int cantidad;
		
		public LineaDetalle() {
		}
		
		public LineaDetalle(int numero, int cantidad) {
			this.cantidad = cantidad;
			this.numero = numero;
		}

		public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

		public int getCantidad() {
			return cantidad;
		}

		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		
	}
	
	public void pedir(int tipo, int numpedido, int numlinea, int numcant, int numpro, String des, Double precio, String ensam, Double version) {

		Cliente client = new Cliente();
		client.Nuevo("", "", "");
		
		ProductoHardware har;
		ProductoSoftware sof;
		
		Pedido pe = new Pedido();
		pe.setNumero(numpedido);
		
		LineaDetalle lin = new LineaDetalle();
		lin.setNumero(numlinea);
		lin.setCantidad(numcant);
		
		if(tipo == 1) {
			har = new ProductoHardware();
			har.setNumero(numpro);
			har.setDescripcion(des);
			har.setPrecio_unitario(precio);
			har.setEnsamblaje(ensam);
		}
		else {
			sof = new ProductoSoftware();
			sof.setNumero(numpro);
			sof.setDescripcion(des);
			sof.setPrecio_unitario(precio);
			sof.setVersion(version);
		}

	}
	
	public static void main(String[] args) {
		
	}

}
