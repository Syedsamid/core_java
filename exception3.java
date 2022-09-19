import java.io.*;
import java.lang.*;

class authentication_failure extends Exception
{
	authentication_failure()
	{
		System.out.println("Exception error");
		System.out.println("Password does not match");
	}
}
class exception3
{
	public static void main(String args[]) throws IOException
	{
		String s="SAMID";
		String p1;
		try
		{
			BufferedReader p=new BufferedReader (new InputStreamReader(System.in));
			System.out.println("");
			System.out.println("\n\t Enter password :");
			p1=(p.readLine());
			if(p1.equals(s))
			{
				System.out.println("\n\tAuthentication user is Authorised");
			}
			else
			{
				authentication_failure a=new authentication_failure();
				throw a;
			}
		}catch(authentication_failure e){}
	}
}