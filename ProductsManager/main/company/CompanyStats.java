package company;

import product.Product;

public class CompanyStats {

	private Company company;
	private float productsWorth;
	private float averageProductsPrice;
	
	public CompanyStats(Company company) {
		this.setCompany(company);
	}
	
	
	
	public static float sumProductsWorth(Company company) {
		float sum = 0;
		for(Product product : company.getProducts()) {
			sum +=product.getPrice();
		}
		return sum;
	}
	
	public static float averageProductsPrice(Company company) {
		float sum = 0;
		for(Product product : company.getProducts()) {
			sum +=product.getPrice();
		}
		return sum/company.getProducts().size();
	}

	public static float averageProductsPrice(Company company,String name) {
		float sum = 0;
		int productCounter =0;
		for(Product product : company.getProducts()) {
			if(name.equals(product.getName())) {
				sum +=product.getPrice();
				productCounter++;
			}
		}
		return (productCounter == 0) ? 0 : sum/productCounter;
	}



	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}



	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}



	/**
	 * @return the productsWorth
	 */
	public float getProductsWorth() {
		return productsWorth;
	}



	/**
	 * @param productsWorth the productsWorth to set
	 */
	public void setProductsWorth(float productsWorth) {
		this.productsWorth = productsWorth;
	}



	/**
	 * @return the averageProductsPrice
	 */
	public float getAverageProductsPrice() {
		return averageProductsPrice;
	}



	/**
	 * @param averageProductsPrice the averageProductsPrice to set
	 */
	public void setAverageProductsPrice(float averageProductsPrice) {
		this.averageProductsPrice = averageProductsPrice;
	}
	
}
