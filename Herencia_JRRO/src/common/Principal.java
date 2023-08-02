package common;

public class Principal {
	public static void main(String[] args) {
		
		Persona per = new Persona();
		Empleado emp = new Empleado();
		Gerente ge = new Gerente();
		
		per.ImprimeDatos();
		emp.puesto();
		ge.mensaje();
		
	}

}

