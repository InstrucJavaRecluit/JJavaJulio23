package common;

public abstract class Arquitecto extends Empleado implements Arquitectura {
	
	public Arquitecto() {
		
	}
	public String datos(String a,String b) {;
	return a+b;
	}
	public String disenio(String disenio) {
		return disenio;
	}
	public String decorar(String decorar) {
		return decorar;
	}
	public String calcular(String calcular) {
		return calcular;
	}

}
