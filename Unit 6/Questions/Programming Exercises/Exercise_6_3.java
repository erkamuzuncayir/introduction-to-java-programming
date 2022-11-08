// Unit 6 - Exercise 3

import java.util.Scanner;

public class Exercise_6_3 // CountOccurenceOfNumbers
{
	public static void main( String[] args )
	{
		final int Array_Size = 101;
		int[] input_array = new int[ Array_Size ];
		Scanner input = new Scanner( System.in );

		System.out.println( "Please enter a couple of number between 1 and 100 " + 
								"(If you enter 0, input process will end.) : ");		
		int inputNumber = input.nextInt();
		while( inputNumber != 0 )
		{
			input_array[ inputNumber ] = input_array[ inputNumber ] + 1;
			inputNumber = input.nextInt();
		}
		
		for( int i = 1 ; i < input_array.length ; i++ ) // Starts 1 because desired number starts from 1
		{
			if( input_array[ i ] != 0 && input_array[ i ] == 1 )
				System.out.printf( "%d occurs %d time.\n" , i , input_array[ i ] );
			else if( input_array[ i ] != 0 && input_array[ i ] != 1 )
				System.out.printf( "%d occurs %d times.\n" , i , input_array[ i ] );
		}		
	}
}
