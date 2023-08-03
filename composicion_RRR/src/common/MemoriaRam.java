package common;

public class MemoriaRam {
	int tama�o;
	String tipo;
	double frecuencia;
	
	public MemoriaRam() {
		
	}

	public MemoriaRam(int tama�o, String tipo, double frecuencia) {
		super();
		this.tama�o = tama�o;
		this.tipo = tipo;
		this.frecuencia = frecuencia;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
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
