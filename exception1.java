import java.io.*;
import java.lang.*;
class exception1
{
	public static void main (String args[])
	{
		int a;
		try
		{
		BufferedReader p=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number");
		a=Integer.parseInt(p.readLine());
		if(a%2==0)
		{
			System.out.println(a+" is even number");
		}
		else
		{
			System.out.println(a+" is odd number");
		}
	}catch(Exception e){}
	finally
	{
		System.out.println("\n\t Program is run Successfully");
	}
}
}