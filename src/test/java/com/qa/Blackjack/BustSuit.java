package com.qa.Blackjack;

import static org.junit.Assert.*;

import org.junit.Test;

public class BustSuit 
{
	
	Blackjack b = new Blackjack();
	
	@Test
	public void Test6()
	{	
		assertEquals("valid, bust", 10, b.play(10, 30));
	}
	
	@Test
	public void Test11()
	{	
		assertEquals("bust, valid", 10, b.play(30, 10));
	}
	
	@Test
	public void Test12()
	{	
		assertEquals("2 bust", 0, b.play(30, 30));
	}
	
}
