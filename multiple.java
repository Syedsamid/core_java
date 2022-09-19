import java.io.*;
import java.lang.*;
class  multiple
{
	int a,b,c;
	void in()
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		try
		{
			System.out.print("Enter A:");
			a=Integer.parseInt(ob.readLine());
			System.out.print("Enter B:");
			b=Integer.parseInt(ob.readLine());
			c=a+b;
			System.out.println("Addition is"+c);
		}catch (IOException e){}
	}
}
class int2 extends multiple
{ //implements int2

	int d,e,f;
	void out()
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		try
		{
			System.out.print("Enter no.d:");
			d=Integer.parseInt(ob.readLine());
			System.out.print("Enter no.e:");
			e=Integer.parseint(ob.readLine());
			f=d-e;
			System.out.println("Substraction is"+f);
		}catch(IOException e){}
	}
}
class inherit
{
		public static void main(String args[])
		{	int2 ob=new int2();
			ob.in();
			ob.out();
		}
}