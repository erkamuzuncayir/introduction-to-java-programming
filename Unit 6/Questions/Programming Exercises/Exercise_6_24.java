// Unit 6 - Exercise 24

import java.util.Arrays;

public class Exercise_6_24 // CouponCollectorsProblemSolution
{
	public static void main( String[] args )
	{
		int[] deckOfCards = new int[ 52 ];
		int[] pickedCards = new int[ 52 ];
		String[] suits = { "Spades" , "Hearts" , "Diamonds" , "Clubs" };
		String[] ranks = { "Ace" , "2" , "3" , "4" , "5" , "6" , "7" ,
							"8" , "9" , "10" , "Jack" , "Queen" , "King" };
		int foundCount = 0;
		int cardNumber = 0;
		
		for( int i = 0 ; i < deckOfCards.length ; i++ )
			deckOfCards[ i ] = i;

		/*
		*	Info: Because suits values between 0 and 4 and default array value 0.
		*	If we don't fill pickedCars numbers other than between 0 and 4, 
		*	we can't determine which card we choose, correctly. 
		*/
		Arrays.fill( pickedCards , -1 ); 
		
		int[] shuffledDeckOfCards = ShuffleCards( deckOfCards );
		
		while( foundCount < 4 )
		{
			int pickedCardSuit = deckOfCards[ cardNumber ] / 13;	
			if( !IsDuplicate( pickedCards , pickedCardSuit ) )
			{
				System.out.printf("%s of %s\n" , ranks[ deckOfCards[ cardNumber ] % 13 ] , 
												suits[ deckOfCards[ cardNumber ] / 13 ] );
				foundCount++;
			}
			
			pickedCards[ cardNumber ] = pickedCardSuit;
			
			cardNumber++;
		}
		// Why: In while loop added extra 1 to cardNumber, so it's subtracting it.
		System.out.printf( "Number of picks: %d\n" , cardNumber - 1 ); 
	}
	
	public static boolean IsDuplicate( int[] values , int key )
	{
		
		for( int i = 0 ; i < values.length ; i++ )
		{
			if( key == values[ i ] )	
				return true;
		}
		
		return false;
	} 
	
	public static int[] ShuffleCards( int[] deckOfCards )
	{
		for( int i = 0 ; i < deckOfCards.length ; i++ )
		{
			int index = ( int )( Math.random() * deckOfCards .length );
			int tempIndex = deckOfCards[ i ];
			deckOfCards[ i ] = deckOfCards[ index ];
			deckOfCards[ index ] = tempIndex;
		}
		
		return deckOfCards;
	}

	
}
