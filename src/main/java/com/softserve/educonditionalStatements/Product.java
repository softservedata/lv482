package com.softserve.educonditionalStatements;



/**
 * Conditional Statements. Practical task3
 * 
 * Create class Product with fields name, price and quantity.
	Create four instances of type Product. 
	Display the name and quantity of the most expensive item.
	Display the name of the items, which has the biggest quantity.
	*/


public class Product {
	
	public static void main(String[] args) {
			

			Product[] products  = {new Product ( "Milk", 12, 1200), new Product ( "Chease", 40, 600),
			 new Product ( "Chocolate", 55, 2200), new Product ( "Water", 8, 2200)};
			
			double mostExpensive = products[0].getPrice();
			int count = 0;
			for (int i = 0; i < products.length; i++) {
					
					if(mostExpensive < products[i].getPrice()) {
						mostExpensive = products[i].getPrice();
						count = i;
					}
			}
				System.out.println("The most expensive item" + products[count].toString());
			
			int biggestQuantity = products[0].getQuantity();
				for(int i = 0; i < products.length; i++) {
					if(biggestQuantity < products[i].getQuantity()) {
						biggestQuantity = products[i].getQuantity();
						}
				}
				for(int i = 0; i < products.length; i++) {
					if(biggestQuantity == products[i].getQuantity()) {
						System.out.println("Item, which has the biggest quantity " + products[i].getName());
					}
				}
					
	}
	
	private String name;
	private double price ;
	private int quantity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	
			
	}


