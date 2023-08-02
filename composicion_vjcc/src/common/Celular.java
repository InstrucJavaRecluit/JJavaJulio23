package common;

public class Celular {

	String marca;
	String tamaño;
	String gama;
	
	Almacenamiento alm;
	Compañia com;
	Procesador pro;
	
	public Celular() {
		
	}

	public Celular(String marca, String tamaño, String gama, Almacenamiento alm, Compañia com, Procesador pro) {
		this.marca = marca;
		this.tamaño = tamaño;
		this.gama = gama;
		this.alm = alm;
		this.com = com;
		this.pro = pro;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getGama() {
		return gama;
	}

	public void setGama(String gama) {
		this.gama = gama;
	}

	public Almacenamiento getAlm() {
		return alm;
	}

	public void setAlm(Almacenamiento alm) {
		this.alm = alm;
	}

	public Compañia getCom() {
		return com;
	}

	public void setCom(Compañia com) {
		this.com = com;
	}

	public Procesador getPro() {
		return pro;
	}

	public void setPro(Procesador pro) {
		this.pro = pro;
	}

	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", tamaño=" + tamaño + ", gama=" + gama + ", alm=" + alm + ", com=" + com
				+ ", pro=" + pro + "]";
	}
	
	
	
}
