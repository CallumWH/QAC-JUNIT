package com.qa.Blackjack;

import static org.junit.Assert.*;
import org.junit.Test;

public class InvalidClass
{
	Blackjack b = new Blackjack();
	@Test
	public void Test1()
	{		
		assertEquals("2 low invalid", 0, b.play(-10, -10));
	}
	
	@Test
	public void Test2()
	{	
		assertEquals("low invalid, Valid", 0, b.play(-10, 10));
	}
	
	@Test
	public void Test3()
	{	
		assertEquals("low invalid, bust", 0, b.play(-10, 30));
	}
	
	@Test
	public void Test4()
	{	
		assertEquals("low invalid, high invalid", 0, b.play(-10, 50));
	}
	
	@Test
	public void Test5()
	{	
		assertEquals("valid, low invalid", 0, b.play(10, -10));
	}
	
	
	@Test
	public void Test7()
	{	
		assertEquals("valid, high invalid", 0, b.play(10, 50));
	}
	
	
	@Test
	public void Test10()
	{	
		assertEquals("bust, low invalid", 0, b.play(30, -10));
	}
	
	@Test
	public void Test13()
	{	
		assertEquals("bust, high invalid", 0, b.play(30, 50));
	}
	
	@Test
	public void Test14()
	{	
		assertEquals("high invalid, low invalid", 0, b.play(50, -10));
	}
	
	@Test
	public void Test15()
	{	
		assertEquals("high invalid, valid", 0, b.play(50, 10));
	}
	
	@Test
	public void Test16()
	{	
		assertEquals("high invalid, bust", 0, b.play(50, 30));
	}
	
	@Test
	public void Test17()
	{	
		assertEquals("2 high invalid", 0, b.play(50, 50));
	}
	
}
