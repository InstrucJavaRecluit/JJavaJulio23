package common;

public class Principal {
	public static void main(String[] args) {
		
		Empleado emp = new Empleado();
		emp.saludar();
		emp.trabajar();
		
		
		Gerente g = new Gerente("Aldo", 23, "VAHA000728HTLLRLA1", 1, 55654435, 40000, 2, "produccion", "estable", "mejoramiento");
		System.out.println(g);
		g.saludar();
		g.mensajeGerente();
		
		
	}
}
