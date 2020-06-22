package com.codecool.VendingMachine.Inventory;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.codecool.VendingMachine.Inventory.Beverage.Beverage;

public class BeverageInventory implements Inventory {
	
	private static final int DEFAULT_AMOUNT = 10;
	private Map<BeverageType, Queue<Beverage>> inventory;
	private Map<BeverageType, Integer> soldItems;
	
	public BeverageInventory() 
	{
		init();
		resetInventory(DEFAULT_AMOUNT);
	}
	
	private void init() 
	{
		this.inventory = Stream.of(BeverageType.values())
				.collect(Collectors.toMap(x -> x, x -> new LinkedList<Beverage>()));
		
		this.soldItems = Stream.of(BeverageType.values())
				.collect(Collectors.toMap(x -> x, x -> 0));
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
