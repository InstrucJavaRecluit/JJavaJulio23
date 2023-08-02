package common;

public class Empleado extends Persona {

	int ID_Empleado;
	int cuentaBancaria;
	int salario;
	
	public Empleado() {
		
	}

	public Empleado(String nombre, int años, String curp, int iD_Empleado, int cuentaBancaria, int salario) {
		super(nombre, años, curp);
		ID_Empleado = iD_Empleado;
		this.cuentaBancaria = cuentaBancaria;
		this.salario = salario;
	}

	public int getID_Empleado() {
		return ID_Empleado;
	}

	public void setID_Empleado(int iD_Empleado) {
		ID_Empleado = iD_Empleado;
	}

	public int getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(int cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [ID_Empleado=" + ID_Empleado + ", cuentaBancaria=" + cuentaBancaria + ", salario=" + salario
				+ "]";
	}
	
	
	public void trabajar() {
		System.out.println("Trabajando.....");
	}
}
