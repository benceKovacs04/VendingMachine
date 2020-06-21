package com.codecool.VendingMachine;

import com.codecool.VendingMachine.Inventory.Inventory;
import com.codecool.VendingMachine.Inventory.Beverage.Beverage;

public class BeverageVendingMachine implements VendingMachine {
	
	
	private Inventory inventory;
	private int balance = 0;
	
	public BeverageVendingMachine(Inventory inventory) 
	{
		this.inventory = inventory;
	}
	

	@Override
	public void insertCoin(Coins coin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int refund() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Beverage getBeverage() {
		// TODO Auto-generated method stub
		return null;
	}

}
