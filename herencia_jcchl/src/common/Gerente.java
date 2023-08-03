package common;

public class Gerente extends Empleado{
	
	String area;
	
	public  Gerente() {}

	public Gerente(String area) {
		super();
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
		return "gerente [area=" + area + ", salario=" + salario + ", puesto=" + puesto + ", rfc=" + rfc + ", nombre="
				+ nombre + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + "]";
	}

	public void mensaje2 () {
		System.out.println("Mensaje gerente");
	}
}