// Chapter 9 - Exercise 35

import java.util.*;

public class Exercise_9_35
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter a genome string: " );
		StringBuilder genome = new StringBuilder( input.nextLine() );
		
		int geneCount = 0;
		int startIndex = 0;
		
		// Store all end types TAG, TGA, TAA
		int[] end_index_types = new int[ 3 ];
		do
		{
			startIndex = genome.indexOf( "ATG" );
			int endIndex = 0;
			if( startIndex > -1 )
			{
				end_index_types[ 0 ] = genome.indexOf( "TAG", startIndex );
				end_index_types[ 1 ] = genome.indexOf( "TAA", startIndex );
				end_index_types[ 2 ] = genome.indexOf( "TGA", startIndex );				
		
				Arrays.sort( end_index_types );		
				for( int i = 0; i < end_index_types.length; i++ )
				{
					// Finds a string suits to end type
					if( end_index_types[ i ] > startIndex &&
						( end_index_types[ i ] - startIndex ) % 3 == 0 )
					{
						endIndex = end_index_types[ i ];
						break;
					}
				}

				// Exports gene string
				String gene = genome.substring( startIndex + 3, endIndex );
				// Deletes used part of string
				genome.delete( startIndex,endIndex );
				
				if( endIndex > -1 )
				{
					System.out.println( gene );
					geneCount++;
				}
			}
		}while( startIndex > -1 );
		
		if( geneCount < 1 )
			System.out.println( "No gene is found." );
	}
}
