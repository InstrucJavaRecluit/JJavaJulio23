package common;

import java.util.ArrayList;
import java.util.List;

public class Automovil {

	String color;
	String marca;
	String modelo;
	int costo;
	
	public Automovil(String color, String marca, String modelo, int costo) {
		super();
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.costo = costo;
	}
	
	
	List<String> velocidades = new ArrayList<String>();
	int velocidad = 0;
	boolean encendido = false;
	
	public Automovil() {
		velocidades.add("velocidad 0 - 00 km/h");
		velocidades.add("velocidad 1 - 10 km/h");
		velocidades.add("velocidad 2 - 20 km/h");
		velocidades.add("velocidad 3 - 40 km/h");
		velocidades.add("velocidad 4 - 60 km/h");
		velocidades.add("velocidad 5 - 80km/h");
		velocidades.add("reversa");
		
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
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}



	@Override
	public String toString() {
		return "Automovil [color=" + color + ", marca=" + marca + ", modelo=" + modelo + ", costo=" + costo + "]";
	}
	
	
	public void encender() {
		System.out.println("encendido.... ");
		encendido = true;
	}
	
	
	public void acelerar() {
		velocidad++;
		System.out.println("acelerando " + velocidades.get(velocidad));
	}
	
	public void frenar() {
		System.out.println("frenando..... " + velocidades.get(0));
		velocidad = 0;
	}
	
	public void reversa() {
		velocidad = 0;
		System.out.println("acelerando " + velocidades.get(6));
	}
	
}
