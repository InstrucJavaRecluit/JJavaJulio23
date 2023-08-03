package common;

public class Gerente extends Empleado {
	String departamento;
	
	public Gerente() {
		
	}

	public Gerente(String departamento) {
		super();
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Gerente [departamento=" + departamento + ", puesto=" + puesto + ", salario=" + salario + ", id=" + id
				+ ", nombre=" + nombre + ", edad=" + edad + "]";
	}
     public void mensaje2() {
    	 System.out.println("gerente trabajando");
     }

}
