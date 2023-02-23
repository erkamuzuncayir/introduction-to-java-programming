// Chapter 9 - Exercise 16 | ReformatSourceCodeToEndLine
// Unsolved

import java.util.*;
import java.io.*;

public class Exercise_9_16
{
	public static void main( String[] args ) throws Exception
	{
		File sourceFile = new File( args[ 0 ] );
		
		Scanner input = new Scanner( sourceFile );
		StringBuilder strBld = new StringBuilder();
		boolean addBrackets = false;
		
		while( input.hasNext() )
		{
			String str = input.nextLine();
			if( !str.endsWith( "{" ) && !str.endsWith( "}" ) &&
					!str.endsWith( ";" )  && !str.startsWith( "/" ) )
			{
				strBld.append( str );
				strBld.append( " {" );
			}
			else if( str.indexOf( "{" < 0 ) )
				strBld.append( str );
			
			strBld.append( "\n" );
		}
		
		PrintWriter output = new PrintWriter( sourceFile );
		output.println( strBld.toString() );
		output.close();
	}
}