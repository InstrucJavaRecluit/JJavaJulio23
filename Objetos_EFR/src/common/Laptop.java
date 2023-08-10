package common;
import java.util.ArrayList;
import java.util.List;

public class Laptop {
	
	String marca;
	String procesador;
	int memoria;
	
	List<String> programas = new ArrayList<String>();
	int programaActual =0;
	
	public  Laptop() {
		programas.add("office");
		programas.add("autocad");
		programas.add("Java");
		programas.add("chrome");
	
		
	

	}
	

	public Laptop(String marca, String procesador, int memoria) {
		super();
		this.marca = marca;
		this.procesador = procesador;
		this.memoria = memoria;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getProcesador() {
		return procesador;
	}


	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}


	public int getMemoria() {
		return memoria;
	}


	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}


	public List<String> getProgramas() {
		return programas;
	}


	public void setProgramas(List<String> programas) {
		this.programas = programas;
	}


	public int getProgramaActual() {
		return programaActual;
	}


	public void setProgramaActual(int programaActual) {
		this.programaActual = programaActual;
	}


	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", procesador=" + procesador + ", memoria=" + memoria + ", programas="
				+ programas + ", programaActual=" + programaActual + "]";
	}

	public void iniciaSO() {
		System.out.print("Reproduciendo");
	}
    public void cambiaPrograma() {
    	programaActual++;
    	System.out.println("Reproduciendo"+ programas.get(programaActual));
    	
    }
    public void ejecutarPrograma() {
    	System.out.println("Ejecutando programa");
    	
    }
}
