// Unit 4 - Exercise 17

public class DisplayingPyramid
{
	public static void main ( String[] args )
	{
		// Creates rows
		for ( int row = 1 ; row <= 15 ; row++ )
		{
		
			// Prints spaces
			for ( int space = 0 ; space < 15 - row  ; space++ )
			{
				System.out.print("\t");
			}
			
			// Prints decremantally numbers
			for ( int preNumber = row ; preNumber >= 1 ; preNumber-- )
			{
				System.out.print( preNumber + "\t" );
			}
			
			// Prints incrementally numbers
			for ( int postNumber = 2 ; postNumber <= row ; postNumber++)
			{
				System.out.print( postNumber + "\t" );
			}
			
			// Prints new line
			System.out.println();
		}
	}
}
