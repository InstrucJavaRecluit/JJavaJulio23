package common;

public class MemoriaRAM {
	int tama�o;
	String tipo;
	
	
	public MemoriaRAM() {
		
	}


	public MemoriaRAM(int tama�o, String tipo) {
		super();
		this.tama�o = tama�o;
		this.tipo = tipo;
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


	@Override
	public String toString() {
		return "MemoriaRAM [tama�o=" + tama�o + ", tipo=" + tipo + "]";
	}
	
	
	
	
}
