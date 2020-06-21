package com.codecool.VendingMachine.Inventory.Beverage;

import com.codecool.VendingMachine.Inventory.BeverageType;

public class Coke extends Beverage 
{
	public Coke() 
	{
		this.price = BeverageType.Coke.getPrice();
	}
}
