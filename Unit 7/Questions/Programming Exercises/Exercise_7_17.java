// Unit 7 - Exercise 17

import java.util.Scanner;

// SOLUTION DIDN'T COMPLETE

public class Exercise_7_17 // FindBanktruptBanks
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner( System.in );

		System.out.print( "Please enter bank count and bankrupt limit: " );
		final int Bank_Count = input.nextInt();
		final int Bankrupt_Limit = input.nextInt();
		double[][] banks = new double[ Bank_Count ][];
		for( int i = 0; i < banks.length ; i++ )
		{
			System.out.print( "Please enter bank's balance and borrower count: " );
			double bankCurrentBalance = input.nextDouble();
			int borrowerCount = input.nextInt();
			// this is typical bank's information array template.
			double[] currentBank = new double[ 2 + borrowerCount * 2 ];
			currentBank[ 0 ] = bankCurrentBalance;
			currentBank[ 1 ] = borrowerCount;
			System.out.print( "Please enter borrowers' information: " );
			for( int j = 2 /*Starts from there because this loop gets borrower's information */; j < currentBank.length ; j++ )
			{
				currentBank[ j ] = input.nextDouble();		
			}
			banks[ i ] = currentBank;
		}
		
		boolean[] bankrupted_banks = FindBanktruptBanks( banks , Bankrupt_Limit );
		System.out.print( "\nBankrupted banks are: " );
		for( int i = 0; i < bankrupted_banks.length ; i++ )
		{
			if( bankrupted_banks[ i ] == true )
				System.out.printf( "%d " , i );
		}
	}
	
	public static boolean[] FindBanktruptBanks( double[][] banks , int Bankrupt_Limit )
	{
		double[] banks_total_assets = new double[ banks.length ];
		boolean[] bankrupted_banks = new boolean[ banks.length ];

		/*	There is an outer extra for loop because 
		*	it have to check bank count + 1 times for bankrupted banks' affects. */
		for ( int k = 0; k < banks.length + 1; k++ )
		{
			for( int i = 0; i < banks.length; i++ )
			{
				double bankTotalAssets = banks[ i ][ 0 ]; // This element stores bank's current balance
				int lendCount = ( int )banks[ i ][ 1 ]; // This element stores lend count of the bank
				if( lendCount > 0 )
				{
					for( int j = 3 /* 3rd element stores first amount of borrowed money */;
									 j < 3 + ( lendCount * 2 ) ; j += 2 )
					{
						/*	Checks if the borrower bank bankrupted or not
						*	j-1 -> j stores borrowed amount j - 1 stores borrower's id */
						if( bankrupted_banks[ ( int )banks[ i ][ j -1 ] ] == false )
							bankTotalAssets += banks[ i ][ j ];
					}
				}
				banks_total_assets[ i ] = bankTotalAssets;
				
				if( banks_total_assets[ i ] < Bankrupt_Limit )
					bankrupted_banks[ i ] = true;
			}
		}
		
		return bankrupted_banks;
	}
}
