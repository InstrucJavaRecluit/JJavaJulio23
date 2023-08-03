package common;

public class Empleado extends Persona{
	
	String rfc;
	String nombre;
	String puesto;
	
	public Empleado() {}

	public Empleado(String rfc, String nombre, String puesto) {
		super();
		this.rfc = rfc;
		this.nombre = nombre;
		this.puesto = puesto;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	public String toString() {
		return "Empleado [rfc=" + rfc + ", nombre=" + nombre + ", puesto=" + puesto +  "]";
	}

}


