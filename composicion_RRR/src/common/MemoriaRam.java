package common;

public class MemoriaRam {
	int tamaño;
	String tipo;
	double frecuencia;
	
	public MemoriaRam() {
		
	}

	public MemoriaRam(int tamaño, String tipo, double frecuencia) {
		super();
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.frecuencia = frecuencia;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}
	
}
