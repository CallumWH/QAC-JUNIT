package com.qa.Blackjack;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BlackjackTest 
{
	static int testNum = 1;
	
	@BeforeClass
	public static void Init()
	{
		System.out.println("ACTIVATING THE SEQUENCE");
	}
	
	@Before
	public void SetUp()
	{
		System.out.println("Begining Test " + testNum);
	}  
	
	@After
	public void TearDown()
	{
		System.out.println("Test " + testNum + " is complete");
		testNum++;
	}
	
	@AfterClass
	public static void Cleanup()
	{
		System.out.println("THE SEQUENCE HAS COMPLETED.\nTHE END TIMES HAVE BEGUN...");
	}
	
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
	public void Test6()
	{	
		assertEquals("valid, bust", 10, b.play(10, 30));
	}
	
	@Test
	public void Test7()
	{	
		assertEquals("valid, high invalid", 0, b.play(10, 50));
	}
	
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
	
	@Test
	public void Test10()
	{	
		assertEquals("bust, low invalid", 0, b.play(30, -10));
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
