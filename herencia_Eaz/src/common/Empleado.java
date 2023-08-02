package common;

public class Empleado extends Persona {
	String salario;
	String rfc;
	String puesto;
	
	public Empleado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empleado(String nombre, String apelldio, int edad, String salario, String rfc, String puesto) {
		super(nombre, apelldio, edad);
		this.salario = salario;
		this.rfc = rfc;
		this.puesto = puesto;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", rfc=" + rfc + ", puesto=" + puesto + "]";
	}
	
	

	
	
}
