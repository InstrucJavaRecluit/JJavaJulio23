package common;

public class Principal {
	public static void main (String[]args) {

	Coche a1 = new Coche();
	a1.setAño(2022);
	a1.setColor("Azul");
	a1.setMarca("Toyota");
	 System.out.println(a1);
	
	
	 Coche a2 = new Coche("Negro", "Nissan", 2022);
	 System.out.println(a2);
}
}
    
