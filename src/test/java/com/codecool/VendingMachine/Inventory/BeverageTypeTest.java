package com.codecool.VendingMachine.Inventory;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;

public class BeverageTypeTest 
{
	@Test
	public void cokePriceIs25() 
	{
		assertThat(BeverageType.Coke.getPrice(), is(25));
	}
	
	@Test
	public void pepsiPriceIs35() 
	{
		assertThat(BeverageType.Pepsi.getPrice(), is(35));
	}
	
	@Test
	public void sodaPriceIs45() 
	{
		assertThat(BeverageType.Soda.getPrice(), is(45));
	}
	
}
