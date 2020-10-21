package product;

import java.util.Date;

public class TechProduct extends Product {
	private int guarantee;
	private TechProductBrand brand;

	public TechProduct() {
		super();
	}

	public TechProduct(float price, Date estimatedDelivery, String name) {
		super(price, estimatedDelivery, name);
	}

	public TechProduct(float price, Date estimatedDelivery, String name, int guarantee, TechProductBrand brand) {
		super(price, estimatedDelivery, name);
		this.guarantee= guarantee;
		this.brand = brand;
	}

	/**
	 * @return the guarantee
	 */
	public int getGuarantee() {
		return guarantee;
	}

	/**
	 * @param guarantee the guarantee to set
	 */
	public void setGuarantee(int guarantee) {
		this.guarantee = guarantee;
	}

	/**
	 * @return the brand
	 */
	public TechProductBrand getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(TechProductBrand brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return super.toString()+" brand: "+brand.toString()+" Years of guarantee: "+guarantee;
	}
}
