package common;

public class Gerente extends Empleado {
	
	String area;

	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nombre, String apelldio, int edad, String salario, String rfc, String puesto, String area) {
		super(nombre, apelldio, edad, salario, rfc, puesto);
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Gerente [area=" + area + "]";
	}

	
}
