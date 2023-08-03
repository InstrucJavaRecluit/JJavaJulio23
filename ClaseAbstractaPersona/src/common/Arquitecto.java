package common;

public class Arquitecto {
	
	String cedula;
	String experencia;
	double sueldo;
	
	public Arquitecto() {
		
	}

	public Arquitecto(String cedula, String experencia, double sueldo) {
		super();
		this.cedula = cedula;
		this.experencia = experencia;
		this.sueldo = sueldo;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getExperencia() {
		return experencia;
	}

	public void setExperencia(String experencia) {
		this.experencia = experencia;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Arquitecto [cedula=" + cedula + ", experencia=" + experencia + ", sueldo=" + sueldo + "]";
		
	}
	
	public String investigacionSuelo() {
		// TODO Auto-generated method stub
		return "Elaboracion de estudio del suelo";
	}

	public String diseñoYplanificacion() {
		// TODO Auto-generated method stub
		return "Diseño y planificacion de casas";
	}

	public String creacionDocumentosyPlanos() {
		// TODO Auto-generated method stub
		return "Creando planos y documentos de construciones";
	}
	
}



