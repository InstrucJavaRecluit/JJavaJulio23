package common;

public class Persona {
	
	
	String nombre;
	int a�os;
	String curp;
	
	public Persona() {
		
	}

	public Persona(String nombre, int a�os, String curp) {
		
		this.nombre = nombre;
		this.a�os = a�os;
		this.curp = curp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getA�os() {
		return a�os;
	}

	public void setA�os(int a�os) {
		this.a�os = a�os;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", a�os=" + a�os + ", curp=" + curp + "]";
	}
	
	public void saludar() {
		System.out.println("Hola mundo...");
	}
	
}
