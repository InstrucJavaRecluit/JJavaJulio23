package common;

public class Compañia {
	
	String nombre;
	int coberturaEstados;
	String tecnologia;
	
	
	public Compañia() {
		
	}


	public Compañia(String nombre, int coberturaEstados, String tecnologia) {
		this.nombre = nombre;
		this.coberturaEstados = coberturaEstados;
		this.tecnologia = tecnologia;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCoberturaEstados() {
		return coberturaEstados;
	}


	public void setCoberturaEstados(int coberturaEstados) {
		this.coberturaEstados = coberturaEstados;
	}


	public String getTecnologia() {
		return tecnologia;
	}


	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}


	@Override
	public String toString() {
		return "Compañia [nombre=" + nombre + ", coberturaEstados=" + coberturaEstados + ", tecnologia=" + tecnologia
				+ "]";
	}

	
	
	
}
