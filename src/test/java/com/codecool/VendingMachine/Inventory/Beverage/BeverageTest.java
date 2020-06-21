package com.codecool.VendingMachine.Inventory.Beverage;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import com.codecool.VendingMachine.Inventory.BeverageType;

public class BeverageTest 
{
	
	@Test
	public void cokePriceIsRight() 
	{
		Coke coke = new Coke();
		assertThat(coke.getPrice(), is(BeverageType.Coke.getPrice()));
	}
	
	@Test
	public void pepsiPriceIsRight() 
	{
		Pepsi pepsi = new Pepsi();
		assertThat(pepsi.getPrice(), is(BeverageType.Pepsi.getPrice()));
	}
	
	@Test
	public void sodaPriceIsRight() 
	{
		Soda soda = new Soda();
		assertThat(soda.getPrice(), is(BeverageType.Soda.getPrice()));
	}
	
}
