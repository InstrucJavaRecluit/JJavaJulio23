package common;

public final class Persona {
	
	String nombre;
	int edad;
	String nacionalidad;
	public static final int MAXIMO_TIEMPO_VIDA = 120;// CONSTANTE - VALOR QUE YA NO VA A CAMBIAR, SE LE TIENE QUE DAR UN VALOR.
	
	
	public static int getMaximoTiempoVida() {
		return MAXIMO_TIEMPO_VIDA;
	}

	public Persona() {
		
	}

	public Persona(String nombre, int edad, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
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

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad + "]";
	}
	
	public final void leer() {
		System.out.println("Leyendo de izquierda a derecha");
	}

}
