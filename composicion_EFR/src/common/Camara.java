package common;

public class Camara {
	int cantidad;
	String calidad;
	
	public Camara() {
		
	}

	public Camara(int cantidad, String calidad) {
		super();
		this.cantidad = cantidad;
		this.calidad = calidad;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

	@Override
	public String toString() {
		return "Camara [cantidad=" + cantidad + ", calidad=" + calidad + "]";
	}

}
