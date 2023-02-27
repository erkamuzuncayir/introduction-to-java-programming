/* Chapter 9 - Unit 26 | MyStringBuilder1

(Implementing the StringBuilder class) The StringBuilder class is pro-
vided in the Java library. Provide your own implementation for the following methods (name the new class MyStringBuilder1):
public MyStringBuilder1(String s);
public MyStringBuilder1 append(MyStringBuilder1 s);
public MyStringBuilder1 append(int i);
public int length();
public char charAt(int index);
public MyStringBuilder1 toLowerCase();
public MyStringBuilder1 substring(int begin, int end);
public String toString();
*/

public class MyStringBuilder1
{
	String s = "";
	public MyStringBuilder1( String s )
	{
		this.s = s;
	}
	
	public MyStringBuilder1 append( MyStringBuilder1 s )
	{
		this.s += s.toString();
		return new MyStringBuilder1( this.s );
	}

	public MyStringBuilder1 append( int i )
	{
		s += i;
		return new MyStringBuilder1( s );		
	}
		
	public int length()
	{
		return s.length();
	}
	
	public char charAt(int index)
	{
		return s.charAt( index );
	}
	
	public MyStringBuilder1 toLowerCase()
	{
		String sL = "";
		for( int i = 0; i < s.length(); i++ )
		{
			if( s.charAt( i ) > 64 && s.charAt( i ) < 91 )
			{
				char c = s.charAt( i );
				c += 32;
				sL += c;
			}
			else
				sL += s.charAt( i );
		}
		
		s = sL;
		
		return new MyStringBuilder1( s );
	}
	
	public MyStringBuilder1 substring(int begin, int end)
	{
		String s_sub = "";
		
		for( int i = begin; i < end; i++ )
			s_sub += s.charAt( i );
			
		return new MyStringBuilder1( s_sub );
	}
	
	public String toString()
	{
		return s;
	}
}
