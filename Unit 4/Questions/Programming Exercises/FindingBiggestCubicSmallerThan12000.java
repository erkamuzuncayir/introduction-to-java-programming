// Unit 4 - Exercise 13

public class FindingBiggestCubicSmallerThan12000
{
	public static void main ( String[] args )
	{
		double number = 0;
		double cubicOfNumber = 0;
		
		// Determines numbers
		while ( cubicOfNumber < 12000 )
		{
			number++;
			cubicOfNumber = Math.pow ( number , 3 );
		}
		
		// Displays result
		System.out.printf( "%.0f is the biggest number that its cubic smaller than 12000\n" , number - 1 );
	}
}
