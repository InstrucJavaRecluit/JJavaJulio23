package common;

public class Pantalla {

	double tama�o;
	String tecnologia;
	double resolucion;
    
	public Pantalla() {
		
	}

	public Pantalla(double tama�o, String tecnologia, double resolucion) {
		super();
		this.tama�o = tama�o;
		this.tecnologia = tecnologia;
		this.resolucion = resolucion;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
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