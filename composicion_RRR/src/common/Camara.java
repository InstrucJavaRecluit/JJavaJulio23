package common;

public class Camara {
    
	int resolucion;
	int megapixeles;
	
	public Camara() {
		
	}

	public Camara(int resolucion, int megapixeles) {
		super();
		this.resolucion = resolucion;
		this.megapixeles = megapixeles;
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public int getMegapixeles() {
		return megapixeles;
	}

	public void setMegapixeles(int megapixeles) {
		this.megapixeles = megapixeles;
	}

}