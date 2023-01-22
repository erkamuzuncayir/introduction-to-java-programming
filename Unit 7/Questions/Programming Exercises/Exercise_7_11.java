// Unit 7 - Exercise 11

import java.util.Scanner;

public class Exercise_7_11 // SimulateNineHeadsAndTails
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		int[][] head_and_tails = new int[ 3 ][ 3 ];
		System.out.print( "Enter a number between 0 and 511: " );
		int number = input.nextInt();
		
		/*	Convert number to binary and insert to array
		*	Why: Decreasing order -> We want to the binary number starts from right in array, not from left.*/
		for( int i = head_and_tails.length - 1; number > 0; i-- )
		{
			for( int j = head_and_tails[ 0 ].length - 1; j >= 0; j-- )
			{
				head_and_tails[ i ][ j ] = number % 2;
				number /= 2;
			}
		}
		
		// Prints all states
		for( int i = 0; i < head_and_tails.length; i++ )
		{
			for( int j = 0; j < head_and_tails[ 0 ].length; j++ )
			{
				if( head_and_tails[ i ][ j ] == 0 )
					System.out.print( "H " );
				else
					System.out.print( "T " );
			}
			
			System.out.println();
		}
	}
}
