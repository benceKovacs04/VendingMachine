package com.codecool.VendingMachine;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import com.codecool.VendingMachine.Inventory.BeverageType;

public class CoinsTest 
{
	@Test
	public void pennyValueIs1() 
	{
		assertThat(Coins.Penny.getValue(), is(1));
	}
	
	@Test
	public void nickelValueIs5() 
	{
		assertThat(Coins.Nickel.getValue(), is(5));
	}
	
	@Test
	public void DimeValueIs10() 
	{
		assertThat(Coins.Dime.getValue(), is(10));
	}
	@Test
	public void quarterValueIs25() 
	{
		assertThat(Coins.Quarter.getValue(), is(25));
	}
}
