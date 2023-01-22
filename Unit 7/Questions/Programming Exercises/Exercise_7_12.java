// Unit 7 - Exercise 12

import java.util.Scanner;

public class Exercise_7_12 // ComputeTax
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		System.out.print( "(0-single filer, 1-married jointly,\n" +
							"2-married separately, 3-head of household)\n" +
							"Enter the filing status: " );
		int status = input.nextInt();

		System.out.print( "Enter the taxable income: " );
		double income = input.nextDouble();

		double[] tax_rates = { 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
		int[][] tax_brackets = {
							{ 8350, 33950, 82250, 171550, 372950 }, // Single filer
							{ 16700, 67900, 137050, 208850, 372950 }, // Married jointly
							{ 8350, 33950, 68525, 104425, 186475 }, // Married separately
							{ 11950, 45500, 117450, 190200, 372950 } // Head of household
							};
							
		// To find the residual untaxed money		
		int lastFullCalculatedBracket = 0; 		
		boolean anyResidual = true;
		double tax = 0;
		
		for( int i = 0; i < tax_brackets[ status ].length ; i++ )
		{	
			if( income > tax_brackets[ status ][ i ] )
			{
				lastFullCalculatedBracket = i;
				
				// If income overcomes to first bracket
				if( i == 0 ) 
					tax += tax_brackets[ status ][ i ] * tax_rates[ i ];
				else
					tax += ( tax_brackets[ status ][ i ] - tax_brackets[ status ][ i - 1 ] ) *
							 tax_rates[ i ];
			}
			// If income in the first bracket
			else if( income < tax_brackets[ status ][ i ] && i == 0 ) 
			{
				anyResidual = false;
				tax += income * tax_rates[ i ];
				break;
			}
		}
		
		// Any residual untaxed money adds to tax.
		if( anyResidual )
		{
			tax += ( income - tax_brackets[ status ][ lastFullCalculatedBracket ] ) * tax_rates[ lastFullCalculatedBracket + 1 ]; // +1 Due to difference of rate and bracket structure.
		}	

		System.out.printf( "Tax is %.1f of in the %.0f.\n" , tax , income );
	}
	
}
