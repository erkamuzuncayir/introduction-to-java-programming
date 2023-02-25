/* Chapter 9 - Exercise 25 | MyCharacter

(Implementing the Character class) The Character class is provided in the
Java library. Provide your own implementation for this class. Name the new class
MyCharacter.


+isDigit(ch: char): booleanReturns true if the specified character is a digit.
+isLetter(ch: char): booleanReturns true if the specified character is a letter.
+isLetterOrDigit(ch: char): booleanReturns true if the character is a letter or a digit.
+isLowerCase(ch: char): booleanReturns true if the character is a lowercase letter.
+isUpperCase(ch: char): booleanReturns true if the character is an uppercase letter.
+toLowerCase(ch: char): charReturns the lowercase of the specified character.
+toUpperCase(ch: char): charReturns the uppercase of the specified character.
*/

public class MyCharacter
{
		char ch;
		
		public MyCharacter( char ch )
		{
			this.ch = ch;
		}
		
		public char charValue()
		{
			return ch;
		}
		
		public int compareTo( MyCharacter diff_ch )
		{
			if( ch > diff_ch.charValue() )
				return 1;
			else if( ch < diff_ch.charValue() )
				return -1;
			
			return 0;
		}
		
		public boolean equals( MyCharacter diff_ch )
		{
			if( ch == diff_ch.charValue() )
				return true;
			
			return false;
		}
		
		public static boolean isDigit( MyCharacter c )
		{
			if( c.charValue() > 47 && c.charValue() < 58 )
				return true;
			
			return false;
		}

		public static boolean isLetter( MyCharacter c )
		{
			if( c.charValue() > 64 && c.charValue() < 91 ||
			  	c.charValue() > 96 && c.charValue() < 123 )
				return true;
			
			return false;
		}
	
		public static boolean isDigitOrLetter( MyCharacter c )
		{
			if( c.charValue() > 47 && c.charValue() < 58 ||
			   	c.charValue() > 64 && c.charValue() < 91 ||
			  	c.charValue() > 96 && c.charValue() < 123 )
				return true;
			
			return false;
		}

		public static boolean isLowerCase( MyCharacter c )
		{
			if( c.charValue() > 64 && c.charValue() < 91 )
				return true;
			
			return false;
		}
	
		public static boolean isUpperCase( MyCharacter c )
		{
			if( c.charValue() > 96 && c.charValue() < 123 )
				return true;
			
			return false;
		}
	
		public static char toLowerCase( MyCharacter c )
		{
			return c - 27;
		}
	
		public static char toUpperCase( MyCharacter c )
		{
			return c + 27;
		}
}
	