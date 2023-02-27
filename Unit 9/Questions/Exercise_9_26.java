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

public class Exercise_9_26
{
	public static void main( String[] args )
	{
		MyStringBuilder1 str_bld = new MyStringBuilder1( "BUENOS " );
		MyStringBuilder1 str_bld_two = new MyStringBuilder1( "dias" );
		
		System.out.println( str_bld.append( str_bld_two ) );
		System.out.println( str_bld.append( 4 ) );
		System.out.println( str_bld.length() );
		System.out.println( str_bld.charAt( 2 ) );
		System.out.println( str_bld.toLowerCase() );
		System.out.println( str_bld.substring( 3, 5 ) );
		System.out.println( str_bld.toString() );
	}
}
