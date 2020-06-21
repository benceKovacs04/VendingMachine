package com.codecool.VendingMachine.Inventory.Beverage;

import com.codecool.VendingMachine.Inventory.BeverageType;

public class Pepsi extends Beverage 
{
	public Pepsi() 
	{
		this.price = BeverageType.Pepsi.getPrice();
	}
}
