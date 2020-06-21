package com.codecool.VendingMachine;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;

import com.codecool.VendingMachine.Inventory.BeverageInventory;
import com.codecool.VendingMachine.Inventory.Inventory;

public class BeverageVendingMachineTest 
{
	private VendingMachine machine;
	
	@Before
	public void setUpVendingMachine() 
	{
		Inventory inventory = new BeverageInventory();
		machine = new BeverageVendingMachine(inventory);
	}
	
	@Test
	public void machineIsNotNull() 
	{
		assertNotNull(machine);
	}
	
	@Test
	public void canRefundInsertedCoin() 
	{
		machine.insertCoin(Coins.Dime);
		assertThat(machine.refund(), is(10));
	}
}
