package com.codecool.VendingMachine;

import com.codecool.VendingMachine.Inventory.BeverageType;
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
		balance += coin.getValue();
		
	}

	@Override
	public int refund() {
		int current = balance;
		balance = 0;
		return current;
	}

	@Override
	public Order getBeverage(BeverageType type) {
		if(balance >= type.getPrice()) 
		{
			return new Order(inventory.getBeverage(type), 0);			
		}
		else 
		{
			return null;
		}
	}

}
