package common;

public class Pantalla {
	double tamaño;
	String resolucion;
	
	
	public Pantalla() {
		
	}


	public Pantalla(double tamaño, String resolucion) {
	
		this.tamaño = tamaño;
		this.resolucion = resolucion;
	}


	public double getTamaño() {
		return tamaño;
	}


	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}


	public String getResolucion() {
		return resolucion;
	}


	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}


	@Override
	public String toString() {
		return "Pantalla [tamaño=" + tamaño + ", resolucion=" + resolucion + "]";
	}
	
	
	
}
