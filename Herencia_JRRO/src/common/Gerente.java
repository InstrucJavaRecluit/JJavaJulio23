package common;

public class Gerente extends Empleado{
	
	String area;
	int numEmpleados;
	
	public Gerente() {
		
	}

	public Gerente(String nombre, int edad, String nacionalidad, String puesto, int nss, double sueldo, String area,
			int numEmpleados) {
		super(nombre, edad, nacionalidad, puesto, nss, sueldo);
		this.area = area;
		this.numEmpleados = numEmpleados;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getNumEmpleados() {
		return numEmpleados;
	}

	public void setNumEmpleados(int numEmpleados) {
		this.numEmpleados = numEmpleados;
	}

	@Override
	public String toString() {
		return "Gerente [area=" + area + ", numEmpleados=" + numEmpleados + ", puesto=" + puesto + ", nss=" + nss
				+ ", sueldo=" + sueldo + ", nombre=" + nombre + ", edad=" + edad + ", nacionalidad=" + nacionalidad
				+ "]";
	}
	
	public void mensaje() {
		System.out.println("HOLA, ESTA ES LA CLASE GERENTE");
	}
	

}
