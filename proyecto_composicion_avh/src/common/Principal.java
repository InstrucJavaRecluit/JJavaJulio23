package common;

public class Principal {
	public static void main(String[] args) {
		
		
		Almacenamiento alm = new Almacenamiento("Targeta SD", 4);
		MemoriaRAM ram = new MemoriaRAM(4, "DDR");
		Pantalla screen = new Pantalla(4.0, "1080");
		
		Celular cel = new Celular("xiaomi", "modelo 6f", "Negro", 4000, alm, ram, screen);
		
		System.out.println(cel);
	}
}
