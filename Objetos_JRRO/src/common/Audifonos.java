package common;

import java.util.ArrayList;
import java.util.List;
public class Audifonos {
	
	//QUE
	
	//COLOR
	//MARCA
	//TIPO
	//FORMA
	//EXPECTROfRECUENCIAS
	
	String color;
	String marca;
	String tipo;  // alambricos, inalambricos
	String forma;  // diadema, in-ear
	String expFrecuencias;  // 40hz - 1000 hz
	int cantidadBotones; 
	
	List<String> canciones = new ArrayList<String>();
	int cancionActual = 1;
	
	//Metodo constructor vacio (siempre lleva el nombre de la clase)
	public Audifonos() {
		canciones.add("cancion 1");
		canciones.add("cancion 2");
		canciones.add("cancion 3");
		canciones.add("cancion 4");
		canciones.add("cancion 5");
		canciones.add("cancion 6");
		canciones.add("cancion 7");
		canciones.add("cancion 8");
		canciones.add("cancion 9");
	}

	public List<String> getCanciones() {
		return canciones;
	}
	public void setCanciones(List<String> canciones) {
		this.canciones = canciones;
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

	
	//COMO
	// Metodos nativos
	// Metodos heredados (comunmente se sobreescriben)
	// Metodos implementados (traidos de interfaces)
	
	@Override
	public String toString() {
		return "Audifonos [color=" + color + ", marca=" + marca + ", tipo=" + tipo + ", forma=" + forma
				+ ", expFrecuencias=" + expFrecuencias + ", cantidadBotones=" + cantidadBotones + ", canciones="
				+ canciones + ", cancionActual=" + cancionActual + "]";
	}

	public void reproducirSonido() {
		System.out.println("Reproduciendo...");
	}
	
	public void siguienteCancion() {
		cancionActual++;
		System.out.println("Reproduciendo..." + canciones.get(cancionActual));
	}
	
	public void contestarLlamada() {
		System.out.println("Llamada ok...");
	}
	
	
	
	
	
	
	

}
