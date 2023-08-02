package common;

public class Persona {
	String nombre;
	String apelldio;
	int edad;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Persona(String nombre, String apelldio, int edad) {
		super();
		this.nombre = nombre;
		this.apelldio = apelldio;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApelldio() {
		return apelldio;
	}
	public void setApelldio(String apelldio) {
		this.apelldio = apelldio;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apelldio=" + apelldio + ", edad=" + edad + "]";
	}
	
	public void ImprimeAlgo() {
		System.out.println("Imprime algo");
	
	}
}
