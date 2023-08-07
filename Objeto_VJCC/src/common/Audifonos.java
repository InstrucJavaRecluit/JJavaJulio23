package common;

import java.util.ArrayList;
import java.util.List;

public class Audifonos {
	//Color
	//Marca
	//Tipo
	//Forma
	//Frecuencias
	
	String color;
	String marca;
	String tipo;
	String forma;
	String frecuencia;
	int cantidadBotones; //notacion calme Case
	
	List<String> canciones = new ArrayList<String>();
	int cancionActual = 0;
	
	//Metodo constructor vacion
	//Simpre lleva el nombre de la clase
	public Audifonos() {
		canciones.add("Cancion 1");
		canciones.add("Cancion 2");
		canciones.add("Cancion 3");
		canciones.add("Cancion 4");
		canciones.add("Cancion 5");
		canciones.add("Cancion 6");
		canciones.add("Cancion 7");
		canciones.add("Cancion 8");
		canciones.add("Cancion 9");
	}
	

	public Audifonos(String color, String marca, String tipo, String forma, String frecuencia, int cantidadBotones) {
		this.color = color;
		this.marca = marca;
		this.tipo = tipo;
		this.forma = forma;
		this.frecuencia = frecuencia;
		this.cantidadBotones = cantidadBotones;
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

	public String getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
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
				+ ", frecuencia=" + frecuencia + ", cantidadBotones=" + cantidadBotones +", canciones= "+canciones+", cancionActual = "+cancionActual+"]";
	}
	
	
	
	public List<String> getCanciones() {
		return canciones;
	}

	public void setCanciones(List<String> canciones) {
		this.canciones = canciones;
	}

	

	public void reproducirSonido() {
		System.out.println("Repoduciendo...");
	}
	
	public void SiguienteCancion() {
		cancionActual++;
		System.out.println("Repoduciendo..." + canciones.get(cancionActual));
	}
	
	public void contestarLlamada() {
		System.out.println("Llamada ok...");
	}
	
}
