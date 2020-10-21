package product;

import java.util.Date;

public class Tablet extends TechProduct {
	private float screenSize;
	private String CPU;
	private String memory;
	private String RAM;
	
	public Tablet() {
		super();
	}
	
	public Tablet(float price, Date estimatedDelivery, String name, int guarantee, TechProductBrand brand) {
		super( price, estimatedDelivery, name, guarantee, brand);
	}
	
	public Tablet(float price, Date estimatedDelivery, String name, int guarantee, TechProductBrand brand,
					float screenSize, String CPU, String memory, String RAM) {
		super( price, estimatedDelivery, name, guarantee, brand);
		this.screenSize = screenSize;
		this.CPU = CPU;
		this.memory = memory;
		this.RAM = RAM;
	}

	/**
	 * @return the screenSize
	 */
	public float getScreenSize() {
		return screenSize;
	}

	/**
	 * @param screenSize the screenSize to set
	 */
	public void setScreenSize(float screenSize) {
		this.screenSize = screenSize;
	}

	/**
	 * @return the cPU
	 */
	public String getCPU() {
		return CPU;
	}

	/**
	 * @param cPU the cPU to set
	 */
	public void setCPU(String cPU) {
		CPU = cPU;
	}

	/**
	 * @return the memory
	 */
	public String getMemory() {
		return memory;
	}

	/**
	 * @param memory the memory to set
	 */
	public void setMemory(String memory) {
		this.memory = memory;
	}

	/**
	 * @return the rAM
	 */
	public String getRAM() {
		return RAM;
	}

	/**
	 * @param rAM the rAM to set
	 */
	public void setRAM(String rAM) {
		RAM = rAM;
	}

	@Override
	public String toString() {
		return super.toString()+" screen size: "+Float.toString(screenSize)+" CPU: "+CPU+" memory: "+memory+" RAM: "+RAM;
	}
}
