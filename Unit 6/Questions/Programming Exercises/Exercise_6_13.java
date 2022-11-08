// Unit 6 - Exercise 13

public class Exercise_6_13 // RandomNumberChoose
{
	public static void main( String[] args )
	{
		final int Below_Limit = 1;
		final int Above_Limit = 54;
		
		int randomNumber = GetRandomNumber( new int[ Above_Limit - Below_Limit - 1 ] );
		
		System.out.printf( "Random number is: %d\n" , randomNumber );
	}
	
	public static int GetRandomNumber( int... numbers )
	{
		return 2 /* Excludes 0 and 1 */ + ( int )( Math.random() * numbers.length );
	}
}
