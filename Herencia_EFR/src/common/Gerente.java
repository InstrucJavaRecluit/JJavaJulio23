package common;

public class Gerente extends Empleado {

	String PuestoNuevo;
	double SalarioNuevo;
	
	
	public Gerente() {
		
	}


	public Gerente(String nombre, int edad, String domicilio, String ocupacion, String puesto, double sueldo, String id,
			String puestoNuevo, double salarioNuevo) {
		super(nombre, edad, domicilio, ocupacion, puesto, sueldo, id);
		PuestoNuevo = puestoNuevo;
		SalarioNuevo = salarioNuevo;
	}


	public String getPuestoNuevo() {
		return PuestoNuevo;
	}


	public void setPuestoNuevo(String puestoNuevo) {
		PuestoNuevo = puestoNuevo;
	}


	public double getSalarioNuevo() {
		return SalarioNuevo;
	}


	public void setSalarioNuevo(double salarioNuevo) {
		SalarioNuevo = salarioNuevo;
	}
	
	public void Ascenso() {
		System.out.println("Lo he logrado");
	}
}
