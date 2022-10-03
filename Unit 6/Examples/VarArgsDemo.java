// Unit 6 - Listing 5

public class VarArgsDemo
{
	public static void main( String[] args )
	{
		PrintMax( 34 , 3 , 3 , 2 , 56.5 );
		PrintMax( new double[]{ 1 , 2 , 3 } );
	}	
	
	public static void PrintMax( double... numbers )
	{
		if( numbers.length == 0 )
		{
			System.out.println( "No argument passed" );
			return;
		}
		
		double result = numbers[ 0 ];
		
		for( int i = 1 ; i < numbers.length ; i++ )
			if( numbers[ i ] > result )
				result = numbers[ i  ];
				
		System.out.printf( "The max value is %.1f\n" , result );
	}
}
