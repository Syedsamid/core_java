import java.io.*;
import java.lang.*;
class exception7
{
	public static void main(String args[])
	{
		try
		{
			int a=0;
			int b=25/a;
			int k[]={1,2,3};
			System.out.print(k[5]);
			k[10]=25;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Divide by zero"+e);
		}
		System.out.println("Atlest executed");
	}
}