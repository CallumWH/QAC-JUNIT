package com.qa.Blackjack;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompilativeSuite 
{
	
	
	Blackjack b = new Blackjack();
	
	@Test
	public void Test8()
	{	
		assertEquals("valid, high valid", 20, b.play(10, 20));
	}
	
	@Test
	public void Test9()
	{	
		assertEquals("high valid, valid", 20, b.play(20, 10));
	}
	
}
