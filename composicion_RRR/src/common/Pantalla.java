package common;

public class Pantalla {

	double tamaño;
	String tecnologia;
	double resolucion;
    
	public Pantalla() {
		
	}

	public Pantalla(double tamaño, String tecnologia, double resolucion) {
		super();
		this.tamaño = tamaño;
		this.tecnologia = tecnologia;
		this.resolucion = resolucion;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public String getTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}

	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}
}