package common;

public class Celular {
 
	String marca;
	String modelo;
	
	Almacenamiento alm;
	Pantalla pantalla;
	Camara camara;
	MemoriaRam ram;
	
	public Celular() {
		
	}

	public Celular(String marca, String modelo, Almacenamiento alm, Pantalla pantalla, Camara camara, MemoriaRam ram) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.alm = alm;
		this.pantalla = pantalla;
		this.camara = camara;
		this.ram = ram;
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

	public Almacenamiento getAlm() {
		return alm;
	}

	public void setAlm(Almacenamiento alm) {
		this.alm = alm;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public Camara getCamara() {
		return camara;
	}

	public void setCamara(Camara camara) {
		this.camara = camara;
	}

	public MemoriaRam getRam() {
		return ram;
	}

	public void setRam(MemoriaRam ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", alm=" + alm + ", pantalla=" + pantalla
				+ ", camara=" + camara + ", ram=" + ram + "]";
	}
	
}
