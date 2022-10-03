// Unit 5 - Exercise 15

public class PrintTaxTable
{
	public static void main( String[] args )
	{
		System.out.println( "Taxable Income\tSingle\t\tMarried Joint\tMarried Separate\tHead of a House" );
		for(int income = 50000 ; income <= 60000 ; income += 50 )
		{
			System.out.print( income + "\t\t" );
			
			for( int status = 0 ; status < 4 ; status ++)
			{
				ComputeTax( status , income );
			}
		}
	}

	public static void ComputeTax( int status , double income )
	{
		
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
						(income - 33951) * 0.25;
				else if ( income <= 171550 )
					tax = 8350 * 0.10 + ( 33950 - 8350 ) * 0.15 +
				(82250 - 33951) * 0.25 + ( income - 82251 ) * 0.28;
				else if ( income <= 372950 )
					tax = 8350 * 0.10 + ( 33950 - 8351 ) * 0.15 +
						( 82250 - 33951 ) * 0.25 + ( 171550 - 82251 ) * 0.28 +
						( income - 171551 ) * 0.35;
				else
					tax = 8350 * 0.10 + ( 33950 - 8351 ) * 0.15 +
						( 82250 - 33951 ) * 0.25 + ( 171550 - 82251 ) * 0.28 +
						( 372950 - 171551 ) * 0.33 + ( income - 372951 ) * 0.35;
			}
			System.out.print( ( ( int )tax + 1 ) + "\t\t" ); // Displays result
		}
		else if ( status == 1 ) // Computes tax for married file jointly
		{	
			{
				if ( income <= 16700 )
					tax = income * 0.10;
				else if ( income <= 67900 )
					tax = 16700 * 0.10 + ( income - 16701 ) * 0.15;
				else if ( income <= 137050 )
					tax = 16700 * 0.10 + ( 67900 - 16701 ) * 0.15 +	
						(income - 67901) * 0.25;
				else if ( income <= 208850 )
					tax = 16700 * 0.10 + ( 67900 - 16701 ) * 0.15 +
						( 137050 - 67901 ) * 0.25 + ( income - 137051 ) * 0.28;
				else if ( income <= 372950 )
					tax = 16700 * 0.10 + ( 67900 - 16701 ) * 0.15 +
						( 137050 - 67901 ) * 0.25 + ( 208850 - 137051 ) * 0.28 +
						( income - 208851 ) * 0.35;
				else
					tax = 16700 * 0.10 + ( 67900 - 16701 ) * 0.15 +
						( 137050 - 67901 ) * 0.25 + ( 208850 - 137051 ) * 0.28 +
						( 372950 - 208851 ) * 0.33 + ( income - 372951 ) * 0.35;
			}
			System.out.print( ( ( int )tax + 1 ) + "\t\t" ); // Displays result
	
		}
		else if ( status == 2 ) // Computes tax for married separately
		{
			{
				if ( income <= 8350 )
					tax = income * 0.10;
				else if ( income <= 33950 )
					tax = 8350 * 0.10 + ( income - 8351 ) * 0.15;
				else if ( income <= 68525 )
					tax = 8350 * 0.10 + ( 33950 - 8351 ) * 0.15 +	
						( income - 33951 ) * 0.25;
				else if ( income <= 104425 )
					tax = 8350 * 0.10 + ( 33950 - 8351 ) * 0.15 +
						( 68525 - 33951 ) * 0.25 + ( income - 68525 ) * 0.28;
				else if ( income <= 186475 )
					tax = 8350 * 0.10 + ( 33950 - 8351 ) * 0.15 +
						( 68525 - 33951 ) * 0.25 + ( 104425 - 68525 ) * 0.28 +
						( income - 104426 ) * 0.35;
				else
					tax = 8350 * 0.10 + ( 33950 - 8351 ) * 0.15 +
						( 68525 - 33951 ) * 0.25 + ( 104425 - 68525 ) * 0.28 +
						( 186475 - 104426 ) * 0.33 + ( income - 186476 ) * 0.35;
			}
			System.out.print( ( ( int )tax + 1 ) + "\t\t\t" ); // Displays result
		}
		else if ( status == 3 ) // Computes tax for head of household
		{		
			{
				if ( income <= 11950 )
					tax = income * 0.10;
				else if ( income <= 45500 )
					tax = 11950 * 0.10 + ( income - 11951 ) * 0.15;
				else if ( income <= 117450 )
					tax = 11950 * 0.10 + ( 45500 - 11951 ) * 0.15 +	
						( income - 45501 ) * 0.25;
				else if ( income <= 190200 )
					tax = 11950 * 0.10 + ( 45500 - 11951 ) * 0.15 +
						( 117450 - 45501 ) * 0.25 + ( income - 117451 ) * 0.28;
				else if ( income <= 372950 )
					tax = 11950 * 0.10 + ( 45500 - 11951 ) * 0.15 +
						( 117450 - 45501 ) * 0.25 + ( 190200 - 117451 ) * 0.28 +
						( income - 190201 ) * 0.35;
				else
					tax = 11950 * 0.10 + ( 45500 - 11951 ) * 0.15 +
						( 117450 - 45501 ) * 0.25 + ( 190200 - 117451 ) * 0.28 +
						( 372950 - 190201 ) * 0.33 + ( income - 372951 ) * 0.35;
			}
			System.out.print( ( ( int )tax + 1 ) + "\t\t\n" ); // Displays result
		}
	}
}
