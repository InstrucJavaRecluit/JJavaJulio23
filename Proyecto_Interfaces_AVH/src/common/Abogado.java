package common;

public class Abogado extends Empleado implements Abogacia{

	String cedulaProfecional;
	String especializacion;
	String esperienciaProfecional;
	String idiomas;
	double sueldo;
	
	public Abogado() {
		
	}

	public Abogado(String nombre, String genero, String curp, String rfc, String email, int telefono,
			String cedulaProfecional, String especializacion, String esperienciaProfecional, String idiomas,
			double sueldo) {
		super(nombre, genero, curp, rfc, email, telefono);
		this.cedulaProfecional = cedulaProfecional;
		this.especializacion = especializacion;
		this.esperienciaProfecional = esperienciaProfecional;
		this.idiomas = idiomas;
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

	public String getEsperienciaProfecional() {
		return esperienciaProfecional;
	}

	public void setEsperienciaProfecional(String esperienciaProfecional) {
		this.esperienciaProfecional = esperienciaProfecional;
	}

	public String getIdiomas() {
		return idiomas;
	}

	public void setIdiomas(String idiomas) {
		this.idiomas = idiomas;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Abogado [cedulaProfecional=" + cedulaProfecional + ", especializacion=" + especializacion
				+ ", esperienciaProfecional=" + esperienciaProfecional + ", idiomas=" + idiomas + ", sueldo=" + sueldo
				+ ", rfc=" + rfc + ", email=" + email + ", telefono=" + telefono + ", nombre=" + nombre + ", genero="
				+ genero + ", curp=" + curp + "]";
	}

	@Override
	public String asesoramientoJuridico() {
		// TODO Auto-generated method stub
		return "Realizando asesoramiento juridico..";
	}

	@Override
	public String investigacionLegal() {
		// TODO Auto-generated method stub
		return "Realizando investigacion legal..";
	}

	@Override
	public String elaboracionDocumentosLegales() {
		// TODO Auto-generated method stub
		return "Elaborando documentos legales..";
	}

	@Override
	public String resolucionProblemasLegales() {
		// TODO Auto-generated method stub
		return "Resolviendo problemas legales..";
	}
	
	
}
