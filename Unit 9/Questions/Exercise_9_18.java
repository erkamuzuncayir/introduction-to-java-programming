// Chapter 9 - Exercise 18 | ProcessScores

import java.util.*;
import java.io.*;

public class Exercise_9_18
{
	public static void main( String[] args ) throws Exception
	{
		File sourceFile = new File( args[ 0 ] );
		Scanner input = new Scanner( sourceFile );
		
		String[] nums = input.nextLine().split( " " );
		
		int sumOfNums = 0;
		for( int i = 0; i < nums.length; i++ )
			sumOfNums += Integer.parseInt( nums[ i ] );

		int averageOfNums = sumOfNums / nums.length;
		
		System.out.printf( "Sum of nums is %d and average of nums is %d.\n",
							sumOfNums, averageOfNums );
	}
}