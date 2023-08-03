package common;

public class Principal {

	public static void main(String[] args) {
		
		Empleado emp = new Empleado();
		Obrero o = new Obrero();
		Arquitecto arc = new Arquitecto();
		Abogado ab = new Abogado();
		
		System.out.println(emp);
		
		emp.setEdad(31);
		emp.setGenero("hombre");
		emp.setNacionalidad("Mexicano");
		emp.setNombre("Ricardo");
		emp.setNSS(123456789);
		
		o.amparo("Obrero Amparo");
		o.calculo("Obrero Calculo");
		o.contrato("Obrero Contrato");
		o.demanda("Obrero Demanda");
		o.diseño("Obrero Diseño");
		o.loza("Obrero Loza");
		o.modelado("Obrero Modelado");
		o.plomeria("Obrero Plomeria");
		o.Persona1("Ricardo");
		
		arc.calculo("Arquitecto Calculo");
		arc.diseño("Arquitecto Diseño");
		arc.modelado("Modelado");
		arc.Persona1("Ricardo");
		
		ab.amparo("Abogado Amparo");
		ab.contrato("Abogado Contrato");
		ab.demanda("Abogado Demanda");
		ab.Persona1("Ricardo");
		
		
	}
}
