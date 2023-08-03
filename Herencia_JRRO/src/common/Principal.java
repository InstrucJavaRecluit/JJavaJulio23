package common;

public class Principal {
	public static void main(String[] args) {
		
		Persona per = new Persona();
		Empleado emp = new Empleado();
		Gerente ge = new Gerente();
		
//		per.ImprimeDatos();
//		emp.puesto();
//		ge.mensaje();
		
		per.leer();
		emp.leer();
		System.out.println(per.MAXIMO_TIEMPO_VIDA);
		//Persona.MAXIMO_TIEMPO_VIDA = 500;
	}

}

