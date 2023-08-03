package common;

public final class Persona {

	String nombre;
	int edad;
	public static final int MAXIMO_TIEMPO_VIDA = 120; //ES UNA CONSTANTE QUE NO CAMBIA SU VALOR
	
	
	public static int getMaximoTiempoVida() {
		return MAXIMO_TIEMPO_VIDA;
	}

	public Persona() {
		
	}

	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
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

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	public void Imprimir() {
		System.out.println("Imprimir");
	
	}
	public void ImprimeAlgo(String mensaje) {
		System.out.println(mensaje);
		
	}
	public final void leer() {
		System.out.println("leyendo de izquierda a derecha");
	}
	
}
