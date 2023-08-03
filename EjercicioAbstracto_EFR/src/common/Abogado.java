package common;

public abstract class Abogado  extends Empleado implements Abogancia{
	
		public Abogado() {
			
		}
		public String leyes(String leyes) {
			return leyes;
		}
		public String juicios(String juicio) {
			return juicio;
		}
		public String demandas(String demanda) {
			return demanda;
		}
	

}
