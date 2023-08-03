package common;

public abstract class Persona {
	
	String nombre;
	String nacionalidad;
	int edad;
	
	public Persona() {
		
	}

	public Persona(String nombre, String nacionalidad, int edad) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Metodo abstracto
	public abstract String Persona1(String persona);

}
