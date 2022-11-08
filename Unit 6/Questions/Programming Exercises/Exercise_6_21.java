// Unit 6 - Exercise 21

import java.util.Scanner;

public class Exercise_6_21 // BeanMachineGame
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner( System.in );
		System.out.println("Enter the number of balls to drop: ");
		int ballCount = input.nextInt();
		System.out.println("Enter the number of slots in the bean machine: ");
		int slotCount = input.nextInt();
		
		int[] slots = new int[ slotCount ];
		String[] machineHistory = new String[ ballCount ];
		
		BeanMachine( ballCount , slotCount , slots , machineHistory );
	}
	
	public static void BeanMachine( int ballCount , int slotCount , int[] slots , String[] machineHistory )
	{
		for( int i = 0 ; i < ballCount ; i++ )
		{
			double sumOfLeftAndRight = 0;
			String ballHistory = "";
			// Info: Iteration count is -1 of slot count.
			for( int k = 0 ; k < slotCount - 1; k++ )
			{
				double nailResult = HitTheNail();
				if( nailResult > 0 )
					ballHistory = ballHistory + "R";
				else
					ballHistory = ballHistory + "L";
		
				sumOfLeftAndRight += nailResult;
			}
			/* 
				Info: We add other half of slot count and normalize numbers.
				because our left and right computation solution 
				gives us to values between -slotCount/2 and slotCount/2. 
			*/
			if( slotCount % 2 != 0 )
				sumOfLeftAndRight += slotCount / 2;
			else
			{ 
				sumOfLeftAndRight -= 0.5;
				sumOfLeftAndRight += slotCount / 2;
			}
			
			int ballPosition = ( int )sumOfLeftAndRight;
			slots[ ballPosition ] = slots[ ballPosition ] + 1;
			machineHistory[ i ] = ballHistory;
		}
		
		// Print section
		for( String ball: machineHistory )
			System.out.println( ball );
			
		for( int j = 0 ; j < slots.length ; j++ )
			System.out.printf( "%d  " , slots[ j ] );
			
		System.out.println();
	}
	
	public static double HitTheNail()
	{
		// -0.5 for left, 0.5 for right
		return ( int )( Math.random() * 2 ) > 0 ? 0.5 : -0.5;
	}
}
