package common;

import java.util.List;
import java.util.ArrayList;

public class Audifonos {

	String color;
	String marca;
	String tipo;
	String forma;
	String expFrecuencias;
	int cantidadBotones;
	
	 List<String> canciones = new ArrayList<String>();
	 int numCancion = 0;
	
	
	
	
	public Audifonos() {
		
		canciones.add("cancion 1");
		canciones.add("cancion 2");
		canciones.add("cancion 3");
		canciones.add("cancion 4");
		canciones.add("cancion 5");
		canciones.add("cancion 6");
		canciones.add("cancion 7");
	}



	public Audifonos(String color, String marca, String tipo, String forma, String expFrecuencias,
			int cantidadBotones) {
		
		this.color = color;
		this.marca = marca;
		this.tipo = tipo;
		this.forma = forma;
		this.expFrecuencias = expFrecuencias;
		this.cantidadBotones = cantidadBotones;
	}


	public List<String> getCanciones() {
		return canciones;
	}



	public void setCanciones(List<String> canciones) {
		this.canciones = canciones;
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



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getForma() {
		return forma;
	}



	public void setForma(String forma) {
		this.forma = forma;
	}



	public String getExpFrecuencias() {
		return expFrecuencias;
	}



	public void setExpFrecuencias(String expFrecuencias) {
		this.expFrecuencias = expFrecuencias;
	}



	public int getCantidadBotones() {
		return cantidadBotones;
	}



	public void setCantidadBotones(int cantidadBotones) {
		this.cantidadBotones = cantidadBotones;
	}



	

	@Override
	public String toString() {
		return "Audifonos [color=" + color + ", marca=" + marca + ", tipo=" + tipo + ", forma=" + forma
				+ ", expFrecuencias=" + expFrecuencias + ", cantidadBotones=" + cantidadBotones + ", canciones="
				+ canciones + "]";
	}



	public void reproducirSonido() {
		System.out.println("reproduciedo....");
	}
	
	public void siguienteCancion() {
		numCancion++;
		System.out.println(canciones.get(numCancion));
	}
	
}
