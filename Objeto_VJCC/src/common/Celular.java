package common;

import java.util.ArrayList;
import java.util.List;

public class Celular {

	String color;
	String marca;
	String compa�ia;
	int almacenamiento;
	int ram;
	
	List<String> mensajes = new ArrayList<String>();
	int mensajesActual = 0;
	
	public Celular() {
		mensajes.add("mensajes 1");
		mensajes.add("mensajes 2");
		mensajes.add("mensajes 3");
		mensajes.add("mensajes 4");
		mensajes.add("mensajes 5");
		mensajes.add("mensajes 6");
		mensajes.add("mensajes 7");
		mensajes.add("mensajes 8");
		mensajes.add("mensajes 9");
	}

	public Celular(String color, String marca, String compa�ia, int almacenamiento, int ram) {
		this.color = color;
		this.marca = marca;
		this.compa�ia = compa�ia;
		this.almacenamiento = almacenamiento;
		this.ram = ram;

	}
	
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public List<String> getMensajes() {
		return mensajes;
	}

	public void setMensajes(List<String> mensajes) {
		this.mensajes = mensajes;
	}

	
	
	@Override
	public String toString() {
		return "Celular [color=" + color + ", marca=" + marca + ", compa�ia=" + compa�ia + ", almacenamiento="
				+ almacenamiento + ", ram=" + ram + ", mensajes=" + mensajes + ", mensajesActual=" + mensajesActual
				+ "]";
	}

	
	public void Llamada() {
		System.out.println("En llamada...");
	}
	
	public void SiguienteMensaje() {
		mensajesActual++;
		System.out.println("Viendo el: " + mensajes.get(mensajesActual));
	}
	
	
	
}
