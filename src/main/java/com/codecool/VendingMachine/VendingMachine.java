package com.codecool.VendingMachine;

import com.codecool.VendingMachine.Inventory.BeverageType;
import com.codecool.VendingMachine.Inventory.Beverage.Beverage;

public interface VendingMachine 
{
	void insertCoin(Coins coin);
	int refund();
	Order getBeverage(BeverageType type);
}
