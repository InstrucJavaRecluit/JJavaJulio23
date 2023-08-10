package common;

import java.util.ArrayList;
import java.util.List;
public class Metro {
	
	String color;
	String ciudad;
	int numeroEstaciones;
	
	List<String> estaciones = new ArrayList<String>();
	int estacionActual = 0;
	
	public Metro() {
		estaciones.add("Cd. Azteca");
		estaciones.add("Plaza Aragon");
		estaciones.add("Olimpica");
		estaciones.add("Ecatepec");
		estaciones.add("Muzquiz");
		
	}

	public List<String> getEstaciones() {
		return estaciones;
	}
	public void setEstaciones(List<String> estaciones) {
		this.estaciones = estaciones;
	}

	
	public Metro(String color, String ciudad, int numeroEstaciones) {
		super();
		this.color = color;
		this.ciudad = ciudad;
		this.numeroEstaciones = numeroEstaciones;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getNumeroEstaciones() {
		return numeroEstaciones;
	}

	public void setNumeroEstaciones(int numeroEstaciones) {
		this.numeroEstaciones = numeroEstaciones;
	}

	
	@Override
	public String toString() {
		return "Metro [color=" + color + ", ciudad=" + ciudad + ", numeroEstaciones=" + numeroEstaciones
				+ ", estaciones=" + estaciones + ", estacionActual=" + estacionActual + "]";
	}

	public void mandaAviso() {
		System.out.println("El avance esta siendo lento!!");
	}
	
	public void avanzarEstacion() {
		estacionActual++;
		System.out.println("Usted esta llegando a: " + estaciones.get(estacionActual));
	}
	
	
	
	
	
	
	
	

}
