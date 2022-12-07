package com.nissan.model;

public class Product {
	
	//instance variables
	private int itemCode;
	private String itemName;
	private double buyingPrice;
	private double sellingPrice;
	private Category objCategory;
	private double taxPercentage;
	private int quantity;
	
	//default constructor
	public Product() {
		
	}
	
	//parameterized constructor
	public Product(int itemCode, String itemName, double buyingPrice, double sellingPrice, Category objCategory,
			double taxPercentage, int quantity) {
		
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.buyingPrice = buyingPrice;
		this.sellingPrice = sellingPrice;
		this.objCategory = objCategory;
		this.taxPercentage = taxPercentage;
		this.quantity = quantity;
	}
	
	//getters & setters
	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getBuyingPrice() {
		return buyingPrice;
	}

	public void setBuyingPrice(double buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public Category getObjCategory() {
		return objCategory;
	}

	public void setObjCategory(Category objCategory) {
		this.objCategory = objCategory;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//toString overriding
	@Override
	public String toString() {
		return "Product [itemCode=" + itemCode + ", itemName=" + itemName + ", buyingPrice=" + buyingPrice
				+ ", sellingPrice=" + sellingPrice + ", objCategory=" + objCategory + ", taxPercentage=" + taxPercentage
				+ ", quantity=" + quantity + "]";
	}
	
	
	
	
	
	
	
}
