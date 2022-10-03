// Unit 5 - Exercise 32

public class PlayCraps10000Times
{
	public static void main( String[] args )
	{
		int winCount = 0;
		for( int i = 0 ; i < 10000 ; i++ )
		{
			winCount += PlayCraps( 0 );
		}
		
		System.out.printf( "You have played 10000 times Craps and you have won %d times against PC.\n" , winCount );
	}
	
	public static int PlayCraps( int point )
	{
		int dice1 = RollDice();
		int dice2 = RollDice();
		int sumOfDice = dice1 + dice2;
		int winCount = 0;
		
		if( sumOfDice == 7 || sumOfDice == 11 ) // Win condition
			winCount++;
		else
		{
			point = sumOfDice;
			sumOfDice = 0;
			while( sumOfDice != 7 && sumOfDice != point )
			{
				dice1 = RollDice();
				dice2 = RollDice();
				sumOfDice = dice1 + dice2;
			}
			if( sumOfDice == point ) // Win condition
				winCount++;
		}
		
		return winCount;
	}
	
	public static int RollDice()
	{
		return ( int )( Math.random() * 6 + 1 );
	}
	
}
