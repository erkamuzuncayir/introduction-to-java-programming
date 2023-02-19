// Chapter 9 - Exercise 4 | FindOccurenceOfAChar

import java.util.*;

public class Exercise_9_4
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter a String and a char: " );
		String inputString = input.nextLine();
		
		int charIndex = inputString.lastIndexOf( ' ' ) + 1;
		
		String str = inputString.substring( 0, charIndex - 1 );
		char reqChar = inputString.charAt( charIndex );
		
		System.out.printf( "Occurrence of %s in %s is %d times.\n",
							reqChar, str, OccurrenceCount( str, reqChar ) );
	}
	
	public static int OccurrenceCount( String str, char ch )
	{
		int occurrenceCount = 0;
		for( int i = 0; i < str.length(); i++ )
		{
			if( str.charAt( i ) == ch )
				occurrenceCount++;
		}
		
		return occurrenceCount;
	}
}