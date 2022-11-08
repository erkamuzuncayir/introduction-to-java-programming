// Unit 6 - Exercise 29

public class Exercise_6_29 // PickCardGame
{
	public static void main( String[] args )
	{
		int[] deckOfCards = new int[ 52 ];
		int[] pickedCards = new int[ 4 ];
		String[] suits = { "Spades" , "Hearts" , "Diamonds" , "Clubs" };
		String[] ranks = { "Ace" , "2" , "3" , "4" , "5" , "6" , "7" ,
							"8" , "9" , "10" , "Jack" , "Queen" , "King" };
		int count = 0;
		boolean isThereSolution = false;
		for( int i = 0 ; i < deckOfCards.length ; i++ )
			deckOfCards[ i ] = i;
		
		// Picks cards randomly
		for( int i = 0 ; i < pickedCards.length ; i++ )
			pickedCards[ i ] = deckOfCards[ GetRandomNumber( 0 , deckOfCards.length ) ];
		
		for( int i = 0 ; i < pickedCards.length ; i++ )
		{
			for( int j = 0; j < pickedCards.length ; j++ )
			{
				if( i == j )
					continue;
				// Adds +1 because array index and real value difference
				boolean isTwentyFour = ( ( pickedCards[ i ] % 13 ) + 1 ) + 
										( ( pickedCards[ j ] % 13 ) + 1 ) == 24 ? 
										true:
										false; 
				if( isTwentyFour )
				{
					isThereSolution = true;
					System.out.printf("%s of %s + %s of %s = 24\n" , ranks[ deckOfCards[ pickedCards[ i ] ] % 13 ] , 
																	suits[ deckOfCards[ pickedCards[ i ] ] / 13 ] , 
																	ranks[ deckOfCards[ pickedCards[ j ] ] % 13 ] , 
																	suits[ deckOfCards[ pickedCards[ j ] ] / 13 ] );
				}
			}		
		}
		if( !isThereSolution )
			System.out.println("The combination of none of the 4 cards is 24.");
	}
	
	public static int GetRandomNumber( int minNumber , int maxNumber )
	{
		return ( int )( minNumber + Math.random() * ( maxNumber ) );
	}	
}

/*

for( int i = 0 ; i < deckOfCards.length ; i++ )
		{
			for( int j = 0; j < deckOfCards.length ; j++ )
			{
				// Adds +1 because array index and real value difference
				boolean isTwentyFour = ( ( deckOfCards[ i ] % 13 ) + 1 ) + 
										( ( deckOfCards[ j ] % 13 ) + 1 ) == 24 ? 
										true:
										false; 
				if( isTwentyFour )
					System.out.printf("%s of %s + %s of %s = 24\n" , ranks[ deckOfCards[ i ] % 13 ] , 
																	suits[ deckOfCards[ i ] / 13 ] , 
																	ranks[ deckOfCards[ j ] % 13 ] , 
																	suits[ deckOfCards[ j ] / 13 ] );
			}
			
			*/
