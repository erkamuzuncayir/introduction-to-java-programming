// Chapter 9 - Exercise 21 | RemoveText

import java.io.*;
import java.util.*;

public class Exercise_9_21
{
	public static void main( String[] args ) throws Exception
	{	
		File sourceFile = new File( args[ 0 ] );
		// Create a scanner for input and a PrintWriter for output
		Scanner input = new Scanner( sourceFile );
		StringBuilder strBld = new StringBuilder();
		
		while( input.hasNext() )
		{
			String s1 = input.nextLine();
			strBld.append( s1.replaceAll( args[ 1 ], "" ) );
			strBld.append( "\n" );
		}
		
		PrintWriter output = new PrintWriter( sourceFile );
		output.println( strBld.toString() );
		input.close();
		output.close();
	}
}		