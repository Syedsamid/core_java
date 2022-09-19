import java.io.*;
import java.lang.*;
class excep extends Exception
{
	excep()
	{
		System.out.println("\n\t Number is odd");
	}
}
class exception2
{
	public static void main(String args[])throws IOException
	{
		int a;
		try
		{
			BufferedReader p=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter any number:");
			a=Integer.parseInt(p.readLine());
			if(a%2==0)
			{
				System.out.println(a+" is even number");
			}
			else
			{
				excep e=new excep();
				throw e;
			}
		}catch(Exception e){}
		finally
		{
			System.out.println("\n\t Program is run successfully");
		}
	}
}