package common;
import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void  main(String []args) {
		
//		Audifonos au= new Audifonos();
//		
//		au.setColor("Gris");
//		au.setMarca("Sony");
//		
//		System.out.println(au);
//		
//		Audifonos au2 = new Audifonos("negro","sony","Inalambricos","Diadema","20hz-300000",4);
//		List<String> rolas= new ArrayList<String>();
//		rolas.add("Pista 1");
//		rolas.add("Pista 1");
//		rolas.add("Pista 1");
//		rolas.add("Pista 1");
//		rolas.add("Pista 1");
//		
//		au2.setCanciones(rolas);
//		System.out.println(au2);
//		
//		au.sigienteCancion();
//		au.sigienteCancion();
//		
//		au2.sigienteCancion();
//		au2.sigienteCancion();
//		
		Laptop lp= new Laptop();
		lp.setMarca("lenovo");
		lp.setProcesador("I5");
		
		System.out.println(lp);
		
		Laptop lp2 = new Laptop("Lenovo","I5", 32);
		List<String> programs = new ArrayList<String>();
		programs.add("Office");
		programs.add("autocad");
		programs.add("chrome");
		
		lp2.setProgramas(programs);
		System.out.println(lp2);
		
		lp.cambiaPrograma();
		lp.cambiaPrograma();
		
		lp2.cambiaPrograma();
		lp2.cambiaPrograma();
		
		
		
		
	}

}
