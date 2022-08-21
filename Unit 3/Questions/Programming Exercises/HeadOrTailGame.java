// Unit 3 - Exercise 14

import java.util.Scanner;

public class HeadOrTailGame
{
	public static void main( String[] args ) 
	{
		// Creates a Scanner
		Scanner input = new Scanner( System.in );
		
		// Creates a random number
		int num = ( int )( System.currentTimeMillis() % 2 );
		int result = ( num == 1 ) ? 1 : 0;

		// Prompts the user to choose head or tail
		System.out.print( "Enter 1 for head, 0 for tail" );
		int answer = input.nextInt();

		// Displays result
		if( result == answer )
			System.out.println( "You win!" );
		else
			System.out.println( "You lose!" );
	}
}