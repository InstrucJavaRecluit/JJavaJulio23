package common;

public class Almacenamiento {

	String capacidad;
	String expansion;
	
	public Almacenamiento() {
		
	}

	
	public Almacenamiento(String capacidad, String expansion) {
		this.capacidad = capacidad;
		this.expansion = expansion;
	}
	
	

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	public String getExpansion() {
		return expansion;
	}

	public void setExpansion(String expansion) {
		this.expansion = expansion;
	}


	@Override
	public String toString() {
		return "Almacenamiento [capacidad=" + capacidad + ", expansion=" + expansion + "]";
	}
	
	
	
}
