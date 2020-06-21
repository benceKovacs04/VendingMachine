package com.codecool.VendingMachine;

import com.codecool.VendingMachine.Inventory.Beverage.Beverage;

public class Order 
{
	public Beverage beverage;
	public Integer change;
	
	public Order(Beverage beverage, Integer change) 
	{
		this.beverage = beverage;
		this.change = change;
	}
}
