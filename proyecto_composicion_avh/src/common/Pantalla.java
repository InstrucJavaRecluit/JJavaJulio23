package common;

public class Pantalla {
	double tama�o;
	String resolucion;
	
	
	public Pantalla() {
		
	}


	public Pantalla(double tama�o, String resolucion) {
	
		this.tama�o = tama�o;
		this.resolucion = resolucion;
	}


	public double getTama�o() {
		return tama�o;
	}


	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}


	public String getResolucion() {
		return resolucion;
	}


	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}


	@Override
	public String toString() {
		return "Pantalla [tama�o=" + tama�o + ", resolucion=" + resolucion + "]";
	}
	
	
	
}
