package common;

public class Empleado extends Persona{
	
	String salario;
	String puesto;
	String rfc;
	
	public Empleado() {}

	public Empleado(String salario, String puesto, String rfc) {
		super(salario, puesto, rfc);
		this.salario = salario;
		this.puesto = puesto;
		this.rfc = rfc;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	
	
	
	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", puesto=" + puesto + ", rfc=" + rfc + "]";
	}

	public void trabajar() {
		System.out.println("Estoy trabajando");
	}
}