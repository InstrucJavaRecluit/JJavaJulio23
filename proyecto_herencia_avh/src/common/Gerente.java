package common;

public class Gerente extends Empleado{
	
	int ID_Gerente;
	String area;
	String inforFinanciera;
	String proyectos;
	
	public Gerente() {
		
	}

	public Gerente(String nombre, int años, String curp, int iD_Empleado, int cuentaBancaria, int salario,
			int iD_Gerente, String area, String inforFinanciera, String proyectos) {
		super(nombre, años, curp, iD_Empleado, cuentaBancaria, salario);
		ID_Gerente = iD_Gerente;
		this.area = area;
		this.inforFinanciera = inforFinanciera;
		this.proyectos = proyectos;
	}

	public int getID_Gerente() {
		return ID_Gerente;
	}

	public void setID_Gerente(int iD_Gerente) {
		ID_Gerente = iD_Gerente;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getInforFinanciera() {
		return inforFinanciera;
	}

	public void setInforFinanciera(String inforFinanciera) {
		this.inforFinanciera = inforFinanciera;
	}

	public String getProyectos() {
		return proyectos;
	}

	public void setProyectos(String proyectos) {
		this.proyectos = proyectos;
	}

	@Override
	public String toString() {
		return "Gerente [ID_Gerente=" + ID_Gerente + ", area=" + area + ", inforFinanciera=" + inforFinanciera
				+ ", proyectos=" + proyectos + "]";
	}

	public void mensajeGerente() {
		System.out.println("mensaje de gerente");
	}
	
	
	
}
