package common;

public class Camara {
	
	String frontal;
	String trasera;
	String modoDeDisparo;
	
	public Camara() {
		
	}

	public Camara(String frontal, String trasera, String modoDeDisparo) {
		super();
		this.frontal = frontal;
		this.trasera = trasera;
		this.modoDeDisparo = modoDeDisparo;
	}

	public String getFrontal() {
		return frontal;
	}

	public void setFrontal(String frontal) {
		this.frontal = frontal;
	}

	public String getTrasera() {
		return trasera;
	}

	public void setTrasera(String trasera) {
		this.trasera = trasera;
	}

	public String getModoDeDisparo() {
		return modoDeDisparo;
	}

	public void setModoDeDisparo(String modoDeDisparo) {
		this.modoDeDisparo = modoDeDisparo;
	}

	@Override
	public String toString() {
		return "Camara [frontal=" + frontal + ", trasera=" + trasera + ", modoDeDisparo=" + modoDeDisparo + "]";
	}
	
	

}
