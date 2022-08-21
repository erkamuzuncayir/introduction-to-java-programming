// Unit 3 - Exercise 24

import java.util.Scanner;

public class PickingCardGame
{
	public static void main( String[] args ) 
	{
		// Creates a Scanner
		Scanner input = new Scanner( System.in );
		String suit = "";
		String rank = "";
		
		// Prompts the user to choose a suit and a rank
		System.out.print( "Pick a number between 0 - 5: " );
		int suitNumber = input.nextInt();
		System.out.print( "Pick a number between 0 - 14: " );
		int rankNumber = input.nextInt();
		
		// Determines card according to inputs
		switch( suitNumber )
		{
			case 1:
				suit = "Clubs";
				break;
			case 2:
				suit = "Diamonds";
				break;
			case 3:
				suit = "Hearts";
				break;
			case 4:
				suit = "Spades";
				break;
		}
		switch( rankNumber )
		{
			case 1:
				rank = "Ace";
				break;
			case 2:
				rank = "2";
				break;
			case 3:
				rank = "3";
				break;
			case 4:
				rank = "4";
				break;
			case 5:
				rank = "5";
				break;
			case 6:
				rank = "6";
				break;
			case 7:
				rank = "7";
				break;
			case 8:
				rank = "8";
				break;
			case 9:
				rank = "9";
				break;
			case 10:
				rank = "10";
				break;
			case 11:
				rank = "Jack";
				break;
			case 12:
				rank = "Queen";
				break;
			case 13:
				rank = "King";
				break;
		}
		// Displays result
		System.out.printf( "The card you picked is %s of %s", rank, suit );
	}
}