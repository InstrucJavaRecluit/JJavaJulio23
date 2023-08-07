package common;

public class Almacenamiento {
	String tipo;
	double tama�o;
	
	
	public Almacenamiento() {
		
	}


	public Almacenamiento(String tipo, double tama�o) {
		
		this.tipo = tipo;
		this.tama�o = tama�o;
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


	@Override
	public String toString() {
		return "Almacenamiento [tipo=" + tipo + ", tama�o=" + tama�o + "]";
	}
	
	
	
}
