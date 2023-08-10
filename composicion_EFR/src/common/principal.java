package common;

public class principal {
	public static void main (String []args) {
	
	Celular cel = new Celular(); 
	Almacenamiento a = new Almacenamiento(64.0 ,"Kingston");
	Pantalla pan = new Pantalla(23.5,"2560x1800",160);
	Camara cam= new Camara(1,"24 px");
	
		Celular cel2 = new Celular("iphone","Modelo_13","Smartphone", a,pan,cam);
	System.out.println(cel2);

}
}