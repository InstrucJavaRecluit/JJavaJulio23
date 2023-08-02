package common;

public class Celular {
	String marca;
	String modelo;
	String compa�ia;
	String pixelesCamara;
	
	//Atributos objeto
	
	Almacenamiento alm;
	MemoriaRAM ram;
	Pantalla pantalla;
	
	public Celular() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Celular(String marca, String modelo, String compa�ia, String pixelesCamara, Almacenamiento alm,
			MemoriaRAM ram, Pantalla pantalla) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.compa�ia = compa�ia;
		this.pixelesCamara = pixelesCamara;
		this.alm = alm;
		this.ram = ram;
		this.pantalla = pantalla;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", modelo=" + modelo + ", compa�ia=" + compa�ia + ", pixelesCamara="
				+ pixelesCamara + ", alm=" + alm + ", ram=" + ram + ", pantalla=" + pantalla + "]";
	}
	
	
	
}
