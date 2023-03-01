/* Chapter 9 - Exercise 28 | FindCommonPrefix
(Common prefix) Write a method that returns the common prefix of two strings.
For example, the common prefix of "distance" and "disinfection" is "dis". The header of the method is as follows:
public static String prefix(String s1, String s2)

If the two strings have no common prefix, the method returns an empty string.
Write a main method that prompts the user to enter two strings and display their common prefix.

*/

public class Exercise_9_28
{
	public static void main( String[] args )
	{
		String s1 = "this is s1";
		String s2 = "this is s2";
	
		System.out.printf( "Common prefix of \"%s\" and \"%s\" is \"%s\".\n" ,
							s1, s2, FindCommonPrefix( s1, s2 ) );
	}

	public static String FindCommonPrefix(String s1, String s2)
	{
		String comPre = "";
		for( int i = 0; i < s1.length(); i++ )
		{
			if( s1.charAt( i ) == s2.charAt( i ) )
				comPre += s1.charAt( i );
		}
		
		return comPre;
	}
}
