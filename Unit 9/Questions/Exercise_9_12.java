// Chapter 9 - Exercise 12 | CheckIfAnagram

import java.util.*;

public class Exercise_9_12
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter two string: " );
		String inputString = input.nextLine();

		int indexOfSpace = inputString.indexOf( ' ' );
		String s1 = inputString.substring( 0, indexOfSpace );
		String s2 = inputString.substring( indexOfSpace + 1, inputString.length() );
		
		System.out.printf( "%s and %s are %s", s1, s2,
							( IsAnagram( s1, s2 ) ? 
							"anagram.\n" : "not anagram.\n") );
	}
	
	public static boolean IsAnagram( String s1, String s2 )
	{
		String sortedStr1 = SortString( s1 );
		String sortedStr2 = SortString( s2 );
		
		if( sortedStr1.length() != sortedStr2.length() )
			return false;
		
		for( int i = 0; i < sortedStr1.length(); i++ )
		{
			if( sortedStr1.charAt( i ) != sortedStr2.charAt( i ) )
				return false;
		}
		
		return true;
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
