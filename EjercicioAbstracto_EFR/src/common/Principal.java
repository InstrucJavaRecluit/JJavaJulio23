package common;

public class Principal {

	public static void main(String[] args) {
		
		Empleado emp = new Empleado();
		
		emp.setNombre("pedro");
		emp.setEdad(45);
		emp.setDomicilio("calle 29 · 70");
		emp.setOcupacion("obrero");	
		
		emp.datos("hola" , "hello");
		
		System.out.println(emp.datos("Hola" , "Hello"));
		System.out.println(emp);
	}
}
