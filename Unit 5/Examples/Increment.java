// Unit 5 - Listing 4

public class Increment
{
	public static void main( String[] args )
	{
		int x = 1;
		System.out.printf( "Before the call, x is %d \n" , x );
		increment( x );
		System.out.printf( "after the call, x is %d \n" , x );
	}
	
	public static void increment( int n )
	{
		n++;
		System.out.printf( "n inside the method is %d\n" , n );
	}
}
