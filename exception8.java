import java.io.*;
import java.lang.*;
class exception8
{
	public static void main(String args[])throws IOException
	{
		int a,rev;
		int rem=0;
		BufferedReader p=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter any number:");
			a=Integer.parseInt(p.readLine());
			int n=a;
			while(n>0)
			{
				rev=n%10;
				rem=rem*10+rev;
				n=n/10;
			}
			if(rem==a)
			{
				System.out.println(rem+":is a palidrome number");
			}
			else
			{
				System.out.println(rem+":is not a palidrome number");
			}
		}catch(Exception e){}
	}
	}