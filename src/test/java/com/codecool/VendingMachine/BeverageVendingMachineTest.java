package com.codecool.VendingMachine;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;

import com.codecool.VendingMachine.Inventory.BeverageInventory;
import com.codecool.VendingMachine.Inventory.BeverageType;
import com.codecool.VendingMachine.Inventory.Inventory;
import com.codecool.VendingMachine.Inventory.Beverage.Coke;

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
	
	@Test
	public void balanceStartsFromZeroAfterRefund() 
	{
		machine.insertCoin(Coins.Dime);
		machine.refund();
		machine.insertCoin(Coins.Quarter);
		assertThat(machine.refund(), is(25));
	}
	
	@Test
	public void cantReturnBeverageOnInsufficentBalance() 
	{
		assertNull(machine.getBeverage(BeverageType.Coke));
	}
	
	
}
