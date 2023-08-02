package common;

public class Empleado extends Persona {
	
	String puesto;
	String horario;
	
	public Empleado() {
		
	}

	public Empleado(String nombre, int edad, String sexo, String puesto, String horario) {
		super(nombre, edad, sexo);
		this.puesto = puesto;
		this.horario = horario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public void AlgoEmpleado() {
		System.out.println("Empleado");
	}

	@Override
	public String toString() {
		return "Empleado [puesto=" + puesto + ", horario=" + horario + ", nombre=" + nombre + ", edad=" + edad
				+ ", Sexo=" + Sexo + "]";
	}
	
	
}
