package common;

public class Pantalla {

	double tamaño;
	String tecnologia;
	String resolucion; 
	int ppi;
	
	public Pantalla() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pantalla(double tamaño, String tecnologia, String resolucion, int ppi) {
		super();
		this.tamaño = tamaño;
		this.tecnologia = tecnologia;
		this.resolucion = resolucion;
		this.ppi = ppi;
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
		return "Pantalla [tamaño=" + tamaño + ", tecnologia=" + tecnologia + ", resolucion=" + resolucion + ", ppi="
				+ ppi + "]";
	}
	
	
	
	
}
