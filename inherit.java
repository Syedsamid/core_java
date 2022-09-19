import java.io.*;
import java.lang.*;
class  multiple
{
	int a,b,c;
	void in()
	{
		BufferedReader ob=new BufferedReader (new InputStreamReader(System.in));
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
		BufferedReader ob=new BufferedReader (new InputStreamReader(System.in));
		try
		{
			System.out.print("Enter no.d:");
			d=Integer.parseInt(ob.readLine());
			System.out.print("Enter no.e:");
			e=Integer.parseInt(ob.readLine());
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
/*
import java.io.*;
import java.lang.*;
class  multiple
{
	int a,b,c;
	void in()
	{
		BufferedReader ob=new BufferedReader (new InputStreamReader(System.in));
		try
		{
			System.out.print("\nEnter A:");
			a=Integer.parseInt(ob.readLine());
			System.out.print("\nEnter B:");
			b=Integer.parseInt(ob.readLine());
			c=a+b;
			System.out.println("\nAddition is"+c);
		}catch (IOException e){}
	}
}
class int2 extends multiple
{ //implements int2

	int d,e,f;
	void out()
	{
		BufferedReader ob=new BufferedReader (new InputStreamReader(System.in));
		try
		{
			System.out.print("\nEnter no.d:");
			d=Integer.parseInt(ob.readLine());
			System.out.print("\nEnter no.e:");
			e=Integer.parseInt(ob.readLine());
			f=d-e;
			System.out.println("\nSubstraction is"+f);
		}catch(IOException e){}
	}
}
interface int3
{
	void get();
}
class inh3 extends int2 implements int3
{
	int g,h,i;
	public void get()
	{
		BufferedReader ob=new BufferedReader (new InputStreamReader(System.in));
		try
		{
			System.out.print("\nEnter no.d:");
			g=Integer.parseInt(ob.readLine());
			System.out.print("\nEnter no.e:");
			h=Integer.parseInt(ob.readLine());
			i=g*h;
			System.out.println("\nMultipl is"+i);
		}catch(IOException e){}
	}
}
class inherit
{
		public static void main(String args[])
		{	inh3 ob=new inh3();
			ob.in();
			ob.out();
			ob.get();
		}
}*/