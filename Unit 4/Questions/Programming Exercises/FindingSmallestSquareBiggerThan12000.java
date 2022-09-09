// Unit 4 - Exercise 12

public class FindingSmallestSquareBiggerThan12000
{
	public static void main ( String[] args )
	{
		int number = 0;
		int squareOfNumber = 0;
		
		// Determines numbers
		while ( squareOfNumber < 12000 )
		{
			number++;
			squareOfNumber = ( int ) Math.pow ( number , 2 );
		}
		
		int result = number; 
	
		// Displays result
		System.out.printf( "%d is the smallest number that its square bigger than 12000\n" , result );
	}
}
