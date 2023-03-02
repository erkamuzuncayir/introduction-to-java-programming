// Chapter 9 - Exercise 31 | PlayHangman

import java.io.File;
import java.util.Scanner;

public class Exercise_9_33
{
	public static void main( String[] args ) throws Exception
	{
		// Scanner for player input
		Scanner input = new Scanner( System.in );
		// File and scanner for getting input from file
		File sourceFile = new File( args[ 0 ] );
		Scanner inputFile = new Scanner( sourceFile );
		String[] words = inputFile.nextLine().split( " " );
		String[] used_words = new String[ words.length ];
		
		// Keep playing until player say "n".
		boolean keepPlay = true;
		while( keepPlay )
		{
			StringBuilder askedWord = new StringBuilder( "" );
			// Check for not use same word again
			boolean wordIsOk = true;
			do
			{
				askedWord.append( words[ ( int )( Math.random() * words.length ) ] );
				for( int i = 0; i < used_words.length; i++ )
				{
					for( int j = 0; j < words.length; j++ )
					{
						if( used_words[ i ] == words[ j ] )
						{
							wordIsOk = false;
							askedWord.delete( 0, askedWord.length() );
						}
					}
				}
			}while( !wordIsOk );
				 
			// Create hidden string
			StringBuilder hiddenString = new StringBuilder( "" );
			for( int i = 0; i < askedWord.length(); i++ )
				hiddenString.append( "*" );
			
			int remainingLetter = askedWord.length(); 
			// Guess start from here
			boolean guessContinue = true;
			while( guessContinue )
			{
				if( remainingLetter == 0 )
				{
					guessContinue = false;
					System.out.printf( "Word was \"%s\".\n", hiddenString );
					// If player doesn't want anymore it ends program.
					System.out.println( "Do you want to guess for another word? Enter y or n> " );
					String ans = input.nextLine();
					if( ans.equals( "n" ) )
						keepPlay = false;
					else if( ans.equals( "y" ) )
						keepPlay = true;

					break;
				}
				// Starts to ask a guess 
				System.out.printf( "(Guess) Enter a letter in word %s > ", hiddenString.toString() );
				String guess = input.nextLine();
				for( int i = 0; i < hiddenString.length(); i++ )
				{
					if( hiddenString.substring( i, i + 1 ).equals( guess ) )
					{
						System.out.printf( "%s is already in the word.\n", guess );
						continue;
					}
				}

				// If matched it switches chars from printed hidden and check string
				for( int i = 0; i < askedWord.length(); i++ )
				{
					if( askedWord.substring( i, i + 1 ).equals( guess ) )
					{
						askedWord.replace( i, i + 1, "*" );
						hiddenString.replace( i, i + 1, guess );
						remainingLetter--;
					}
				}
			}
		}
	}

}
