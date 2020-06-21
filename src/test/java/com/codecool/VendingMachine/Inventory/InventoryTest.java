package com.codecool.VendingMachine.Inventory;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;

import com.codecool.VendingMachine.Inventory.Beverage.Beverage;
import com.codecool.VendingMachine.Inventory.Beverage.Coke;

public class InventoryTest 
{	
	Inventory inventory;
	
	@Before
	public void setUpInventory() 
	{
		this.inventory = new BeverageInventory();
	}
	
	@Test
	public void canGetBeverage() 
	{
		Coke bev = (Coke) inventory.getBeverage(BeverageType.Coke);
		assertThat(bev, instanceOf(Coke.class));
	}
	
	@Test
	public void resetInventorySetsCorrectAmount() 
	{
		inventory.resetInventory(1);
		inventory.getBeverage(BeverageType.Coke);
		Beverage bev = inventory.getBeverage(BeverageType.Coke);
		assertNull(bev);
	}
	
	
	
}
