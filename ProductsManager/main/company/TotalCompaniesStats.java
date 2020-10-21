package company;

/*
 * TotalCompaniesStats is a Singleton class. 
 * */
public class TotalCompaniesStats {
	private volatile float totalProductsWorth;
	private volatile float totalAverageProductsPrice;
	private volatile int numberOfProducts;
	private static TotalCompaniesStats single_instance = null;

	private TotalCompaniesStats () {
		this.totalProductsWorth = 0;
		this.totalAverageProductsPrice = 0;
		this.numberOfProducts = 0;
	}
	
	public static TotalCompaniesStats getInstance() {
		if (single_instance == null)
			single_instance = new TotalCompaniesStats();
		return single_instance;
	}

	/**
	 * @return the totalProductsWorth
	 */
	public float getTotalProductsWorth() {
		return totalProductsWorth;
	}

	/**
	 * @param totalProductsWorth the ProductsWorth to add
	 */
	public synchronized void addToTotalProductsWorth(float ProductsWorth) {
		this.totalProductsWorth += ProductsWorth;
	}

	/**
	 * @return the totalAverageProductsPrice
	 */
	public float getTotalAverageProductsPrice() {
		return totalAverageProductsPrice;
	}

	/**
	 * @param AverageProductsPrice the AverageProductsPrice to include to the current average
	 */
	public synchronized void CalcTotalAverageProductsPrice(float AverageProductsPrice) {
		
		this.totalAverageProductsPrice = (this.totalAverageProductsPrice+AverageProductsPrice)/2;
	}

	
	/**
	 * @return the numberOfProducts
	 */
	public int getNumberOfProducts() {
		return numberOfProducts;
	}

	/**
	 * @param numberOfProducts the numberOfProducts to add
	 */
	public void addProducts(int numberOfProducts) {
		this.numberOfProducts = numberOfProducts;
	}
}
