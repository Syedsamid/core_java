/*import java.io.*;
import java.lang.*;

class authentication extends Exception
{
	authentication()
	{
		System.out.println("Excption handeling");
		System.out.println("password does not match");
	}
	
}
class exception5
{
	public static void main(String args[]) throws IOException
	{
		String s="samid";
		String d1;
		
		try
		{
			BufferedReader d=new BufferedReader (new InputStreamReader(System.in));
			System.out.println("\n\t Enter Password:");
			d1=d.readLine();
			if(d1.equals(s))
			{
				System.out.println("\n\t Password is correct");
			}
			else
			{
				authentication oo=new authentication();
				throw oo; 	
			}
		}catch(authentication e){}
	}
}*/




import java.io.*;
import java.lang.*;

class authentication extends Exception
{
	authentication()
	{
		System.out.println("Excption handeling");
		System.out.println("password does not match");
	}
	
}
class exception5
{
	public static void main(String args[]) throws IOException
	{
		int c=1234;
		int d1;
		
		try
		{
			BufferedReader d=new BufferedReader (new InputStreamReader(System.in));
			System.out.println("\n\t Enter Password:");
			d1=Integer.parseInt(d.readLine());
			if(d1==(c))
			{
				System.out.println("\n\t Password is correct");
			}
			else
			{
				authentication oo=new authentication();
				throw oo; 	
			}
		}catch(authentication e){}
	}
}
			
			
	