package common;

public class Empleado extends Persona{
	String puesto;
	double sueldo;
	String id;
	 
	public Empleado() {
		
	}

	public Empleado(String nombre, int edad, String domicilio, String ocupacion, String puesto, double sueldo,
			String id) {
		super(nombre, edad, domicilio, ocupacion);
		this.puesto = puesto;
		this.sueldo = sueldo;
		this.id = id;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void trabajar() {
		System.out.println("Estoy trabajando");
	}

	
}
