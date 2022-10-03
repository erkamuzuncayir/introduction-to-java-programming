// Unit 5 - Exercise 6

import java.util.Scanner;

public class DisplayPattern
{
	public static void main( String[] args )
	{
		int row = 11;
		
		DisplayPattern( row );
	}
	
	public static void DisplayPattern( int n )
	{
		for( int i = 1 ; i <= n ; i++ ) // Creates rows
		{
			
			for( int k = 1 ; k <= n - i ; k++ ) // Prints spaces
			{
				System.out.print( "\t" );
			}
			
			for( int j = i ; j > 0 ; j-- )
			{
				System.out.print( "\t" + j ); // Prints numbers
			}
			
			System.out.println();
		}
		
	}
}
