// Unit 3 - Exercise 15

import java.util.Scanner;

public class Lottery
{
	public static void main( String[] args ) 
	{
		// Creates a Scanner and variables
		Scanner input = new Scanner( System.in );
		int fullPrize = 0;
		int partPrize = 0;
		
		// Creates three random numbers
		final int lot_Num_1 = ( int )( ( System.currentTimeMillis() * 7 ) % 10 );
		final int lot_Num_2 = ( int )( ( System.currentTimeMillis() * 4 ) % 10 );
		final int lot_Num_3 = ( int )( ( System.currentTimeMillis() * 6 ) % 10 );

		// Prompts the user to choose three number
		System.out.print( "Please choose three-digit number" );
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		// Calculates full prize
		if( lot_Num_1 == num1 )
			fullPrize ++;
		if( lot_Num_2 == num2 )
			fullPrize ++;
		if( lot_Num_3 == num3 )
			fullPrize ++;
		// Calculates partly prize
		if( ( lot_Num_1 == num1 ) || ( lot_Num_1 == num2 ) || ( lot_Num_1 == num3 ) )
			partPrize ++;
		if( ( lot_Num_2 == num1 ) || ( lot_Num_2 == num2 ) || ( lot_Num_2 == num3 ) )
			partPrize ++;
		if( ( lot_Num_3 == num1 ) || ( lot_Num_3 == num2 ) || ( lot_Num_3 == num3 ) )
			partPrize ++;

		// Displays result
		if( fullPrize == 3 )
		System.out.println( "You win $10.000!" );
		else if( partPrize == 3 )
		System.out.println( "You win $3.000!" );
		else if( partPrize > 0 )
		System.out.println( "You win $1.000!" );
		else
		System.out.println( "You lose!" );
	}
}