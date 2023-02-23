// Chapter 9 - Exercise 14_b | SumOfIntegersUnifiedArg

public class Exercise_9_14_b
{
    public static void main( String[] args ) 
    {
		// Separates args into new string array.
		String[] input_nums = args[ 0 ].split( " " );
		int sumOfArgs = 0;
		
		for( int i = 0; i < input_nums.length; i++ )
			sumOfArgs += Integer.parseInt( input_nums[ i ] );
		
		System.out.printf( "The sum of args is %d.\n" , sumOfArgs );
	}
}