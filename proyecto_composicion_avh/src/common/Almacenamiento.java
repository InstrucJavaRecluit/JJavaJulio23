package common;

public class Almacenamiento {
	String tipo;
	double tamaño;
	
	
	public Almacenamiento() {
		
	}


	public Almacenamiento(String tipo, double tamaño) {
		
		this.tipo = tipo;
		this.tamaño = tamaño;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getTamaño() {
		return tamaño;
	}


	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}


	@Override
	public String toString() {
		return "Almacenamiento [tipo=" + tipo + ", tamaño=" + tamaño + "]";
	}
	
	
	
}
