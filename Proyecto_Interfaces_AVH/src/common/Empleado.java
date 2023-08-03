package common;

public class Empleado extends Persona{

	String rfc;
	String email;
	int telefono;
	
	public Empleado() {
		
	}

	public Empleado(String nombre, String genero, String curp, String rfc, String email, int telefono) {
		super(nombre, genero, curp);
		this.rfc = rfc;
		this.email = email;
		this.telefono = telefono;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Empleado [rfc=" + rfc + ", email=" + email + ", telefono=" + telefono + ", nombre=" + nombre
				+ ", genero=" + genero + ", curp=" + curp + "]";
	}
		
	
}
