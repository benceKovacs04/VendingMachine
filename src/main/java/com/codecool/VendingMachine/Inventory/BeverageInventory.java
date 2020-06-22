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
	private HashMap<BeverageType, Integer> soldItems = new HashMap<BeverageType, Integer>();
	
	public BeverageInventory() 
	{
		init();
		resetInventory(DEFAULT_AMOUNT);
	}
	
	private void init() 
	{
		Stream.of(BeverageType.values()).forEach(bev -> 
			{
				inventory.put(bev, new LinkedList<Beverage>());
				soldItems.put(bev, 0);
			});
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
		Queue<Beverage> q = inventory.get(type);
		if(!q.isEmpty()) 
		{
			Beverage bev = q.remove();
			soldItems.put(type, soldItems.get(type) + 1);
			return bev;			
		}
		return null;
	}

	@Override
	public void getConsumptionInfo() 
	{
		soldItems.entrySet().forEach(item ->System.out.println(String.format("Sold %d of %s", item.getValue(), item.getKey()))); 
		
		
		
	}

}
