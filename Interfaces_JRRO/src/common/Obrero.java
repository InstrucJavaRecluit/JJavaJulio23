package common;

public class Obrero extends Persona implements Obra, Abogacia, Arquitectura{

	@Override
	public String diseño(String dsn) {
		System.out.println("Obrero diseño");
		return dsn;
	}

	@Override
	public String modelado(String mdl) {
		System.out.println("Obrero modelado");
		return mdl;
	}

	@Override
	public String calculo(String clc) {
		System.out.println("Obrero calculo");
		return clc;
	}

	@Override
	public String demanda(String dmd) {
		System.out.println("Obrero demanda");
		return dmd;
	}

	@Override
	public String amparo(String amp) {
		System.out.println("Obrero amparo");
		return amp;
	}

	@Override
	public String contrato(String cnt) {
		System.out.println("Obrero contrato");
		return cnt;
	}

	@Override
	public String instalacionElectrica(String electricidad) {
		System.out.println("Obrero electricidad");
		return electricidad;
	}

	@Override
	public String plomeria(String plom) {
		System.out.println("Obra plomeria");
		return plom;
	}

	@Override
	public String loza(String lz) {
		System.out.println("Obra loza");
		return lz;
	}

	@Override
	public String Persona1(String persona) {
		System.out.println("Mensaje de la clase Persona en la clase Obrero");
		return persona;
	}
	
	

}
