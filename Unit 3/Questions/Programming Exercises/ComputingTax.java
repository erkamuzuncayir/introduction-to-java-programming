// Unit 3 - Exercise 13

import java.util.Scanner;

public class ComputeTax
{
	public static void main( String[] args ) 
	{
		// Creates a Scanner
		Scanner input = new Scanner( System.in );

		// Prompts the user to enter filing status
		System.out.print( "0-single filer\n1-married jointly\n" +
							"2-married separately\n3-head of household\n" +
							"Enter the filing status: " );
		int status = input.nextInt();

		// Prompts the user to enter taxable income
		System.out.print( "Enter the taxable income: " );
		double income = input.nextDouble();

		// Computes tax
		double tax = 0;

		if (status == 0) // Computes tax for single filers
		{
			{
				if ( income <= 8350 )
					tax = income * 0.10;
				else if ( income <= 33950 )
					tax = 8350 * 0.10 + ( income - 8350 ) * 0.15;
				else if ( income <= 82250 )
					tax = 8350 * 0.10 + ( 33950 - 8350 ) * 0.15 +	
						(income - 33950) * 0.25;
				else if ( income <= 171550 )
					tax = 8350 * 0.10 + ( 33950 - 8350 ) * 0.15 +
				(82250 - 33950) * 0.25 + ( income - 82250 ) * 0.28;
				else if ( income <= 372950 )
					tax = 8350 * 0.10 + ( 33950 - 8350 ) * 0.15 +
						( 82250 - 33950 ) * 0.25 + ( 171550 - 82250 ) * 0.28 +
						( income - 171550 ) * 0.35;
				else
					tax = 8350 * 0.10 + ( 33950 - 8350 ) * 0.15 +
						( 82250 - 33950 ) * 0.25 + ( 171550 - 82250 ) * 0.28 +
						( 372950 - 171550 ) * 0.33 + ( income - 372950 ) * 0.35;
			}
			System.out.println( "Tax is " + ( int )( tax * 100 ) / 100.0 ); // Displays result
		}
		else if ( status == 1 ) // Computes tax for married file jointly
		{	
			{
				if ( income <= 16700 )
					tax = income * 0.10;
				else if ( income <= 67900 )
					tax = 8350 * 0.10 + ( income - 8350 ) * 0.15;
				else if ( income <= 137050 )
					tax = 8350 * 0.10 + ( 33950 - 8350 ) * 0.15 +	
						(income - 33950) * 0.25;
				else if ( income <= 208850 )
					tax = 8350 * 0.10 + ( 33950 - 8350 ) * 0.15 +
				(82250 - 33950) * 0.25 + ( income - 82250 ) * 0.28;
				else if ( income <= 372950 )
					tax = 8350 * 0.10 + ( 33950 - 8350 ) * 0.15 +
						( 82250 - 33950 ) * 0.25 + ( 171550 - 82250 ) * 0.28 +
						( income - 171550 ) * 0.35;
				else
					tax = 8350 * 0.10 + ( 33950 - 8350 ) * 0.15 +
						( 82250 - 33950 ) * 0.25 + ( 171550 - 82250 ) * 0.28 +
						( 372950 - 171550 ) * 0.33 + ( income - 372950 ) * 0.35;
			}
			System.out.println( "Tax is " + ( int )( tax * 100 ) / 100.0 ); // Displays result
	
		}
		else if ( status == 2 ) // Computes tax for married separately
		{
			{
				if ( income <= 8350 )
					tax = income * 0.10;
				else if ( income <= 33950 )
					tax = 8350 * 0.10 + ( income - 8350 ) * 0.15;
				else if ( income <= 68525 )
					tax = 8350 * 0.10 + ( 33950 - 8350 ) * 0.15 +	
						(income - 33950) * 0.25;
				else if ( income <= 104425 )
					tax = 8350 * 0.10 + ( 33950 - 8350 ) * 0.15 +
				(82250 - 33950) * 0.25 + ( income - 82250 ) * 0.28;
				else if ( income <= 186475 )
					tax = 8350 * 0.10 + ( 33950 - 8350 ) * 0.15 +
						( 82250 - 33950 ) * 0.25 + ( 171550 - 82250 ) * 0.28 +
						( income - 171550 ) * 0.35;
				else
					tax = 8350 * 0.10 + ( 33950 - 8350 ) * 0.15 +
						( 82250 - 33950 ) * 0.25 + ( 171550 - 82250 ) * 0.28 +
						( 372950 - 171550 ) * 0.33 + ( income - 372950 ) * 0.35;
			}
			System.out.println( "Tax is " + ( int )( tax * 100 ) / 100.0 ); // Displays result
		}
		else if ( status == 3 ) // Computes tax for head of household
		{		
			{
				if ( income <= 11950 )
					tax = income * 0.10;
				else if ( income <= 45500 )
					tax = 8350 * 0.10 + ( income - 8350 ) * 0.15;
				else if ( income <= 117450 )
					tax = 8350 * 0.10 + ( 33950 - 8350 ) * 0.15 +	
						(income - 33950) * 0.25;
				else if ( income <= 190200 )
					tax = 8350 * 0.10 + ( 33950 - 8350 ) * 0.15 +
				(82250 - 33950) * 0.25 + ( income - 82250 ) * 0.28;
				else if ( income <= 372950 )
					tax = 8350 * 0.10 + ( 33950 - 8350 ) * 0.15 +
						( 82250 - 33950 ) * 0.25 + ( 171550 - 82250 ) * 0.28 +
						( income - 171550 ) * 0.35;
				else
					tax = 8350 * 0.10 + ( 33950 - 8350 ) * 0.15 +
						( 82250 - 33950 ) * 0.25 + ( 171550 - 82250 ) * 0.28 +
						( 372950 - 171550 ) * 0.33 + ( income - 372950 ) * 0.35;
			}
			System.out.println( "Tax is " + ( int )( tax * 100 ) / 100.0 ); // Displays result
		}
		else 
		{
			System.out.println( "Error: invalid status" );
			System.exit( 0 );
		}
	}
}