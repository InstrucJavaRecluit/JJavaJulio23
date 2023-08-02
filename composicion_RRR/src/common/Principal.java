package common;

public class Principal {
	public static void main (String []args) {
	 
		Celular cel = new Celular();
		
		Almacenamiento a = new Almacenamiento("SD", 128.0, "SAMSUNG");
		MemoriaRam m = new MemoriaRam(8, "LPDDR4X", 200 );
		Camara c = new Camara (1080, 50);
		Pantalla p = new Pantalla(6.0, "HD" , 1080);
		
		Celular cel2 = new Celular("SAMSUNG", "GALAXY 7", a, p, c, m);
		System.out.println(cel2);
		
	}
	
}
