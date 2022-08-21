// Unit 4 - Exercise 34

import java.util.Scanner;

public class ScissorRockPaper
{
	public static void main ( String[] args )
	{
		// Creates a Scanner
		Scanner input = new Scanner ( System.in );
		int userWinCount = 0;
		int computerWinCount = 0;

		while ( true )
		{
			// Prompts to user to choose scissor, rock or paper
			System.out.print( "Please choose one of scissor (0), rock (1), paper (2): " );
			int userChoice = input.nextInt();
		
			// Generates computer choice and displays result
			int computerChoice = ( int )( ( Math.random() * 10 ) % 3 );
		
			if ( ( computerChoice == 0 ) && ( userChoice == 0 ) )
				System.out.println( "The computer is scissor. You are scissor too. It is a draw!" );
			if ( ( computerChoice == 0 ) && ( userChoice == 1 ) )
			{
				System.out.println( "The computer is scissor. You are rock. You win!" );
				userWinCount++;
			}
			if ( ( computerChoice == 0 ) && ( userChoice == 2 ) )
			{
				System.out.println( "The computer is scissor. You are paper. You lose!" );
				computerWinCount++;
			}	
			if ( ( computerChoice == 1 ) && ( userChoice == 0 ) )
			{
				System.out.println( "The computer is rock. You are scissor. You lose!" );
				computerWinCount++;
			}
			if ( ( computerChoice == 1 ) && ( userChoice == 1 ) )
				System.out.println( "The computer is rock. You are rock too. It is a draw!" );
			if ( ( computerChoice == 1 ) && ( userChoice == 2 ) )
			{
				System.out.println( "The computer is rock. You are paper. You win!" );
				userWinCount++;
			}
			if ( ( computerChoice == 2 ) && ( userChoice == 0 ) )
			{
				System.out.println( "The computer is paper. You are scissor. You win!" );
				userWinCount++;
			}
			if ( ( computerChoice == 2 ) && ( userChoice == 1 ) )
			{
				System.out.println( "The computer is paper. You are rock. You lose!" );
				computerWinCount++;
			}
			if ( ( computerChoice == 2 ) && ( userChoice == 2 ) )
				System.out.println( "The computer is paper. You are paper too. It is a draw!" );
			if ( userWinCount > 1 )
			{
				System.out.println( "You reached 2 win. You win the game!" );
					break;
			}
			else if ( computerWinCount > 1 )
			{
				System.out.println( "Computer reached 2 win. You lose the game!" );
					break;
			}
		}
	}
}
		
		
		
		
