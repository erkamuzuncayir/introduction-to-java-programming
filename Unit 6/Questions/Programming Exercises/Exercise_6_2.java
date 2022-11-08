// Unit 6 - Exercise 2

import java.util.Scanner;

public class Exercise_6_2 // PrintReversedOrder
{
	public static void main( String[] args )
	{
		final int Integer_Count = 10;
		int[] number_array = new int[ Integer_Count ];
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please enter ten number: " );
		
		for( int i = 0 ; i < number_array.length ; i++)
			number_array[ i ] = input.nextInt();
		
		// Prints them in reversing order
		for( int i = number_array.length - 1 ; i >= 0 ; i-- )
			System.out.println( number_array[ i ] );
	}
}
