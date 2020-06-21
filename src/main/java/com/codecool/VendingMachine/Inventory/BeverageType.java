package com.codecool.VendingMachine.Inventory;

import com.codecool.VendingMachine.Inventory.Beverage.*;
import java.util.function.Supplier;


public enum BeverageType {
	
	Coke(25, Coke::new),
	Pepsi(35, Pepsi::new),
	Soda(45, Soda::new);
	
	private final int price;
	private final Supplier<Beverage> supplier;
	
	private BeverageType(int price, Supplier<Beverage> supplier) 
	{
		this.price = price;
		this.supplier = supplier;
	}
	
	public int getPrice() 
	{
		return this.price;
	}
	
	public Beverage createInstance() 
	{
		return supplier.get();
	}
	
}
