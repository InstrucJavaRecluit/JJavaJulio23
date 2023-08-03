package common;

public class Principal {

	public static void main(String[] args) {
		
		Obrero obrero = new Obrero();
		obrero.setNombre("Aldo Valadez Hernandez");
		
		Obrero obrero2 = new Obrero("Mario", "hombre", "VAHA000728HTLLRLA1", "VAHA000728D1",
				"mario.vaha@gmail.com", 55467843, "ser critico", "tecnico en mantenimiento", 4000);
		
		System.out.println(obrero2);
		System.out.println(obrero2.asesoramientoJuridico());
		System.out.println(obrero2.cargarDescargar());
		System.out.println(obrero2.diseñoArquitectonico());
		
		Abogado abogado = new Abogado("homero", "sin genero", "BAHS876546JEKOD1", "VIBVDF43",
				"homero.32@gmail.com", 5434654, "68-hgyug-6", "derecho", "sin experiencia", "ingles", 8000);
		
		System.out.println();
		System.out.println(abogado.asesoramientoJuridico());
		
		System.out.println("-----------------------------------------------------------");
		Persona per = new Persona();
		System.out.println(per.MAXIMO_TIEMPO_VIDA);
		Empleado empleado = new Empleado();
		
		per.leer();
		empleado.leer();
		
		
	}
}
