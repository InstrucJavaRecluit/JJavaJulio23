package common;

public class Almacenamiento {
    
	String tipo;
	double tama�o;
	String fabricante;
	
	public Almacenamiento() {
		
	}

	public Almacenamiento(String tipo, double tama�o, String fabricante) {
		super();
		this.tipo = tipo;
		this.tama�o = tama�o;
		this.fabricante = fabricante;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
}
	

