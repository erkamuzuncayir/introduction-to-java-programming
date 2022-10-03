// Unit 5 - Exercise 22

public class ApproximateSquareRoot
{
	public static void main( String[] args )
	{
		double number = 5;
		double squareRootOfNumber = FindSquareRoot( number , number );
	
		System.out.printf( "Square root of %.2f is %.2f" , number , squareRootOfNumber );  
	}
	
	public static double FindSquareRoot( double number , double lastGuess )
	{
		// Square root formula
		double nextGuess = ( lastGuess + ( number / lastGuess ) ) / 2;
		
		// If difference is less than 0.0001 returns number 
		if( Math.abs( nextGuess - lastGuess ) > 0.0001 )
			return FindSquareRoot( number , nextGuess );
		// If not, returns method itself
		else
			return nextGuess;
	}
}
