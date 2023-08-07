package common;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		
		Audifonos au = new Audifonos();		
		au.setColor("Gris");
		au.setMarca("Sony");		
		System.out.println(au);
		
		Audifonos au2 = new Audifonos("negro","Sony","Inalambricos","Diadema","20Hz - 30000Hz", 4);
		
		List<String> rolas = new ArrayList<String>();
		rolas.add("Pista 1");
		rolas.add("Pista 2");
		rolas.add("Pista 3");
		rolas.add("Pista 4");
		rolas.add("Pista 5");
		rolas.add("Pista 6");
		rolas.add("Pista 7");
		
		au2.setCanciones(rolas);		
		System.out.println(au2);
		
		au.siguienteCancion();
		
	}

}
