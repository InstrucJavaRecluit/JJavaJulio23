package common;

public class Pantalla {

	double tama�o;
	String tecnologia;
	String resolucion; 
	int ppi;
	
	public Pantalla() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pantalla(double tama�o, String tecnologia, String resolucion, int ppi) {
		super();
		this.tama�o = tama�o;
		this.tecnologia = tecnologia;
		this.resolucion = resolucion;
		this.ppi = ppi;
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
		return "Pantalla [tama�o=" + tama�o + ", tecnologia=" + tecnologia + ", resolucion=" + resolucion + ", ppi="
				+ ppi + "]";
	}
	
	
	
	
}
