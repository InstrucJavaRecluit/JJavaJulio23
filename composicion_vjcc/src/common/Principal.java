package common;

public class Principal {

	public static void main(String[] args) {
		Celular cel = new Celular();
		System.out.println(cel);
		
		Almacenamiento alm = new Almacenamiento("128 gb", "max 256 gb"); 
		Procesador ram = new Procesador("Snadragon", "855");
		Compañia com = new Compañia("Telcel", 27, "4g");
		
		Celular cel2 = new Celular("Xiaomi", "8 pulgadas", "Alta", alm, com, ram);
		System.out.println(cel2);

	}

}
