package common;

public class Empleado extends Persona{
	
	String puesto;
	int nss;
	double sueldo;
	
	public Empleado() {
		
	}

	public Empleado(String nombre, int edad, String nacionalidad, String puesto, int nss, double sueldo) {
		super(nombre, edad, nacionalidad);
		this.puesto = puesto;
		this.nss = nss;
		this.sueldo = sueldo;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getNss() {
		return nss;
	}

	public void setNss(int nss) {
		this.nss = nss;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	public void puesto() {
		System.out.println("Hola, esta es la clase EMPLEADO");
	}
	
	

}
