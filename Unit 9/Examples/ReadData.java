// Unit 9 - Listing 8

import java.util.Scanner;

public class ReadData
{
	public static void main( String[] args ) throws Exception
	{
		// Create a file instance
		java.io.File file = new java.io.File( "scores.txt" );
		
		// Create a scanner for the file
		Scanner input = new Scanner( file );
		
		// Read data from a file
		while( input.hasNext() )
		{
			String firstName = input.next();
			String mi = input.next();
			String lastName = input.next();
			int score = input.nextInt();
			System.out.printf( "%s %s %s %d\n", firstName, mi, lastName, score );
		}
		
		// Close the file
		input.close();
	}
}