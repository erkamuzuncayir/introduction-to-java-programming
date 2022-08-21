// Unit 2 - Exercise 18

public class PrintATable
{
	public static void main( String[] args ) 
	{
		var a = 1;
		var b = 2;
		
		// Printing table
		System.out.println( "a   b   pow(a, b)" );
		
		System.out.println( a + "   " + b + "   " + ( int ) Math.pow( a , b ) );
		a++;
		b++;
		
		System.out.println( a + "   " + b + "   " + ( int ) Math.pow( a , b ) );
		a++;
		b++;
		
		System.out.println( a + "   " + b + "   " + ( int ) Math.pow( a , b ) );
		a++;
		b++;
		
		System.out.println( a + "   " + b + "   " + ( int ) Math.pow( a , b ) );
		a++;
		b++;
		
		System.out.println( a + "   " + b + "   " + ( int ) Math.pow( a , b ) );
		a++;
		b++;
	}
}