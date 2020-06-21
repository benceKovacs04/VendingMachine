package com.codecool.VendingMachine;

import com.codecool.VendingMachine.Inventory.BeverageType;

public interface VendingMachine 
{
	void insertCoin(Coins coin);
	int refund();
	Order getBeverage(BeverageType type);
	void resetInventory(int amount);
}
