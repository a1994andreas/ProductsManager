package main;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import company.Company;
import company.CompanyStats;
import company.TotalCompaniesStats;
import product.Product;
import product.ProductsGenerator;

public class MainClass {
	 // Maximum number of threads in thread pool 
    static final int MAX_T = 3;
    
	public static final int NUMBER_OF_COMPANIES = 200;
	public static final int MAX_NUMBER_OF_PRODUCTS  = 2000000;
    
	public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);   

		
		for (int i =0; i< NUMBER_OF_COMPANIES; i++) {
			Random random = new Random();
			ArrayList<Product> products= ProductsGenerator.generateProducts(random.nextInt(MAX_NUMBER_OF_PRODUCTS));
			//Collections.sort(products, new SortProductsByName());
			
			Company company =  new Company("Test company name", "6971916000", "Hrakleiou 20", products);
			
			Task task = new Task("task "+(i+1),company);
			pool.execute(task);
		}
		pool.shutdown();
	}
	

	
}

class Task implements Runnable {
	private String threadName;
	private Company company;
	private TotalCompaniesStats totalCompaniesStats = TotalCompaniesStats.getInstance();
	
	public Task (String threadName,Company company) {
		this.threadName = threadName;
		this.company = company;
	}
	
	public String getThreadName() {
		return threadName;
	}
	
	 public void run() {
	      System.out.println("["+threadName+"] Current, Total products worth: "+totalCompaniesStats.getTotalProductsWorth()+" , average products"
	      		+ " price  "+ totalCompaniesStats.getTotalAverageProductsPrice()+" , total products: "+totalCompaniesStats.getNumberOfProducts());
	      
	      // Calculate the statistics for the company and add them on total statistics 
	      totalCompaniesStats.addProducts(company.getProducts().size());
	      totalCompaniesStats.addToTotalProductsWorth(CompanyStats.sumProductsWorth(company));
	      totalCompaniesStats.CalcTotalAverageProductsPrice(CompanyStats.averageProductsPrice(company));
	      
	      System.out.println("["+threadName+"] New,     Total products worth: "+totalCompaniesStats.getTotalProductsWorth()+" , average products"
		      		+ " price  "+ totalCompaniesStats.getTotalAverageProductsPrice()+" , total products: "+totalCompaniesStats.getNumberOfProducts());
	 }
}
