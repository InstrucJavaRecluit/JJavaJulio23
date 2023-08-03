package common;

public class Obrero extends Empleado implements Obra, Abogacia, Arquitectura{

	String abilidades;
	String experienciaLaboral;
	double salario;
	
	public Obrero() {
		
	}

	public Obrero(String nombre, String genero, String curp, String rfc, String email, int telefono, String abilidades,
			String experienciaLaboral, double salario) {
		super(nombre, genero, curp, rfc, email, telefono);
		this.abilidades = abilidades;
		this.experienciaLaboral = experienciaLaboral;
		this.salario = salario;
	}

	public String getAbilidades() {
		return abilidades;
	}

	public void setAbilidades(String abilidades) {
		this.abilidades = abilidades;
	}

	public String getExperienciaLaboral() {
		return experienciaLaboral;
	}

	public void setExperienciaLaboral(String experienciaLaboral) {
		this.experienciaLaboral = experienciaLaboral;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Obrero [abilidades=" + abilidades + ", experienciaLaboral=" + experienciaLaboral + ", salario="
				+ salario + ", rfc=" + rfc + ", email=" + email + ", telefono=" + telefono + ", nombre=" + nombre
				+ ", genero=" + genero + ", curp=" + curp + "]";
	}

	@Override
	public String construir() {
		// TODO Auto-generated method stub
		return "Realizando construccion..";
	}

	@Override
	public String cargarDescargar() {
		// TODO Auto-generated method stub
		return "Cargando y descargando mercancia..";
	}

	@Override
	public String mantenimiento() {
		// TODO Auto-generated method stub
		return "Realizando mantenimiento..";
	}

	@Override
	public String operacionMaquinaria() {
		// TODO Auto-generated method stub
		return "Operando maquinaria..";
	}

	@Override
	public String limpiezaSaneamiento() {
		// TODO Auto-generated method stub
		return "Realizando limpieza y saneamiento..";
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

	@Override
	public String diseñoArquitectonico() {
		// TODO Auto-generated method stub
		return "Realizando diseño arquitectonico..";
	}

	@Override
	public String investigacionAnalisisDeSitios() {
		// TODO Auto-generated method stub
		return "Realizando investigacion y analisis de sitios..";
	}

	@Override
	public String presupuestoPlanificacion() {
		// TODO Auto-generated method stub
		return "Calculando presupuesto y planificacion..";
	}

	@Override
	public String creacionDocumentosyPlanos() {
		// TODO Auto-generated method stub
		return "Creando documento y planos..";
	}
	
	
	
}
