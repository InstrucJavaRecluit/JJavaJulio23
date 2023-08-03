package common;

public class Obrero extends Empleado implements Obra, Arquitectura, Abogacia{
	
	String experiencia;
	String habilidades;
	double sueldo;
	
	public Obrero(String experiencia, String habilidades, double sueldo) {
		super();
		this.experiencia = experiencia;
		this.habilidades = habilidades;
		this.sueldo = sueldo;
	}

	public Obrero() {
		// TODO Auto-generated constructor stub
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Obrero [experiencia=" + experiencia + ", habilidades=" + habilidades + ", sueldo=" + sueldo + "]";
	}
	
	public String mantenimiento() {
		return ("mantenimineto electrico");
	}
	
	public String limpieza() {
		return ("limpieza general");
	}
	
	public String reparaciones() {
		return ("Reparaciones de de mobiliario");
	}
	
	public String asesorJuridico() {
		return ("asesoramiento juridico");
	}
	
	public String amparos() {
		return ("Tramites de amparos");
	}
	
	public String tramitesDivorsio() {
		return ("Realizando un tramite de divirsio");
	}
	
	public String investigacionSuelo() {
		return ("analisis del suelo");
	}
	
	public String diseñoYplanificacion() {
		return ("Diseño arquitectonico");
	}
	
	public String creacionDocumentosyPlanos() {
		return ("Creacion de planos");
	}
	

}
