package product;

import java.util.Comparator;

public class SortProductsByPrice implements Comparator<Product>{

	public int compare(Product a, Product b) {
		return (int) (a.getPrice() - b.getPrice());
	}

}
