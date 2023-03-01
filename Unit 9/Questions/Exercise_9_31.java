/* Chapter 9 - Exercise 31 | PlayHangman

(Game: hangman) Write a hangman game that randomly generates a word and
prompts the user to guess one letter at a time, as shown in the sample run. Each
letter in the word is displayed as an asterisk. When the user makes a correct
guess, the actual letter is then displayed. When the user finishes a word, display
the number of misses and ask the user whether to continue for another word.
Declare an array to store words, as follows:
// Use any words you wish
String[] words = {"write", "that", ...};

(Guess) Enter a letter in word ******* > p
(Guess) Enter a letter in word p****** > r
(Guess) Enter a letter in word pr**r** > p
p is already in the word
(Guess) Enter a letter in word pr**r** > o

Do you want to guess for another word? Enter y or n>

*/

import java.util.Scanner;

public class Exercise_9_31
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		String[] words = { "fair", "horseshoe", "infrastructure", "record", 
							"pardon", "concede", "cap", "cheat", "nature" };
		String[] used_words = new String[ words.length ];
		
		// Keep playing until player say "n".
		boolean keepPlay = true;
		while( keepPlay )
		{
			StringBuilder askedWord;
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
			StringBuilder hiddenString = "";
			for( int i = 0; i < askedWord.length(); i++ )
				hiddenString.append( "*" );
			
			// Guess start from here
			boolean guessContinue = true;
			while( guessContinue )
			{
				System.out.println( "(Guess) Enter a letter in word %s > ", hiddenString.toString() );
				String guess = input.nextLine();
				for( int i = 0; i < askedWord.length(); i++ )
				{
					if( askedWord.substring( i, i + 1 ).equals( guess ) )
					{
						askedWord.replace( i, i + 1, * );
						hiddenString.replace( i, i + 1, guess );
					}
				}
			}
		}
		
		
	
	}

	public 
}
