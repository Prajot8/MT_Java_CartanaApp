package com.nissan.model;

import java.util.List;
import java.util.Scanner;

public class CartanaFunctionalities {
	
	//instance variables
	public static Scanner scanner= new Scanner(System.in);
	public static Scanner scanner1= new Scanner(System.in);
	public static Product product;
	
	//addProduct()
	public static Product addProduct(List<Product> list) {
		try {
		System.out.println("Enter item code: ");
		int _itemCode=scanner.nextInt();
		
		System.out.println("Enter item name: ");
		String _itemName=checkForDuplicateProduct(scanner1.next(),list);
		
		System.out.println("Enter item buying price: ");
		double _buyingPrice=scanner.nextDouble();
		
		System.out.println("Enter item selling price: ");
		double _sellingPrice=scanner.nextDouble();

		Category _category=convetToCategory(Category.OTHERS);	
		
		System.out.println("Enter item tax percentage: ");
		double _taxpercentage=scanner.nextDouble();
		
		System.out.println("Enter item quantity: ");
		int _quantity=scanner.nextInt();
		
		product=new Product(_itemCode,_itemName,_buyingPrice,_sellingPrice,_category,_taxpercentage,_quantity);
		
		System.out.println(product.getItemCode()+" "+product.getItemName() +" added sucessfully.");
		}catch(Exception e) {
			System.out.println("Invalid choice..."+e.getMessage());
		}
		return product;
	}
	
	
	//convert String to Category type
	private static Category convetToCategory(Category cat) {
		
		String upperCase=menuForCategory();
		Category[] catArr=Category.values();
		for (Category category : catArr) {
			if(category.toString().equals(upperCase)) {
				cat= category;
			}
		}
		return cat;
		
	}
	
	//display menu for Category selection
	public static String menuForCategory() {
		System.out.println("Enter item category: ");
		System.out.println("1.Camera\t2.Laptop\t3.Watch\t\t4.Mobile Phone");
		int choice=scanner.nextInt();
		switch(choice) {
		case 1:
			return "CAMERA";
		case 2:
			return "LAPTOP";
		case 3:
			return "WATCH";
		case 4:
			return "MOBILE_PHONE";
		case 0:
			return "";
		default:
			System.out.println("Invalid Category choice");
			
			return null;
		}
	}
	
	//check for duplicate names of product and if found ask for other name
	public static String checkForDuplicateProduct(String _name, List<Product> _list) {
		try {
		for (Product product : _list) {
			if(product.getItemName().equals(_name)) {
				System.out.println("Product already added, please try another product");
				_name=scanner1.next();
			}
			return _name;
		}
		}catch(Exception e) {
			System.out.println("Invalid input in item name: ");
		}
		return _name;
	}
	
	//display all products list
	public static void listAllProducts(List<Product> list) {
		/*for (Product product : list) {
			System.out.println(product);
		}*/
		try{
			String choice;
			//do {
					choice=menuForCategory();
					//System.out.println("Enter 'exit' for exiting.");
					System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    System.out.println(String.format("%-18s%-20s%-20s%-20s%-20s%-10s%-18s%n","Item Code","Item Name","Buying Price","Selling Price","Category","Tax %","Quantity"));
                    System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    //printing
                    
                    for(Product product : list)
                    {	
                    	if(product.getObjCategory().toString().equalsIgnoreCase(choice)) {
                        System.out.println(String.format("%-18s%-20s%-20s%-20s%-20s%-10s%-18s%n",product.getItemCode(),product.getItemName(),product.getBuyingPrice(),product.getSellingPrice(),product.getObjCategory(),product.getTaxPercentage(),product.getQuantity()));
                    
                    	}
                    }
			//}while(choice.equalsIgnoreCase("exit"));  
            }catch(StringIndexOutOfBoundsException e){
                System.out.println("Thank you for choosing");
                System.exit(0);
            }
        
        
	}
	
	//find product by item code
	public static void searchProductByItemCode(List<Product> list) {
		//System.out.println("Inside item code");
		
		try{
			//show list for reference
			for (Product product : list) {
				System.out.println(product.getItemCode()+" "+product.getItemName());
			}
			//take input from user
			System.out.println("Enter item code: ");
			int code=scanner.nextInt();
			
					//System.out.println("Enter 'exit' for exiting.");
					System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    System.out.println(String.format("%-18s%-20s%-20s%-20s%-20s%-10s%-18s%n","Item Code","Item Name","Buying Price","Selling Price","Category","Tax %","Quantity"));
                    System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    //printing
                    
                    for (Product product : list) {
                    	//find item with matching code
        				if(product.getItemCode()==code) {
        					System.out.println(String.format("%-18s%-20s%-20s%-20s%-20s%-10s%-18s%n",product.getItemCode(),product.getItemName(),product.getBuyingPrice(),product.getSellingPrice(),product.getObjCategory(),product.getTaxPercentage(),product.getQuantity()));
        				}
                    }
			  
            }catch(Exception e){
                System.out.println("Thank you for choosing "+e.getMessage());
                System.exit(0);
            }
	}
	
	//find product by item name
	public static void searchProductByItemName(List<Product> list) {
		//System.out.println("Inside item name");
		try{
			String choice;
			//show list for reference
			for (Product product : list) {
				System.out.println(product.getItemCode()+" "+product.getItemName());
			}	
			//take input from user
					System.out.println("Enter item name: ");
					choice=scanner1.next();
					//System.out.println("Enter 'exit' for exiting.");
					System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    System.out.println(String.format("%-18s%-20s%-20s%-20s%-20s%-10s%-18s%n","Item Code","Item Name","Buying Price","Selling Price","Category","Tax %","Quantity"));
                    System.out.println("----------------------------------------------------------------------------------------------------------------------");
                    //printing
                    
                    for(Product product : list)
                    {	
                    	//find item with matching name
                    	if(product.getItemName().toString().equalsIgnoreCase(choice)) {
                        System.out.println(String.format("%-18s%-20s%-20s%-20s%-20s%-10s%-18s%n",product.getItemCode(),product.getItemName(),product.getBuyingPrice(),product.getSellingPrice(),product.getObjCategory(),product.getTaxPercentage(),product.getQuantity()));
                    
                    	}
                    }
			  
            }catch(StringIndexOutOfBoundsException e){
                System.out.println("Thank you for choosing");
                System.exit(0);
            }
		
	}


}
