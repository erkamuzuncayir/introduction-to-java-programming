// Chapter 9 - Exercise 7 | PhoneKeypadSimulator

import java.util.*;

public class Exercise_9_7
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.print( "Please enter a phone number as a string: " );
		String str = input.nextLine();
		
		
		System.out.printf( "The number is %s", ConvertToNumber( str ) );
	}
	
	public static String ConvertToNumber( String str )
	{
		for( int i = 0; i < str.length(); i++ )
		{
			if( Character.isLetter( str.charAt( i ) ) )
			{
				str = str.replaceAll( String.valueOf( str.charAt( i ) ), 
										String.valueOf( GetNumber( str.charAt( i ) ) ) );
			}
		}
		
		return str;
	}
	
	public static int GetNumber( char ch )
	{
		if( ch == 'a' || ch == 'b' || ch == 'c' )
			return 2;
		else if( ch == 'd' || ch == 'e' || ch == 'f' )
			return 3;
		else if( ch == 'g' || ch == 'h' || ch == 'i' || ch == 'ı' )
			return 4;
		else if( ch == 'j' || ch == 'k' || ch == 'l' )
			return 5;
		else if( ch == 'm' || ch == 'n' || ch == 'o' )
			return 6;
		else if( ch == 'p' || ch == 'q' || ch == 'r' || ch == 's' )
			return 7;
		else if( ch == 't' || ch == 'u' || ch == 'v' )
			return 8;
		else if( ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z' )
			return 9;
		else
			return 0;
	}
}