package com.codecool.VendingMachine;

import com.codecool.VendingMachine.Inventory.BeverageType;
import com.codecool.VendingMachine.Inventory.Inventory;
import com.codecool.VendingMachine.Inventory.Beverage.Beverage;

public class MockInventory implements Inventory
{
	public boolean haveBeenCalled = false;

	@Override
	public void resetInventory(int amount) {
		this.haveBeenCalled = true;
		
	}

	@Override
	public Beverage getBeverage(BeverageType type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getConsumptionInfo() {
		// TODO Auto-generated method stub
		
	}

}
