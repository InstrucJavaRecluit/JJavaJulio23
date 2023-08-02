package common;

public class Celular {
	
	String marca;
	String modelo;
	String color;
	
	//Atributos del objeto
	Camara cam;
	Almacenamiento alm;
	Chips cp;
	
	public Celular() {
		
	}

	public Celular(String marca, String modelo, String color, Camara cam, Almacenamiento alm, Chips cp) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.cam = cam;
		this.alm = alm;
		this.cp = cp;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Camara getCam() {
		return cam;
	}

	public void setCam(Camara cam) {
		this.cam = cam;
	}

	public Almacenamiento getAlm() {
		return alm;
	}

	public void setAlm(Almacenamiento alm) {
		this.alm = alm;
	}

	public Chips getCp() {
		return cp;
	}

	public void setCp(Chips cp) {
		this.cp = cp;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", cam=" + cam + ", alm=" + alm
				+ ", cp=" + cp + "]";
	}
	
	
	
	

}
