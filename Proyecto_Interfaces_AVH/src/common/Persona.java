package common;

public class Persona {

	String nombre;
	String genero;
	String curp;
	
	public Persona() {
		
	}

	public Persona(String nombre, String genero, String curp) {
		
		this.nombre = nombre;
		this.genero = genero;
		this.curp = curp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", curp=" + curp + "]";
	}
	
	
	
}
