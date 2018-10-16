package com.qa.Blackjack;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner 
{
	public static void main (String[] args)
	{
		TestRunner.allTests();
	}
	
	public static void allTests()
	{
		Result result = JUnitCore.runClasses(TestSuit1.class, InvalidBustSuite.class);
		
		System.out.println("All results passed: " + result.wasSuccessful());
		
		if(!result.wasSuccessful())
		{
			System.out.println("THE SEQUENCES THAT WERE NOT UP TO PAR");
			for(Failure failure: result.getFailures())
			{
				System.out.print(failure.getMessage() + "\n");
			}
		}
		
	}

}
