package common;

public class Principal {
	public static void main (String[] args) {

		Persona test = new Persona ();
		Empleado puesto = new Empleado ();
		Gerente area = new Gerente ();
		
//		test.imprimir();
//		puesto.imprimir();
//		puesto.trabajar();
//		area.mensaje2();
//		
		System.out.println(test);
		System.out.println(test.MAXIMO_TIEMPO_VIDA);	
		System.out.println(puesto.MAXIMO_TIEMPO_VIDA);
		System.out.println(puesto);
		
		test.leer();
		puesto.leer();
		
	}

}
