package com.codecool.VendingMachine.Inventory;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.stream.Stream;

import com.codecool.VendingMachine.Inventory.Beverage.Beverage;

public class BeverageInventory implements Inventory {
	
	private static final int DEFAULT_AMOUNT = 10;
	private HashMap<BeverageType, Queue<Beverage>> inventory = new HashMap<BeverageType, Queue<Beverage>>();
	
	public BeverageInventory() 
	{
		init();
		resetInventory(DEFAULT_AMOUNT);
	}
	
	private void init() 
	{
		Stream.of(BeverageType.values()).forEach(bev -> inventory.put(bev, new LinkedList<Beverage>()));
	}

	@Override
	public void resetInventory(int amount) 
	{
		Stream.of(BeverageType.values()).forEach(bev -> 
		{
			Queue<Beverage> q = new LinkedList<Beverage>();
			for(int i = 0; i < amount; i++) 
			{
				q.add(bev.createInstance());
			}
			inventory.put(bev, q);
		});
		
	}

	@Override
	public Beverage getBeverage(BeverageType type) {
		try 
		{
			Beverage bev = inventory.get(type).remove();
			return bev;
		}
		catch(NoSuchElementException e) 
		{
			return null;
		}
	}

	@Override
	public void getInventoryInfo() {
		// TODO Auto-generated method stub
		
	}

}
