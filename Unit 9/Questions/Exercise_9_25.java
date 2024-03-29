/* Chapter 9 - Exercise 25 | MyCharacter

+isDigit(ch: char): booleanReturns true if the specified character is a digit.
+isLetter(ch: char): booleanReturns true if the specified character is a letter.
+isLetterOrDigit(ch: char): booleanReturns true if the character is a letter or a digit.
+isLowerCase(ch: char): booleanReturns true if the character is a lowercase letter.
+isUpperCase(ch: char): booleanReturns true if the character is an uppercase letter.
+toLowerCase(ch: char): charReturns the lowercase of the specified character.
+toUpperCase(ch: char): charReturns the uppercase of the specified character.
*/

import java.util.*;

public class Exercise_9_25
{
	public static void main( String[] args )
	{
		MyCharacter c1 = new MyCharacter( 'A' );
		
		System.out.println( MyCharacter.isDigit( c1 ) );
		System.out.println( MyCharacter.isLetter( c1 ) );
		System.out.println( MyCharacter.isLetterOrDigit( c1 ) );
		System.out.println( MyCharacter.isLowerCase( c1 ) );
		System.out.println( MyCharacter.isUpperCase( c1 ) );
		System.out.println( MyCharacter.toLowerCase( c1 ) );
		System.out.println( MyCharacter.toUpperCase( c1 ) );
	}
}
