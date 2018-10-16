package com.qa.Blackjack;

public class Blackjack 
{
	public int play(int player, int dealer)
	{
		
		/*
		 * //check for invalid input
		if(player > 30 || player < 1)
		{
			return 0;
		}
		else if(dealer > 30 || dealer < 1)
		{
			return 0;
		}
		*/
		
		//check for bust
		if(player > 21 && dealer <= 21)
		{
			return dealer;
		}
		else if(dealer > 21 && player <= 21)
		{
			return player;
		}
		else if(player > 21 && dealer > 21)
		{
			return 0;
		}
		
		//do comparator
		if(player > dealer)
		{
			return player;
		}
		else
		{
			return dealer;
		}
		
	}
}
