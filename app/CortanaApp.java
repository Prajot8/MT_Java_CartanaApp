package com.nissan.app;
import com.nissan.model.*;

import java.util.*;



public class CortanaApp {
	public static Scanner scanner= new Scanner(System.in);
	public static Scanner scanner1= new Scanner(System.in);
	static List<Product> listOfProducts;
	
	public static void main(String[] args) {
		try {
			listOfProducts=new ArrayList<Product>();
		int choice;
		do {
		choice=mainMenu();
		switch(choice) {
		case 1:
			listOfProducts.add(CartanaFunctionalities.addProduct(listOfProducts));
			
			break;
		case 2:
			CartanaFunctionalities.listAllProducts(listOfProducts);
			break;
		case 3:
			menuForSearch();
			break;
		
		case 0:
			System.out.println("Exited Successfully...");
			break;
		}
		}while(choice!=0);
	}catch(Exception e) {
		System.out.println("Invalid choice..."+e.getMessage());
	}
		
	}
	
	private static void menuForSearch() {
		try {
		int choice;
		System.out.println("\n1.Search by item code\n2.Search by item name");
		System.out.println("Enter your choice: ");
		choice=scanner.nextInt();
		switch(choice) {
			case 1:
				CartanaFunctionalities.searchProductByItemCode(listOfProducts);
				break;
			case 2:
				CartanaFunctionalities.searchProductByItemName(listOfProducts);
				break;
			default:
				System.out.println("invalid choice of search by.");
				break;
		}
		}catch(Exception e) {
			System.out.println("Invalid choice..."+e.getMessage());
		}
		
			
	}

	public static int mainMenu() {
		int choice;
		System.out.println("\n0.Exit\n1.Add new product\n2.List all product\n3.Search product");
		System.out.println("Enter your choice: ");
		choice=scanner.nextInt();
		return choice;
		
	}
}
