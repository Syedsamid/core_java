import java.io.*;
import java.lang.*;
class prime extends Exception		
{
	prime ()
	{
		System.out.println("Not a prime number");
		System.out.println("Exit");

}
class exception9
{
	public static void main(String args[])
	{
		int n,i=2,c=1;
		BufferedReader p=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter the namber");
			n=Integer.parseInt(p.readLine());
			if(n%2==0||n%3==0)
			{
				c=0;
			}
			if(c==1)
			{
				System.out.println("Is a prime number");
			}
			else
			{
				prime e=new prime();
				throw e;
			}
		}catch(Exception e){}
	}
}