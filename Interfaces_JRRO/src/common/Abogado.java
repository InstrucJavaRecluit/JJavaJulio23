package common;

public class Abogado extends Persona implements Abogacia{

	@Override
	public String demanda(String dmd) {
		System.out.println("Abogacia demanda");
		return dmd;
	}

	@Override
	public String amparo(String amp) {
		System.out.println("Abogacia amparo");
		return amp;
	}

	@Override
	public String contrato(String cnt) {
		System.out.println("Abogacia contrato");
		return cnt;
	}

	@Override
	public String Persona1(String persona) {
		System.out.println("Mensaje de la clase Persona en la clase Abogado");
		return persona;
	}
	
		
}
