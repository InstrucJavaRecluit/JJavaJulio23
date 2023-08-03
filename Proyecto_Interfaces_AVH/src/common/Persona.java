package common;

public class Persona {

	String nombre;
	String genero;
	String curp;
	
	
	public static final int MAXIMO_TIEMPO_VIDA = 120;
	
	public Persona() {
		
	}

	public Persona(String nombre, String genero, String curp) {
		
		this.nombre = nombre;
		this.genero = genero;
		this.curp = curp;
	}

	
	
	public static int getMaximoTiempoVida() {
		return MAXIMO_TIEMPO_VIDA;
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
	
	public final void leer() {
		System.out.println("leyendo de izquierda a derecha");
	}
	
}
