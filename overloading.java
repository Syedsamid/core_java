/*
import
class classname
{
	int v1;
	float v2;
	void fun1(int vv1,float vv2)
	{
		v1=vv1;
		v2=vv2;
	}
	void fun1(int vvv1)
	{
		v1=vvv1;
		v2=90.65;
	}
	void fun1(int v3,int v4,int v5)
	{
		v1=v3=v4=v5;
	}
}
class mclass
{
	public static void main(String args[])
	{
		clqwassname ob=new classname();
		ob.fun1(435,43.543);
		ob.fun1(432);
		ob.fun1(534,543,534);
	}
}*/
/*
import java.io.*;
import java.lang.*;
class addition
{
	void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Addition="+c);
	}
	void add(int a,int b,int c)
	{
		int d;
		d=a-b-c;
		System.out.println("Subtraction="+d);
	}
}
class overloading
{
	public static void main(String args[])
	{
		addition a1=new addition();
		a1.add(7,26);
		a1.add(7,26,15);
	}
}*/

	
import java.io.*;
import java.lang.*;
class addition
{
	void add(int a,int b)
	{
		int c;
		c=a*b;
		System.out.println("Multiplecation="+c);
	}
	void add(int a,int b,int c)
	{						
		int d;
		d=a-b-c;
		System.out.println("Subtraction="+d);
	}
}
class overloading
{
	public static void main(String args[])
	{
		addition a1=new addition();
		a1.add(9,9);
		a1.add(87,26,15);
	}
}
		
		
