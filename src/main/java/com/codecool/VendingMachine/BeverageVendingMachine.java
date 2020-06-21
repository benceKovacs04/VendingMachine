package com.codecool.VendingMachine;

import com.codecool.VendingMachine.Inventory.BeverageType;
import com.codecool.VendingMachine.Inventory.Inventory;

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
			Order order = new Order(inventory.getBeverage(type), balance - type.getPrice());
			balance = 0;
			return order;			
		}
		else 
		{
			return null;
		}
	}

	@Override
	public void resetInventory(int amount) {
		this.inventory.resetInventory(amount);
		
	}

}
