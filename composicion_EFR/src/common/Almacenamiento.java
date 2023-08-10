package common;

public class Almacenamiento {
	
	double tama�o;
	String fabricante;
	
	public Almacenamiento() {
		
	}

	public Almacenamiento(double tama�o, String fabricante) {
		super();
		this.tama�o = tama�o;
		this.fabricante = fabricante;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Almacenamiento [tama�o=" + tama�o + ", fabricante=" + fabricante + "]";
	}
	

}
