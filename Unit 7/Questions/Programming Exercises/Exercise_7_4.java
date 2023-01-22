// Unit 7 - Exercise 4

import java.util.Scanner;

public class Exercise_7_4 // ComputeWeeklyHoursOfEachEmployee
{
	public static void main( String[] args )
	{
		final int Weekday_Count = 7;
		
		Scanner input = new Scanner( System.in );
		System.out.println( "Please enter how many employees' hours do you want to enter: " );
		int employeeCount = input.nextInt();
		int[][] employees_and_worktimes = new int[ employeeCount ][ Weekday_Count ];
		for( int i = 0; i < employeeCount; i++ )
			for( int j = 0; j < Weekday_Count; j++ )
				employees_and_worktimes[ i ][ j ] = input.nextInt();
		
		// Prints table of employee and work times
		System.out.println("\t\tSu\tM\tT\tW\tH\tF\tSa");
		for( int i = 0; i < employees_and_worktimes.length; i++ )
		{
			System.out.printf( "Employee %d\t" , i );
			for( int j = 0; j < employees_and_worktimes[ i ].length; j++ )
				System.out.printf( "%d\t" , employees_and_worktimes[ i ][ j ] );

			System.out.println();
		}
		
		int[][] sorted_employees_total_worktime = SortTotalWorktimes( employees_and_worktimes );
		
		// Prints sorted array
		for( int i = 0 ; i < sorted_employees_total_worktime.length; i++ )
		{
			System.out.printf( "The employee %d's total worktime is %d.\n" ,
								 sorted_employees_total_worktime[ i ][ 1 ] ,
								 sorted_employees_total_worktime[ i ][ 0 ] );
		}
	}
	
	public static int[][] SortTotalWorktimes( int[][] employees_and_worktimes )
	{
		int[][] sorted_employees_total_worktime = ComputeTotalWorktime( employees_and_worktimes );
		
		for( int i = 0; i < sorted_employees_total_worktime.length -1 ; i++ )
		{
			for( int j = i + 1 ; j < sorted_employees_total_worktime.length ; j++ )
			{
				if( sorted_employees_total_worktime[ i ][ 0 ] < 
					sorted_employees_total_worktime[ j ][ 0 ] )
				{
					int[] temp = sorted_employees_total_worktime[ i ];
					sorted_employees_total_worktime[ i ] = sorted_employees_total_worktime[ j ];
					sorted_employees_total_worktime[ j ] = temp;
				}
			}
		}
		
		return sorted_employees_total_worktime;
	}
	
	public static int[][] ComputeTotalWorktime ( int[][] employees_and_worktimes )
	{
		int[][] employees_total_worktime = new int[ employees_and_worktimes.length ][ 2 ];
		for( int i = 0; i < employees_and_worktimes.length; i++ )
		{
			int employeeTotalWorktime = 0;
			for( int j = 0; j < employees_and_worktimes[ i ].length; j++ )
				employeeTotalWorktime += employees_and_worktimes[ i ][ j ];

			// Calculates total work times with tracking index order 
			employees_total_worktime[ i ][ 0 ] = employeeTotalWorktime;
			employees_total_worktime[ i ][ 1 ] = i;
		}
		
		return employees_total_worktime;
	}
}
