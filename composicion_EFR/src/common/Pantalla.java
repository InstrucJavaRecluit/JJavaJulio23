package common;

public class Pantalla {
	
	double tama�o;
	String resolucion;
	int ppi;
	
	public Pantalla() {
		
	}

	public Pantalla(double tama�o, String resolucion, int ppi) {
		super();
		this.tama�o = tama�o;
		this.resolucion = resolucion;
		this.ppi = ppi;
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

	public int getPpi() {
		return ppi;
	}

	public void setPpi(int ppi) {
		this.ppi = ppi;
	}

	@Override
	public String toString() {
		return "Pantalla [tama�o=" + tama�o + ", resolucion=" + resolucion + ", ppi=" + ppi + "]";
	}

}
