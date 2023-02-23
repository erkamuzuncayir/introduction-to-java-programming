// Chapter 9 - Exercise 17 | CountCharsWordsLines

import java.util.*;
import java.io.*;

public class Exercise_9_17
{
	public static void main( String[] args ) throws Exception
	{
		File sourceFile = new File( args[ 0 ] );
		Scanner input = new Scanner( sourceFile );
		
		int wordCount = 0;
		int charCount = 0;
		int lineCount = 0;
		
		while( input.hasNext() )
		{
			String str = input.nextLine();
			lineCount++;
			wordCount++;
			for( int i = 0; i < str.length(); i++ )
			{
				if( str.charAt( i ) == ' ' )
					wordCount++;
				else
					charCount++;
			}
		}

		System.out.println( "File " + args[ 0 ] + "has" );
		System.out.printf( "%d characters\n%d words\n%d lines\n",
							charCount, wordCount, lineCount );
	}
}