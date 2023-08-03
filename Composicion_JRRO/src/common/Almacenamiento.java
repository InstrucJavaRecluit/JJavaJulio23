package common;

public class Almacenamiento {
	
	int capRAM;
	int capROM;
	String tipoRAM;
	
	public Almacenamiento() {
		
	}

	public Almacenamiento(int capRAM, int capROM, String tipoRAM) {
		super();
		this.capRAM = capRAM;
		this.capROM = capROM;
		this.tipoRAM = tipoRAM;
	}

	public int getCapRAM() {
		return capRAM;
	}

	public void setCapRAM(int capRAM) {
		this.capRAM = capRAM;
	}

	public int getCapROM() {
		return capROM;
	}

	public void setCapROM(int capROM) {
		this.capROM = capROM;
	}

	public String getTipoRAM() {
		return tipoRAM;
	}

	public void setTipoRAM(String tipoRAM) {
		this.tipoRAM = tipoRAM;
	}

	@Override
	public String toString() {
		return "Almacenamiento [capRAM=" + capRAM + ", capROM=" + capROM + ", tipoRAM=" + tipoRAM + "]";
	}
	
	

}
