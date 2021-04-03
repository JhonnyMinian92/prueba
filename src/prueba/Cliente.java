
package prueba;

public class Cliente {
	
	String nombre;
	String direccion;
	String idcliente;
	
	public Cliente() {}
	
	public Cliente(String nombre, String direccion, String idcliente) {	
		this.nombre = nombre;
		this.direccion = direccion;
		this.idcliente = idcliente;	
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(String idcliente) {
		this.idcliente = idcliente;
	}

	public Cliente Nuevo(String nombre, String direccion, String idcliente) {
		Cliente cli = new Cliente();
		setNombre(nombre);
		setDireccion(direccion);
		setIdcliente(idcliente);
		return cli;
	}
	
	public String Mostrar() {
		return "IdCliente = "+getIdcliente()+ "Nombre = "+getNombre()+" Direccion= "+getDireccion();
	} 
	
}