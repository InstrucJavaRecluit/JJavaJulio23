package common;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Celular cel = new Celular(); 
		Almacenamiento alm = new Almacenamiento("ROM", 128.0, "huawei");
		MemoriaRAM rm = new MemoriaRAM (64, "RAM", 2.4, 5.0, "2.5" ); 
		Pantalla pl = new Pantalla (11, "OLED", "4K", 12); 
		
		
		
		Celular cel2 = new Celular("Huawei","Y9A", "Movistar","64px",alm, rm, pl  );
		
		System.out.println(cel2);
	}

}
