// Chapter 9 - Exercise_9_29 | SplitWithDelimiter

public class Exercise_9_29
{
	public static void main( String[] args )
	{
		String s = "parse#me!if#!you#can!";
		String regex = "#!";
		String[] splitted_with_delimiters = SplitWithDelimiter( s, regex );

		for( int i = 0; i < splitted_with_delimiters.length; i++ )
			System.out.println( splitted_with_delimiters[ i ] );
	}
	
	public static String[] SplitWithDelimiter( String s, String rgx )
	{
		// Create an array can hold all of chars of both string
		String[] splitted_string = new String[ s.length() + rgx.length() ];
		// For figure out how much element actually needed
		int lastIndex = 0;
		// For hold index of last found delimiter
		int lastFoundIndex = 0;
		
		for( int i = 0; i < s.length(); i++ )
		{
			for( int j = 0; j < rgx.length(); j++ )
			{
				if( s.charAt( i ) == rgx.charAt( j ) )
				{
					// This check for the times delimiters came after each other
					if( lastFoundIndex == i )
						splitted_string[ lastIndex ] = s.substring( lastFoundIndex, i );
					else
						splitted_string[ lastIndex++ ] = s.substring( lastFoundIndex, i );
	
					splitted_string[ lastIndex++ ] = s.charAt( i ) + "";
					lastFoundIndex = i + 1;
				}
			}
		}
		
		// Trim non-used parts
		String[] splitted_trimmed_string = new String[ lastIndex ];
		for( int i = 0; i < splitted_trimmed_string.length; i++ )
			splitted_trimmed_string[ i ] = splitted_string[ i ];
		
		return splitted_trimmed_string;
	}	
}
