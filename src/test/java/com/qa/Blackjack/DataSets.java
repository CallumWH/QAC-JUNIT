package com.qa.Blackjack;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DataSets 
{
	@Parameters
	public static Collection<Object[]> Data()
	{
		return Arrays.asList(new Object[][] {{0,-10, -10}, {0, 31, 10}, {20, 10, 20}, {0, 50, -10}, {0, 20, 50}, {21, 21, 22}});
	}
	
	private int intPut;
	private int intPected;
	private int dealerInput;
	
	private Blackjack b = new Blackjack();
	
	public DataSets(int expected, int player, int dealer)
	{
		intPut = player;
		dealerInput = dealer;
		intPected = expected;
	}
	
	@Test
	public void test()
	{
		assertEquals(intPected, b.play(intPut, dealerInput));
	}
}
