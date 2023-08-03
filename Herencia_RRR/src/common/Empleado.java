package common;

public class Empleado extends Persona {

	String puesto;
	double salario;
	String id;
	
	public Empleado() {
		
	}

	public Empleado(String puesto, double salario, String id) {
		super();
		this.puesto = puesto;
		this.salario = salario;
		this.id = id;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public void mensaje() {
		System.out.println("empleado trabajando");
	}
	@Override
	public void leer() {
		System.out.println("leyendo desde la clase empleado");
	}
}
