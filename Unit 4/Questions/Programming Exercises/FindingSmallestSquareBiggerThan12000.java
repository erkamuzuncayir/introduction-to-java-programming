// Unit 4 - Exercise 12

public class FindingSmallestSquareBiggerThan12000
{
	public static void main ( String[] args )
	{
		double number = 0;
		double squareOfNumber = 0;
		
		// Determines numbers
		while ( squareOfNumber < 12000 )
		{
			number++;
			squareOfNumber = Math.pow ( number , 2 );
		}
		
		// Displays result
		System.out.printf( "%.0f is the smallest number that its square bigger than 12000\n" , number );
	}
}
