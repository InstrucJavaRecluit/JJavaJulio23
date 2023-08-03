package common;

public class Arquitecto extends Persona implements Arquitectura{
	
	public Arquitecto() {
		
	}

	@Override
	public String diseño(String dsn) {
		System.out.println("Arquitectura diseño");
		return dsn;
	}

	@Override
	public String modelado(String mdl) {
		System.out.println("Arquitectura modelado");
		return mdl;
	}

	@Override
	public String calculo(String clc) {
		System.out.println("Arquitectura calculo");
		return clc;
	}

	@Override
	public String Persona1(String persona) {
		System.out.println("Mensaje de la clase Persona en la clase Arquitecto");
		return persona;
	}

	
	

}
