// Chapter 9 - Exercise 14_a | SumOfIntegersSeparateArgs

public class Exercise_9_14_a
{
    public static void main( String[] args ) 
    {
		int sumOfArgs = 0;
		
		for( int i = 0; i < args.length; i++ )
			sumOfArgs += Integer.parseInt( args[ i ] );
		
		System.out.printf( "The sum of args is %d.\n" , sumOfArgs );
	}
}