package common;

public class Abogado {
	String especialidad;
	String cedula;
	double sueldo;
	
	public Abogado() {}

	public Abogado(String rama, String cedula, double sueldo) {
		super();
		this.especialidad = rama;
		this.cedula = cedula;
		this.sueldo = sueldo;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Abogado [especialidad=" + especialidad + ", cedula=" + cedula + ", sueldo=" + sueldo + "]";
	}
	
	public String asesorJuridico() {
		return "Haciendo un asesoramiento juridico";
		
	}
	
	public String amparos() {
		return "Tramitando un amparo";
		
	}
	
	public String tramitesDivorsio() {
		return "Tremitando un negocio";
	}
	
	
}
