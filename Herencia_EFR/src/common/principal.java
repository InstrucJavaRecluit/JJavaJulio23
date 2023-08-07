package common;

public class principal {
	public static void main(String []args) {
		
		Persona test = new Persona();
		Empleado puesto = new Empleado();
		Gerente test2 = new Gerente();
		
		test.imprimeMensaje();
		puesto.imprimeMensaje();
		puesto.trabajar();
		test2.Ascenso();
	}

}
