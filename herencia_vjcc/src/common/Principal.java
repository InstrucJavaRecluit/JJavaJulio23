package common;

public class Principal {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		Empleado e = new Empleado();
		Gerente g = new Gerente();
		
//		p.AlgoPersona();
//		
//		e.AlgoPersona(); //Empleado accede a persona
//		
//		g.AlgoPersona(); //Gerente accede a persona
//		g.AlgoEmpleado(); // Gerente accede a empleado
		
		//System.out.println(e);
		System.out.println(p.MAXIMO_TIEMPO_VIDA);
		//Persona.MAXIMO_TIEMPO_VIDA = 30;
		//System.out.println(g);
		
		p.leer();
		e.leer();
	}

}
