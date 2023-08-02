package common;

public class Persona {

	String nombre;
	int edad;
	String Sexo;
	
	public Persona() {
		
	}

	public Persona(String nombre, int edad, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		Sexo = sexo;
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

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", Sexo=" + Sexo + "]";
	}
	
	public void AlgoPersona() {
		System.out.println("Persona");
	}
	
	
}
