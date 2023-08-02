package common;

public class Celular {

	String marca;
	String tama�o;
	String gama;
	
	Almacenamiento alm;
	Compa�ia com;
	Procesador pro;
	
	public Celular() {
		
	}

	public Celular(String marca, String tama�o, String gama, Almacenamiento alm, Compa�ia com, Procesador pro) {
		this.marca = marca;
		this.tama�o = tama�o;
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

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
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

	public Compa�ia getCom() {
		return com;
	}

	public void setCom(Compa�ia com) {
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
		return "Celular [marca=" + marca + ", tama�o=" + tama�o + ", gama=" + gama + ", alm=" + alm + ", com=" + com
				+ ", pro=" + pro + "]";
	}
	
	
	
}
