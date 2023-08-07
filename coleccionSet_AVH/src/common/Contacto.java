package common;

import java.util.Scanner;
import java.util.Set;

public class Contacto {

	String nombre;
	String telefono;
	String correo;
	
	public Contacto() {
		
	}

	public Contacto(String nombre, String telefono, String correo) {
		
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + "]";
	}
	
	public int seleccionaOpcion(Scanner sc) {
		int opcion = 0;
		System.out.println("1 Agregar contacto");
		System.out.println("2 Buscar contacto");
		System.out.println("3 Editar contacto");
		System.out.println("4 Eliminar contacto");
		System.out.println("5 Mostrar todos los contactos");
		System.out.println("6 Salir");
		
		try {
			opcion = sc.nextInt();
		}catch(Exception e) {
			System.out.println("Inserta un numero: " + e);
		}
		
		return opcion;
	}
	
	public void agregarContacto(Contacto contacto, Scanner sc, Set<Contacto> lista) {
			
			sc.nextLine();
			System.out.println("Inserta un nombre");
			String nombre = sc.nextLine();
			System.out.println("Inserta el telefono");
			String telefono = sc.nextLine();
			System.out.println("Inserta el correo");
			String correo = sc.nextLine();
			contacto = new Contacto(nombre, telefono, correo);
			lista.add(contacto);
			System.out.println(lista);
		}
		
	public void buscarContacto(Scanner sc, Set<Contacto> lista) {
		System.out.println("Inserta el nombre a buscar: ");
		sc.nextLine();
		String nombre = sc.nextLine();
		
		for(Contacto contacto :lista) {
			if(contacto.getNombre().equals(nombre)) {
				
				System.out.println(contacto.getNombre());
				System.out.println(contacto.getTelefono());
				System.out.println(contacto.getCorreo());
				System.out.println("--------------------------");
			}
		}
		
	}
	
	public void editarContacto(Scanner sc, Set<Contacto> lista) {
		System.out.println("Inserta el nombre del contacto a editar: ");
		sc.nextLine();
		String nombre = sc.nextLine();
		
		for(Contacto contacto : lista) {
			if(contacto.getNombre().equals(nombre)) {
				
				System.out.println("Inserta el nuevo nombre:");
				String nom = sc.nextLine();
				System.out.println("Inserta el nuevo numero de telefono");
				String num = sc.nextLine();
				System.out.println("Inserta el nuevo correo");
				String correo = sc.nextLine();
				
				contacto.setNombre(nom);
				contacto.setTelefono(num);
				contacto.setCorreo(correo);
				System.out.println("------Actualizado-----");
			}
		}
		
		
	}
	
	public void eliminarContacto(Scanner sc, Set<Contacto> lista) {
		System.out.println("Ingresa el nombre a eliminar: ");
		sc.nextLine();
		String nombre = sc.nextLine();
		
		boolean eliminado = lista.removeIf(contacto -> contacto.getNombre().equals(nombre));
			
		if(eliminado) {
			System.out.println("contacto eliminado");
		}else {
			System.out.println("No eliminado");
		}
		
	}
	
	public void mostrarTodos(Set<Contacto> lista) {
	System.out.println("Todos los contactos: ");
	System.out.println(lista);
}

}
