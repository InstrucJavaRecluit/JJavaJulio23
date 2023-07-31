package common;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		
		/*Audifonos ad = new Audifonos();
		ad.setColor("rojo");
		ad.setMarca("sony");
		
		System.out.println(ad);
		
		
		
		Audifonos ad2 = new Audifonos("verde", "jbl", "diadema", "style", "20Hz - 200Hz", 3);
		List<String> rolas = new ArrayList<String>();
		rolas.add("rola 1");
		rolas.add("rola 2");
		rolas.add("rola 3");
		rolas.add("rola 4");
		rolas.add("rola 5");
		ad2.setCanciones(rolas);
		System.out.println(ad2);*/
		
		Automovil auto = new Automovil();
		auto.setColor("negro");
		auto.setCosto(120000);
		System.out.println(auto);
		auto.acelerar();
		auto.acelerar();
		auto.frenar();
		auto.acelerar();
		auto.reversa();
		auto.acelerar();
		auto.acelerar();
		auto.frenar();
		
		
		
		
		
		Automovil auto2 = new Automovil("verde", "chevrolet", "97", 95000);
		System.out.println(auto2);
		//auto2.encender();
		//auto2.acelerar();
		
	}
}
