package common;

public class Principal {
	public static void main (String[]args) {
	Persona p1 = new Persona();
	Empleado emp = new Empleado();
	Gerente ger = new Gerente();
	
    p1.Imprimir();
    emp.mensaje();
    ger.mensaje2();
    
    
    System.out.println(p1.MAXIMO_TIEMPO_VIDA);
    
    p1.leer();
    emp.leer();
    

	
}
}