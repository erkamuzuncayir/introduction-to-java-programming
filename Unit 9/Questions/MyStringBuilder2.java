/* Chapter 9 - Exercise 27 | MyStringBuilder2

public MyStringBuilder2();
public MyStringBuilder2(char[] chars);
public MyStringBuilder2(String s);
public MyStringBuilder2 insert(int offset, MyStringBuilder2 s);
public MyStringBuilder2 reverse();
public MyStringBuilder2 substring(int begin);
public MyStringBuilder2 toUpperCase();

*/

public class MyStringBuilder2
{
	String s = "";
	
	public MyStringBuilder2()
	{}
	
	public MyStringBuilder2( char[] chars )
	{
		for( int i = 0; i < chars.length; i++ )
			s += chars[ i ];
	}
	
	public MyStringBuilder2( String s )
	{
		this.s = s;
	}

	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s)
	{
		String s_in = "";
		for( int i = 0; i < offset; i++ )
			s_in += this.s.charAt( i );
		
		s_in += s.toString();	
		
		for( int i = offset; i < this.s.length(); i++ )
		{
			s_in += this.s.charAt( i );
		}
		
		return new MyStringBuilder2( s_in );
	}

	public MyStringBuilder2 reverse()
	{
		String s_rev = "";
		
		for( int i = s.length() - 1; i >= 0; i-- )
			s_rev += s.charAt( i );
			
		s = s_rev;

		return new MyStringBuilder2( s );	
	}
	
	public MyStringBuilder2 substring(int begin)
	{
		String s_sub = "";
		
		for( int i = begin; i < s.length(); i++ )
		{
			s_sub += s.charAt( i );
		}
	
		s = s_sub;
		
		return new MyStringBuilder2( s );
	}
	
	
	public MyStringBuilder2 toUpperCase()
	{
		String sU = "";
		for( int i = 0; i < s.length(); i++ )
		{
			if( s.charAt( i ) > 96 && s.charAt( i ) < 123 )
			{
				char c = s.charAt( i );
				c -= 32;
				sU += c;
			}
			else
				sU += s.charAt( i );
		}
		
		s = sU;
		
		return new MyStringBuilder2( s );
	}
	
	public String toString()
	{
		return s;
	}

	public void println()
	{
		System.out.println( s );
	}
}
