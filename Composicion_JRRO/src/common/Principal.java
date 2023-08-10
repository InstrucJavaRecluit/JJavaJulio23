package common;

public class Principal {
	public static void main(String[] args) {
		
		
		
		Camara c = new Camara("32MP", "64MP", "Noche, Foto, Video");
		Almacenamiento a = new Almacenamiento(6, 8, "LPDDR4x");
		Chips ch = new Chips("Snapdragon 680", "8 nucleos hasta 2.4GHZ", "Adreno 610");
		
		Celular cel = new Celular("OPPO", "Reno7", "Azul", c, a, ch);
		
		System.out.println(cel);
	}

}
