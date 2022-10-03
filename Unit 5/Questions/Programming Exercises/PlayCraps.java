// Unit 5 - Exercise 29

public class PlayCraps
{
	public static void main( String[] args )
	{
		PlayCraps( 0 );
	}
	
	public static void PlayCraps( int point )
	{
		int dice1 = RollDice();
		int dice2 = RollDice();
		int sumOfDice = dice1 + dice2;
		
		if( sumOfDice == 7 || sumOfDice == 11 ) // Win condition
			System.out.printf( "You rolled %d + %d = %d\nYou win!" , dice1 , dice2 , sumOfDice );
		else if( sumOfDice == 2 || sumOfDice == 3 || sumOfDice == 12 ) // Lose condition
			System.out.printf( "You rolled %d + %d = %d\nYou lose!" , dice1 , dice2 , sumOfDice );
		else // Tie condition
		{
			System.out.printf( "Point is %d\n" , sumOfDice );
			point = sumOfDice;
			sumOfDice = 0;
			while( sumOfDice != 7 && sumOfDice != point )
			{
				dice1 = RollDice();
				dice2 = RollDice();
				sumOfDice = dice1 + dice2;
			}
			if( sumOfDice == 7 ) // Lose condition
				System.out.printf( "You rolled %d + %d = %d\nYou lose!" , dice1 , dice2 , sumOfDice );
			else if( sumOfDice == point ) // Win condition
				System.out.printf( "You rolled %d + %d = %d\nYou win!" , dice1 , dice2 , sumOfDice );
		}
	}
	
	public static int RollDice()
	{
		return ( int )( Math.random() * 6 + 1 );
	}
	
}
