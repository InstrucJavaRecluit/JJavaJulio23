package common;

public final class Persona {

	String nombre;
	int edad;
	String Sexo;
	
	public static final int MAXIMO_TIEMPO_VIDA = 120; //ES UNA CONSTANTE QUE NO CAMBIA
	
	
	public static int getMaximoTiempoVida() {
		return MAXIMO_TIEMPO_VIDA;
	}

	
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
	
	
	public final void leer() {
		System.out.println("leyendo de izquierda a derecha");
	}
	
	
}
