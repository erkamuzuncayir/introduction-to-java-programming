// Chapter 9 - Exercise 24 | MyString2

/*
public MyString2(String s);
public int compare(String s);
public MyString2 substring(int begin);
public MyString2 toUpperCase();
public char[] toChars();
public static MyString2 valueOf(boolean b);
*/

public class MyString2
{
	String internedString;
	
	public MyString2( String s )
	{
		internedString = s;
	}
	
	public int compare( String s )
	{
		int result = 0;
		
		if( internedString.length() > s.length() )
			result--;
		else if( internedString.length() < s.length() )
			result++;
		
		return result;
	}
	
	public MyString2 substring( int begin )
	{
		return new MyString2( internedString.substring( begin ) );
	}
	
	public MyString2 toUpperCase()
	{
		return new MyString2( internedString.toUpperCase() );
	}
	
	public char[] toChars()
	{
		char[] chars = new char[ internedString.length() ];
		for( int i = 0; i < chars.length; i++ )
		{
			chars[ i ] = internedString.charAt( i );
		}		
		
		return chars;
	}

	public static MyString2 valueOf( boolean b )
	{
		if( b )
			return new MyString2( "true" );
		else
			return new MyString2( "false" );
	}
	
	public void println()
	{
		for( int i = 0; i < internedString.length(); i++ )
		{
			System.out.print( internedString.charAt( i ) );
		}
		
		System.out.println();
	}
}
