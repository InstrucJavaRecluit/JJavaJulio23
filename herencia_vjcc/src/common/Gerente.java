package common;

public class Gerente extends Empleado{
	
	String nivel;
	String responsabilidades;
	
	
	public Gerente() {
		
	}


	public Gerente(String nombre, int edad, String sexo, String puesto, String horario, String nivel,
			String responsabilidades) {
		super(nombre, edad, sexo, puesto, horario);
		this.nivel = nivel;
		this.responsabilidades = responsabilidades;
	}


	public String getNivel() {
		return nivel;
	}


	public void setNivel(String nivel) {
		this.nivel = nivel;
	}


	public String getResponsabilidades() {
		return responsabilidades;
	}


	public void setResponsabilidades(String responsabilidades) {
		this.responsabilidades = responsabilidades;
	}

	public void AlgoGerente() {
		System.out.println("Gerente");
	}


	@Override
	public String toString() {
		return "Gerente [nivel=" + nivel + ", responsabilidades=" + responsabilidades + ", puesto=" + puesto
				+ ", horario=" + horario + ", nombre=" + nombre + ", edad=" + edad + ", Sexo=" + Sexo + "]";
	}
	
	
}
