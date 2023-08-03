package common;

public class Empleado extends Persona{
	
	String genero;
	int NSS;
	
	public Empleado() {
		
	}

	public Empleado(String genero, int nSS) {
		super();
		this.genero = genero;
		NSS = nSS;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getNSS() {
		return NSS;
	}

	public void setNSS(int nSS) {
		NSS = nSS;
	}
	
	@Override
	public String toString() {
		return "Empleado [genero=" + genero + ", NSS=" + NSS + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad
				+ ", edad=" + edad + "]";
	}

	//Metodo heredado de la clase Persona
	@Override
	public String Persona1(String persona) {
		System.out.println("Mensaje heredado de la clase Persona");
		return persona;
	}
	
	//Merodo nativo creado en esta clase Empleado
	public String Empleado1(String empleado) {
		System.out.println("Mensaje nativo de la clase Empleado ");
		return empleado;
	}
	

}
