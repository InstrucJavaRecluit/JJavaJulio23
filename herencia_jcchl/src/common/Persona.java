package common;

public final class Persona{

	String nombre;
	String fechaNacimiento;
	char genero;
	public static final int MAXIMO_TIEMPO_VIDA = 120;
	
	public static int getMaximoTiempoVida() {
		return MAXIMO_TIEMPO_VIDA;
	}

	public Persona() {}
	
	public Persona(String nombre, String fechaNacimiento, char genero) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero +"]" ; 
	}
	

	public void leer() {
		System.out.println("Leyendo de izquierda a derecha");
	}
	
	
	
	
	
}
