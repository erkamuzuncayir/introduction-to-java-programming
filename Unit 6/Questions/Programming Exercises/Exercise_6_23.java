// Unit 6 - Exercise_6_23

public class Exercise_6_23 // LockerPuzzleGame
{
	public static void main( String[] args )
	{
		final int Locker_Count = 100;
		boolean[] IsOpen = new boolean[ Locker_Count ];
		// First student open every locker, second one close all of them except first two.
		IsOpen[ 0 ] = true;
		IsOpen[ 1 ] = true;
		OpenCloseChanger( IsOpen );
	}
	
	public static void OpenCloseChanger( boolean[] IsOpen )
	{
		for( int i = 2 ; i < IsOpen.length ; i++ )
		{
			for( int j = i ; j < IsOpen.length ; j += i + 1  )
			{
				if( IsOpen[ j ] )
					IsOpen[ j ] = false;
				else
					IsOpen[ j ] = true;
			}
		}
		
		for( int i = 0 ; i < IsOpen.length ; i++ )
		{	
			String lockerState = IsOpen[ i ] ? "opened" : "closed";
			System.out.printf( "%d. locker is %s.\n" , i + 1 , lockerState );
		}
	}
	
}
