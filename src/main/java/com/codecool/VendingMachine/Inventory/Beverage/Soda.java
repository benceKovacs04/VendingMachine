package com.codecool.VendingMachine.Inventory.Beverage;

import com.codecool.VendingMachine.Inventory.BeverageType;

public class Soda extends Beverage
{
	public Soda() 
	{
		this.price = BeverageType.Soda.getPrice();		
	}
}
