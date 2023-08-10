package common;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
////		Audifonos audifonos = new Audifonos();
////		audifonos.setColor("Gris");
////		audifonos.setMarca("Sony");
//		
//		//System.out.println(audifonos);
//		
		Audifonos audifonos = new Audifonos("Negro", "Sony", "Diadema", "40 mzh", "2", 0);
//		List<String> rolas = new ArrayList<String>();
//		rolas.add("Pista 1");
//		rolas.add("Pista 2");
//		rolas.add("Pista 3");
//		rolas.add("Pista 4");
//		rolas.add("Pista 5");
//		rolas.add("Pista 6");
//		rolas.add("Pista 7");
//		rolas.add("Pista 8");
//		rolas.add("Pista 9");
//		
//		audifonos.setCanciones(rolas);
//		
//		System.out.println(audifonos);
//		audifonos.SiguienteCancion();
		
		///////////////////////////////////////
//		
		Celular celular = new Celular();	
		celular.SiguienteMensaje();
		celular.Llamada();
		celular.setColor("Rojo");
		celular.setMarca("Samsung");
		celular.setCompañia("Telcel");
		celular.setAlmacenamiento(64);
		celular.setRam(6);
		System.out.println(celular);
		
		System.out.println("");
		System.out.println("//////////////////////////////////////////////////////////");
		System.out.println("");
		
		Celular celular2 = new Celular("Azul", "Xiaomi", "Libres", 128, 4);
		List<String> Mensajes = new ArrayList<String>();
		Mensajes.add("mensaje 1");
		Mensajes.add("mensaje 2");
		Mensajes.add("mensaje 3");

		
		celular2.setMensajes(Mensajes);
		celular2.SiguienteMensaje();
		celular2.Llamada();
		
		System.out.println(celular2);
	}
}
