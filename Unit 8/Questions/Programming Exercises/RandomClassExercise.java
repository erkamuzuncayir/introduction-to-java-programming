// Unit 8 - Exercise 4

import java.util.Random;

public class RandomClassExercise
{
	public static void main(String[] args) 
	{
		Random test = new Random( 1000 );
		
		for( int i = 0; i < 100 ; i++ )
			System.out.printf( "%d. random number is %d\n" , i , test.nextInt( 100 ) );
	}
}
