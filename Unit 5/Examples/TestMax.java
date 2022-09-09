// Unit 5 - Listing 1

public class TestMax
{
	// Main method
	public static void main( String[] args )
	{
		int i = 5;
		int j = 2;
		int k = max( i , j );
		System.out.printf( "The maximum between %d and %d is %d\n" , i , j , k );
	}

	// Returns the max between two numbers	
	public static int max( int num1 , int num2 ) 
	{
		int result;
		
		if ( num1 > num2 )
			result = num1;
		else
			result = num2;
			
		return result;
	}
}
