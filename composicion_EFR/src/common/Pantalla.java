package common;

public class Pantalla {
	
	double tamaño;
	String resolucion;
	int ppi;
	
	public Pantalla() {
		
	}

	public Pantalla(double tamaño, String resolucion, int ppi) {
		super();
		this.tamaño = tamaño;
		this.resolucion = resolucion;
		this.ppi = ppi;
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

	public int getPpi() {
		return ppi;
	}

	public void setPpi(int ppi) {
		this.ppi = ppi;
	}

	@Override
	public String toString() {
		return "Pantalla [tamaño=" + tamaño + ", resolucion=" + resolucion + ", ppi=" + ppi + "]";
	}

}
