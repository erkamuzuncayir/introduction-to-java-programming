// Chapter 9 - Exercise 19 | WriteReadData

import java.util.*;
import java.io.*;

public class Exercise_9_19
{
	public static void main( String[] args ) throws Exception
	{
		// Create a file object instance
		File sourceFile = new File( "Exercise_9_19.txt" );
		
		// Checks if exists the file
		System.out.println( sourceFile.exists() );
		
		// Create the file
		PrintWriter output = new PrintWriter( sourceFile );
	
		// Fill with random numbers
		for( int i = 0; i < 100; i++ )
			output.print( ( int )( Math.random() * 100 ) + " " );
		
		// Close the file
		output.close();
		
		Scanner input = new Scanner( sourceFile );
		
		// Print unsorted
		String sourceStr = input.nextLine();
		System.out.println( sourceStr );
		
		// Read writed data
		String[] nums_str = sourceStr.split( " " );
		int[] nums = new int[ nums_str.length ];
		for( int i = 0; i < nums.length; i++ )
			nums[ i ] = Integer.parseInt( nums_str[ i ] );
		
		// Sort data
		Arrays.sort( nums );
	
		// Print sorted data
		for( int i = 0; i < nums.length; i++ )
			System.out.printf( "%d ", nums[ i ] );
	}
}