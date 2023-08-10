package common;

public class Chips {
	
	String cpu;
	String nucleosCPU;
	String gpu;
	
	public Chips() {
		
	}

	public Chips(String cpu, String nucleosCPU, String gpu) {
		super();
		this.cpu = cpu;
		this.nucleosCPU = nucleosCPU;
		this.gpu = gpu;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getNucleosCPU() {
		return nucleosCPU;
	}

	public void setNucleosCPU(String nucleosCPU) {
		this.nucleosCPU = nucleosCPU;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	@Override
	public String toString() {
		return "Chips [cpu=" + cpu + ", nucleosCPU=" + nucleosCPU + ", gpu=" + gpu + "]";
	}

	
}
