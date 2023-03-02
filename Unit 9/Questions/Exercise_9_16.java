// Chapter 9 - Exercise 16 | ReformatSourceCodeToEndLine

import java.util.*;
import java.io.*;

public class Exercise_9_16
{
	public static void main( String[] args ) throws Exception
	{
		File sourceFile = new File( args[ 0 ] );
		Scanner input = new Scanner( sourceFile );
		StringBuilder strBld = new StringBuilder();
		
		while( input.hasNext() )
		{
			strBld.append( input.nextLine() );
		}
		
		/* It starts from -1 because 
			when if it have one bracket we don't use \t.*/
		int bracketCount = -1;
		for( int i = 0; i < strBld.length(); i++ )
		{
			if( strBld.charAt( i ) == '{' )
			{
				strBld.insert( ++i, "\n" );
				bracketCount++;
			}
			else if( strBld.charAt( i ) == '}' )
			{
				strBld.insert( i++, "\n" );
				for( int j = 0; j < bracketCount; j++ )
					strBld.insert( i++, "\t" );

				bracketCount--;
			}
		}
		PrintWriter output = new PrintWriter( sourceFile );
		output.println( strBld.toString() );
		output.close();
	}
}
