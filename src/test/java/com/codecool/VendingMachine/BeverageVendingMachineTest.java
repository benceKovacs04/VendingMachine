package com.codecool.VendingMachine;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;

import com.codecool.VendingMachine.Inventory.BeverageInventory;
import com.codecool.VendingMachine.Inventory.BeverageType;
import com.codecool.VendingMachine.Inventory.Inventory;

@RunWith(MockitoJUnitRunner.class)
public class BeverageVendingMachineTest 
{
	@Rule
	public MockitoRule initRule = MockitoJUnit.rule();
	
	@Mock
	Inventory mockInventory;
	
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
	
	@Test
	public void machineGivesBackChange() 
	{
		machine.insertCoin(Coins.Quarter);
		machine.insertCoin(Coins.Dime);
		Order order = machine.getBeverage(BeverageType.Coke);
		assertThat(order.change, is(10));
	}
	
	@Test
	public void BalanceIsZeroAfterPurchase() 
	{
		machine.insertCoin(Coins.Quarter);
		machine.insertCoin(Coins.Dime);
		machine.getBeverage(BeverageType.Coke);
		assertThat(machine.refund(), is(0));
	}
	
	@Test
	public void canResetInventory() 
	{
		machine = new BeverageVendingMachine(mockInventory);
		machine.resetInventory(10);
		Mockito.verify(mockInventory).resetInventory(10);
	}
	
}
