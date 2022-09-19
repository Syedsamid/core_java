import java.io.*;
import java.lang.*;
class exception6
{
	public static void main(String args[])
	{
		try
		{
			int k[]={1,2,43,4,32,23,332,32,423,43,532,344};
			int a=0;
			int b=25/10;
			k[100]=25;
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("\n\t Array index out of Bound Exception e");
		}catch(ArithmeticException e)
		{
			System.out.println("\n\t Divide by zero"+e);
		}
		finally
		{
			System.out.println("\n\t Atlest Exception");
		}
	}
}