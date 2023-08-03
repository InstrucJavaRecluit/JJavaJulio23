package common;

public class Arquitecto extends Empleado implements Arquitectura{
	String cedulaProfecional;
	String especializacion;
	String experienciaProfecional;
	String softwareDiseño;
	double sueldo;
	
	public Arquitecto() {
		
	}

	public Arquitecto(String nombre, String genero, String curp, String rfc, String email, int telefono,
			String cedulaProfecional, String especializacion, String experienciaProfecional, String softwareDiseño,
			double sueldo) {
		super(nombre, genero, curp, rfc, email, telefono);
		this.cedulaProfecional = cedulaProfecional;
		this.especializacion = especializacion;
		this.experienciaProfecional = experienciaProfecional;
		this.softwareDiseño = softwareDiseño;
		this.sueldo = sueldo;
	}

	public String getCedulaProfecional() {
		return cedulaProfecional;
	}

	public void setCedulaProfecional(String cedulaProfecional) {
		this.cedulaProfecional = cedulaProfecional;
	}

	public String getEspecializacion() {
		return especializacion;
	}

	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
	}

	public String getExperienciaProfecional() {
		return experienciaProfecional;
	}

	public void setExperienciaProfecional(String experienciaProfecional) {
		this.experienciaProfecional = experienciaProfecional;
	}

	public String getSoftwareDiseño() {
		return softwareDiseño;
	}

	public void setSoftwareDiseño(String softwareDiseño) {
		this.softwareDiseño = softwareDiseño;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Arquitecto [cedulaProfecional=" + cedulaProfecional + ", especializacion=" + especializacion
				+ ", experienciaProfecional=" + experienciaProfecional + ", softwareDiseño=" + softwareDiseño
				+ ", sueldo=" + sueldo + ", rfc=" + rfc + ", email=" + email + ", telefono=" + telefono + ", nombre="
				+ nombre + ", genero=" + genero + ", curp=" + curp + "]";
	}

	@Override
	public String diseñoArquitectonico() {
		// TODO Auto-generated method stub
		return "Elaborando diseño arquitectonico";
	}

	@Override
	public String investigacionAnalisisDeSitios() {
		// TODO Auto-generated method stub
		return "Realizando investigacion y analisis de sitios";
	}

	@Override
	public String presupuestoPlanificacion() {
		// TODO Auto-generated method stub
		return "Calculando presupuesto y planificacion";
	}

	@Override
	public String creacionDocumentosyPlanos() {
		// TODO Auto-generated method stub
		return "Creando documentos y planos";
	}
	
	
}
