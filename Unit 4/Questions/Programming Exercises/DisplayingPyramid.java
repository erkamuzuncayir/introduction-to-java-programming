// Unit 4 - Exercise 17

import java.util.Scanner;

public class DisplayingPyramid
{
	public static void main ( String[] args )
	{
		// Creates a Scanner
		Scanner input = new Scanner ( System.in );
		
		// Prompts the user to enter a number for pyramid floor
		System.out.print( "How many floor will be pyramid? " );
		int pyramidFloor = input.nextInt();
		
		// Creates rows
		for ( int row = 1 ; row <= pyramidFloor ; row++ )
		{
		
			// Prints spaces
			for ( int space = 0 ; space < pyramidFloor - row  ; space++ )
			{
				System.out.print("\t");
			}
			
			// Prints decremantally numbers
			for ( int preNumber = row ; preNumber >= 1 ; preNumber-- )
			{
				System.out.print( preNumber + "\t" );
			}
			
			// Prints incrementally numbers
			for ( int postNumber = 2 ; postNumber <= row ; postNumber++)
			{
				System.out.print( postNumber + "\t" );
			}
			
			// Prints new line
			System.out.println();
		}
	}
}
