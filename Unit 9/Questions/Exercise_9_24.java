// Chapter 9 - Exercise 24 | MyString2

import java.util.*;

/*
public MyString2(String s);
public int compare(String s);
public MyString2 substring(int begin);
public MyString2 toUpperCase();
public char[] toChars();
public static MyString2 valueOf(boolean b);
*/

public class Exercise_9_24
{
	public static void main( String[] args )
	{
		MyString2 s1 = new MyString2( "this is modified one." );
		String s2 = new String( "this is string one." );
	
		System.out.println( s1.compare( s2 ) );
		
		s1.substring( 4 ).println();
		
		s1.toUpperCase().println();
		
		char[] chars = s1.toChars();
		for( int i = 0; i < chars.length; i++ )
			System.out.println( chars[ i ] );
	
		MyString2.valueOf( true ).println();
		
	}
}