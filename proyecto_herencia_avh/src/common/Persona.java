package common;

public class Persona {
	
	
	String nombre;
	int años;
	String curp;
	
	public Persona() {
		
	}

	public Persona(String nombre, int años, String curp) {
		
		this.nombre = nombre;
		this.años = años;
		this.curp = curp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAños() {
		return años;
	}

	public void setAños(int años) {
		this.años = años;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", años=" + años + ", curp=" + curp + "]";
	}
	
	public void saludar() {
		System.out.println("Hola mundo...");
	}
	
}
