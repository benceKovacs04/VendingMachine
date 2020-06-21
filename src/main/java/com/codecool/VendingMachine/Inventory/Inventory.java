package com.codecool.VendingMachine.Inventory;

import com.codecool.VendingMachine.Inventory.Beverage.Beverage;

public interface Inventory 
{
	void resetInventory();
	Beverage getBeverage();
	void getInventoryInfo();
	
}
