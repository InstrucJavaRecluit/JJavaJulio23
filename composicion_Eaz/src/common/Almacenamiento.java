package common;

public class Almacenamiento {
	String tipo;
	double tamaño;
	String fabricante;
	
	public Almacenamiento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Almacenamiento(String tipo, double tamaño, String fabricante) {
		super();
		this.tipo = tipo;
		this.tamaño = tamaño;
		this.fabricante = fabricante;
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

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Almacenamiento [tipo=" + tipo + ", tamaño=" + tamaño + ", fabricante=" + fabricante + "]";
	}
	
	
	
}
