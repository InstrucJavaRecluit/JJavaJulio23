package common;

public class MemoriaRAM {
	int tamaño;
	String tipo;
	
	
	public MemoriaRAM() {
		
	}


	public MemoriaRAM(int tamaño, String tipo) {
		super();
		this.tamaño = tamaño;
		this.tipo = tipo;
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


	@Override
	public String toString() {
		return "MemoriaRAM [tamaño=" + tamaño + ", tipo=" + tipo + "]";
	}
	
	
	
	
}
