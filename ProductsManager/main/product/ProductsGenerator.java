package product;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class ProductsGenerator {

	private static final int PRICE_RANGE = 5000;
	private static final String[] TABLET_BASE_NAMES = 
		{"Samsung Galaxy Tab A", "Apple iPad 2019", "Apple iPad Mini 2019", "MLS Glory 4G", "Huawei MediaPad T5"};
	private static final String[] CAMERA_BASE_NAMES = 
		{"Nikon D3500 Kit", "Canon EOS 2000D Kit", "Nikon D7500", "Canon EOS 80D", "Nikon D5600 Kit"};
	
	public static ArrayList<Product> generateProducts(int numberOfProducts){
		ArrayList<Product> list= new ArrayList<>();
		for (int i=0; i<numberOfProducts; i++) {
			Random random = new Random();
			Product product;
			// Generate random data
			float price = random.nextInt(PRICE_RANGE);
			int guarantee = random.nextInt(5);
			TechProductBrand brand = TechProductBrand.values()[random.nextInt(TechProductBrand.values().length)];

			if(random.nextInt(2) ==1)
				product = new Tablet(price,new Date(),generateRandomProductName("Tablet"),guarantee,brand,22.2f,"Snapdragon 730","128 GB","8 GB");
			else 
				product = new Camera(price,new Date(),generateRandomProductName("Camera"),guarantee,brand,18,"sensor","6000 x 4000 pixels","3840 x 2160 pixels");
			list.add(product);
		}
		
		return list;
	}
	
	private static String generateRandomProductName(String category) {
		Random random = new Random();

		return (category.equals("Tablet")) ? 
				TABLET_BASE_NAMES[random.nextInt(TABLET_BASE_NAMES.length)]+" "+random.nextInt(2000) :
				CAMERA_BASE_NAMES[random.nextInt(CAMERA_BASE_NAMES.length)]+" "+random.nextInt(2000);
	}
}
