package common;

public class Procesador {

	String fabricante;
	String modelo;
	
	
	public Procesador() {
		
	}

	
	public Procesador(String fabricante, String modelo) {
		this.fabricante = fabricante;
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	@Override
	public String toString() {
		return "Procesador [fabricante=" + fabricante + ", modelo=" + modelo + "]";
	}
	
	
	
	
}
