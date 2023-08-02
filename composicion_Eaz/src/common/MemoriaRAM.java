package common;

public class MemoriaRAM {
	int tamaño ;
	String tipo;
	double frecuencia;
	double kvr; 
	String latencias;
	
	public MemoriaRAM() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MemoriaRAM(int tamaño, String tipo, double frecuencia, double kvr, String latencias) {
		super();
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.frecuencia = frecuencia;
		this.kvr = kvr;
		this.latencias = latencias;
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

	public double getKvr() {
		return kvr;
	}

	public void setKvr(double kvr) {
		this.kvr = kvr;
	}

	public String getLatencias() {
		return latencias;
	}

	public void setLatencias(String latencias) {
		this.latencias = latencias;
	}

	@Override
	public String toString() {
		return "MemoriaRAM [tamaño=" + tamaño + ", tipo=" + tipo + ", frecuencia=" + frecuencia + ", kvr=" + kvr
				+ ", latencias=" + latencias + "]";
	}
	
	
}
