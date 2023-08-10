package common;

public class Celular {

	String marca;
	String modelo;
	String color;
	int costo;
	
	Almacenamiento alm;
	MemoriaRAM ram;
	Pantalla screen;
	
	public Celular() {
	
	}

	public Celular(String marca, String modelo, String color, int costo, Almacenamiento alm, MemoriaRAM ram,
			Pantalla screen) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.costo = costo;
		this.alm = alm;
		this.ram = ram;
		this.screen = screen;
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

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public Almacenamiento getAlm() {
		return alm;
	}

	public void setAlm(Almacenamiento alm) {
		this.alm = alm;
	}

	public MemoriaRAM getRam() {
		return ram;
	}

	public void setRam(MemoriaRAM ram) {
		this.ram = ram;
	}

	public Pantalla getScreen() {
		return screen;
	}

	public void setScreen(Pantalla screen) {
		this.screen = screen;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", costo=" + costo + ", alm="
				+ alm + ", ram=" + ram + ", screen=" + screen + "]";
	}
	
	
	
}
