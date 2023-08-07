package common;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Principal {
	public static void main(String[] args) {
		int opcion = 0;
		Contacto contact = new Contacto();
		Scanner scanner = new Scanner(System.in);
		Set<Contacto> coleccionSet = new HashSet<>();
		
		do {
			
			opcion = contact.seleccionaOpcion(scanner);
			
			switch(opcion) {
				case 1:
					contact.agregarContacto(contact, scanner, coleccionSet);
					opcion = 1;
					break;
				case 2:
					
					contact.buscarContacto(scanner, coleccionSet);
					opcion = 2;
					break;
				case 3:
					contact.editarContacto(scanner, coleccionSet);
					opcion = 3;
					break;
				case 4:
					contact.eliminarContacto(scanner, coleccionSet);
					opcion = 4;
					break;
				case 5:
					contact.mostrarTodos(coleccionSet);
					opcion = 5;
					break;
				case 6:
					opcion = 6;
					break;
			}
			
			
		}while(opcion >= 1 && opcion <= 5 );
		
	}

}
