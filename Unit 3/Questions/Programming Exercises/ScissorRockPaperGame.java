// Unit 3 - Exercise 17

import java.util.Scanner;

public class ScissorRockPaperGame
{
	public static void main( String[] args ) 
	{
		// Creates a Scanner
		Scanner input = new Scanner( System.in );
		
		// Chooses a random number
		int num = ( int )( ( Math.random() * 3 ) );

		// Prompts the user to enter whetheter scissor, rock or paper
		System.out.print( "scissor (0), rock (1), paper (2): " );
		int answer = input.nextInt();
		
		// Determines winner
		if ( ( num == 0 ) && ( answer == 0 ) )
			System.out.print( "The computer is scissor. You are scissor too. It is a draw!" );
		if ( ( num == 0 ) && ( answer == 1 ) )
			System.out.print( "The computer is scissor. You are rock. You win!" );
		if ( ( num == 0 ) && ( answer == 2 ) )
			System.out.print( "The computer is scissor. You are paper. You lose!" );
		if ( ( num == 1 ) && ( answer == 0 ) )
			System.out.print( "The computer is rock. You are scissor. You lose!" );
		if ( ( num == 1 ) && ( answer == 1 ) )
			System.out.print( "The computer is rock. You are rock too. It is a draw!" );
		if ( ( num == 1 ) && ( answer == 2 ) )
			System.out.print( "The computer is rock. You are paper. You win!" );
		if ( ( num == 2 ) && ( answer == 0 ) )
			System.out.print( "The computer is paper. You are scissor. You win!" );
		if ( ( num == 2 ) && ( answer == 1 ) )
			System.out.print( "The computer is paper. You are rock too. You lose!" );
		if ( ( num == 2 ) && ( answer == 2 ) )
			System.out.print( "The computer is paper. You are paper. It is a draw!" );
	}
}