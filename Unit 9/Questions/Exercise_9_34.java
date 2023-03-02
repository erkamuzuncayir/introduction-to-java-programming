// Chapter 9 - Exercise 34 | ReplaceTextFromAllFiles

import java.io.*;
import java.util.*;

public class Exercise_9_34
{
	public static void main( String[] args ) throws Exception
	{	
		// Takes directory path
		String inputLocation = new Scanner( args[ 0 ] ).nextLine();
		File directoryPath = new File( inputLocation );
		File[] all_files = directoryPath.listFiles();
		
		for( int i = 0; i < all_files.length; i++ )
		{
			// Create a scanner for input and a PrintWriter for output
			Scanner input = new Scanner( all_files[ i ] );
			StringBuilder strBld = new StringBuilder();
			
			while( input.hasNext() )
			{
				String s1 = input.nextLine();
				strBld.append( s1.replaceAll( args[ 1 ], args[ 2 ]  ) );
				strBld.append( "\n" );
			}
			
			PrintWriter output = new PrintWriter( all_files[ i ] );
			output.println( strBld.toString() );
			input.close();
			output.close();
		}
	}
}		

