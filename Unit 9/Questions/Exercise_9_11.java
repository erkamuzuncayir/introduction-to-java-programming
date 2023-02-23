// Chapter 9 - Exercise 11 | SortCharactersInString

import java.util.*;

public class Exercise_9_11
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter a string: " );
		String str = input.nextLine();
		
		System.out.printf( "Sorted string is %s", SortString( str ) ); 
	}
	
	public static String SortString( String str )
	{
		StringBuilder sortedStr = new StringBuilder( str );

		for( int j = 0; j < sortedStr.length(); j++ )
		{
			for( int i = 1; i < sortedStr.length(); i++ )
			{
				if( sortedStr.charAt( i - 1 ) > sortedStr.charAt( i ) )
				{
					char lower = sortedStr.charAt( i );
					char higher = sortedStr.charAt( i - 1 );
					sortedStr.setCharAt( i, higher );
					sortedStr.setCharAt( i - 1, lower );
				}
			}
		}
		
		return sortedStr.toString();
	}
}