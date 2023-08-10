package common;

public class Persona {
	String nombre;
	int edad;
	String domicilio;
	String ocupacion;
	
	public Persona() {
		
	}

	public Persona(String nombre, int edad, String domicilio, String ocupacion) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.domicilio = domicilio;
		this.ocupacion = ocupacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", domicilio=" + domicilio + ", ocupacion=" + ocupacion
				+ "]";
	}
		public void imprimeMensaje() {
			System.out.println("Primer mensaje");
		}
}
