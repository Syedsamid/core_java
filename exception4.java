import java.io.*;
import java.lang.*;
class exception4
{
	public static void main(String args[])
	{
		int a=10;
		int b=2;
		int c;
		try
		{
			c=a/b;
		}catch(Exception e)
		{
			b=0;
			c=a/b;
		}
		System.out.println(c);
	}
}