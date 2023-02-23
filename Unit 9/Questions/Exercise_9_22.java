// Chapter 9 - Exercise 22 | RemoveText

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Exercise_9_22
{
	public static void main( String[] args ) throws Exception
	{	
		int correctCount = 0;
		
		String[][] states_and_capitals = { 
			{ "Alabama" , "Montgomery" }, { "Alaska" , "Juneau" }, 
			{ "Arizona" , "Phoenix" }, { "Arkansas" , "Little Rock" }, 
			{ "California" , "Sacramento" }, { "Colorado" , "Denver" }, 
			{ "Connecticut" , "Hartford" }, { "Delaware" , "Dover" }, 
			{ "Florida" , "Tallahassee" }, { "Georgia" , "Atlanta" } };
	
		for( int i = 0; i < states_and_capitals.length; i++ )
		{
			String answer = JOptionPane.showInputDialog( 
							null, "What is the capital of " +
							states_and_capitals[ i ][ 0 ], 
							"Please answer the question.",
							JOptionPane.QUESTION_MESSAGE );
			
			System.out.println( answer.toLowerCase() + "\n" + states_and_capitals[ i ][ 1 ].toLowerCase() );

			if( answer.toLowerCase().equals( 
				states_and_capitals[ i ][ 1 ].toLowerCase() ) )
			{	
				JOptionPane.showMessageDialog( null, "Your answer is correct." );
				correctCount++;
			}
			else
			{
				JOptionPane.showMessageDialog( null, "Your answer is wrong." );
			}
		}
		
		JOptionPane.showMessageDialog( null, "Total correct count is " + correctCount );
	}
}