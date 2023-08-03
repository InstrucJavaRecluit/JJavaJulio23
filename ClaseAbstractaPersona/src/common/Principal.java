package common;

public class Principal {
	public static void main (String[] args) {
		
		Obrero obrero = new Obrero();
		obrero.setNombre("Juan Carlos Ch�vez L�pez");

		Obrero obr = new Obrero("Cinco a�os de experiencia","Mantenimiento a suministro electrico", 8000);

		System.out.println(obr);
		System.out.println(obr.asesorJuridico());
		System.out.println(obr.creacionDocumentosyPlanos());
		System.out.println(obr.dise�oYplanificacion());

		Abogado abogado = new Abogado("Juridico", "LNW4416ACAC18", 8000);

		System.out.println();
		System.out.println(abogado.amparos());
	}
}

