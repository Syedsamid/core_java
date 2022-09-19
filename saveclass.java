/*import java.io.*;
import java.lang.*;
class objectclass
{
	void in()
	{
		System.out.println("Hi");
	}
}
class saveclass
{
	public static void main(String args[])
	{
		objectclass ob=new objectclass();
		ob.in();
	}
}*/
/*import java.io.*;
import java.lang.*;
class objectclass
{
objectclass()
{
	System.out.println("Hi");
}
}
class saveclass
{
	public static void main(String args[])
	{
		new objectclass();
	}
}*/

/*import java.io.*;
import java.lang.*;
class objectclass
{
	String nm;
	objectclass(String nm)
	{
		nm=nm;
		System.out.println("Hi..."+nm);
	}
}
class saveclass
{
	public static void main(String args[])
	{
		new objectclass("Syed Samid");
	}
}*/

/*import java.io.*;
import java.lang.*;
class objectclass
{
	String nm;
	objectclass(String nm)
	{
		this.nm=nm;
		System.out.println("Hi..."+nm);
	}
}
class saveclass
{
	public static void main(String args[])
	{
		new objectclass("Syed Samid");
	}
}*/

import java.io.*;
import java.lang.*;
class objectclass
{
	Double r,aoc,poc;
	objectclass()
	{
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.print("\n\tEnter radius:");
			r=Double.parseDouble(ob.readLine());
			aoc=2*3.14*r;
			System.out.print("Area of Circle:"+aoc);
			poc=2*3.14*r;
			System.out.print("Area of circle:"+poc);
		}catch(IOException e){}
	}
}
/*
class saveclass
{
	public static void main(String args[])
	{ 
		new objectclass();
	}
}*/


