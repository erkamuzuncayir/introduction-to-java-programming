// Unit 7 - Listing 1

import java.util.Scanner;

public class PassTwoDimensionalArray
{
	public static void main( String[] args )
	{
		// Create a Scanner
		Scanner input = new Scanner( System.in );
		
		// Enter arra values
		int[][] m = new int[ 3 ][ 4 ];
		System.out.printf( "Enter %d rows and %d columns: \n" , m.length , m[ 0 ].length );
		for( int i = 0; i < m.length; i++ )
			for( int j = 0; j < m[ i ].length; j++ )
				m[ i ][ j ] = input.nextInt();
				
		/*	Display result
		*	Why: If I use printf, the method call isn't assigning the return value 
			to the inside of the print statement.*/
		System.out.println( "\nSum of all elements is \n" + Sum( m ) );
	}
	
	public static int Sum( int[][] m )
	{
		int total = 0;
		for( int row = 0; row < m.length; row++ )
			for( int column = 0; column < m[ row ].length; column++ )
				total += m[ row ][ column ];
		
		return total;
	}
}
