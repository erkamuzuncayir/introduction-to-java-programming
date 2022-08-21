// Unit 4 - Exercise 19

public class PrintingPyramidTwo
{
	public static void main ( String[] args )
	{
		// Creates rows
		for ( int row = 0 ; row <= 7 ; row++ )
		{
		
			// Prints spaces
			for ( int space = 0 ; space < 7 - row  ; space++ )
			{
				System.out.print("\t");
			}
			
			// Prints ones
			int preNumber = 1;
			System.out.print( preNumber + "\t" );
			
			// Prints decremantally numbers
			for ( int i = 1 ; i <= row ; i++ )
			{
				preNumber *= 2;
				System.out.printf( "%d\t" , preNumber );
			}
			
			int postNumber = preNumber;
			
			// Prints incrementally numbers
			for ( int j = 0 ; j < row ; j++ )
			{
				postNumber /= 2;
				System.out.printf( "%d\t" , postNumber );
			}
			
			// Prints new line
			System.out.println();
		}
	}
}
