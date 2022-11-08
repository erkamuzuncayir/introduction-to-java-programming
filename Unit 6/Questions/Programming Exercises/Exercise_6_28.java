// Unit 6 - Exercise 28

import java.util.Scanner;

public class Exercise_6_28 // PrintCombinations
{
	public static void main( String[] args )
	{
		final int Array_Size = 10;
		int[] number_array = new int[ Array_Size ];
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please enter ten numbers:" );
		for( int i = 0 ; i < number_array.length ; i++ )
			number_array[ i ] = input.nextInt();
		
		PrintCombinations( number_array );
	}
	
	public static void PrintCombinations( int[] number_array )
	{
		int count = 0;
		for( int i = 0 ; i < number_array.length ; i++ )
		{
			for( int j = 0 ; j < number_array.length ; j++ )
			{
				count++;
				System.out.printf( "Number one: %d, Number two %d\n" , number_array[ i ] , number_array[ j ] );
			}
		}
		System.out.printf("Total combination count: %d\n" , count );
	}
}
