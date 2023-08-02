package common;

public class Celular {
	String marca;
	String modelo;
	String color;
	
	Almacenamiento alm;
	Pantalla pan;
	Camara cam;
	
	public Celular() {
		
	}

	public Celular(String marca, String modelo, String color, Almacenamiento alm, Pantalla pan, Camara cam) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.alm = alm;
		this.pan = pan;
		this.cam = cam;
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

	public Almacenamiento getAlm() {
		return alm;
	}

	public void setAlm(Almacenamiento alm) {
		this.alm = alm;
	}

	public Pantalla getPan() {
		return pan;
	}

	public void setPan(Pantalla pan) {
		this.pan = pan;
	}

	public Camara getCam() {
		return cam;
	}

	public void setCam(Camara cam) {
		this.cam = cam;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", alm=" + alm + ", pan=" + pan
				+ ", cam=" + cam + "]";
	}

	}
