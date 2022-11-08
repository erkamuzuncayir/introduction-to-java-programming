// Unit 6 - Exercise 27

import java.util.Scanner;
import java.util.Arrays;

public class Exercise_6_27 // CheckIfIdentical
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		
		System.out.println( "Please enter first list (First input will be array's length):" );
		int arrayOneLength = input.nextInt();
		
		int[] array_one = new int[ arrayOneLength ];
		
		for( int i = 0 ; i < array_one.length ; i++ )
			array_one[ i ] = input.nextInt();
	
		System.out.println( "Please enter second list (First input will be array's length):" );
		int arrayTwoLength = input.nextInt();
		
		int[] array_two = new int[ arrayTwoLength ];
		
		for( int i = 0 ; i < array_two.length ; i++ )
			array_two[ i ] = input.nextInt();
	
		System.out.println( CheckIfEqual( array_one , array_two ) ? "Two lists are identical." : 
																	"Two lists are not identical." ) ;
														
	}
	
	public static boolean CheckIfEqual( int[] array_one , int[] array_two )
	{
		Arrays.sort( array_one );
		Arrays.sort( array_two );
		
		return Arrays.equals( array_one , array_two );
	}
	
}
