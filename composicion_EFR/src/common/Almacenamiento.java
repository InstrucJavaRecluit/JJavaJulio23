package common;

public class Almacenamiento {
	
	double tamaño;
	String fabricante;
	
	public Almacenamiento() {
		
	}

	public Almacenamiento(double tamaño, String fabricante) {
		super();
		this.tamaño = tamaño;
		this.fabricante = fabricante;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Almacenamiento [tamaño=" + tamaño + ", fabricante=" + fabricante + "]";
	}
	

}
