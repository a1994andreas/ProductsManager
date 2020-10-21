package product;

import java.util.Date;

public class Product {
	private float price;
	private Date estimatedDelivery;
	private String name;

	public Product() {
		
	}
	
	public Product(float price, Date estimatedDelivery, String name){
		this.price = price;
		this.estimatedDelivery = estimatedDelivery;
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}

	/**
	 * @return the estimatedDelivery
	 */
	public Date getEstimatedDelivery() {
		return estimatedDelivery;
	}
	/**
	 * @param estimatedDelivery the estimatedDelivery to set
	 */
	public void setEstimatedDelivery(Date estimatedDelivery) {
		this.estimatedDelivery = estimatedDelivery;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name+", price:"+Float.toString(price)+", estimated delivery: "+estimatedDelivery.toString();
	}
}
