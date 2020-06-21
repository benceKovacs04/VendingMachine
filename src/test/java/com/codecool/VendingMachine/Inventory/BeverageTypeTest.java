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
		assertThat(BeverageType.Coke.getValue(), is(25));
	}
	
	@Test
	public void pepsiPriceIs35() 
	{
		assertThat(BeverageType.Pepsi.getValue(), is(35));
	}
	
	@Test
	public void sodaPriceIs45() 
	{
		assertThat(BeverageType.Soda.getValue(), is(45));
	}
	
}
