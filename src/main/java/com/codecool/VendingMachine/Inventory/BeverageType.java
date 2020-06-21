package com.codecool.VendingMachine.Inventory;

public enum BeverageType {
	
	Coke(25),
	Pepsi(35),
	Soda(45);
	
	private final int price;
	
	private BeverageType(int price) 
	{
		this.price = price;
	}
	
	public int getPrice() 
	{
		return this.price;
	}
}
