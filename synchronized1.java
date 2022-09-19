import java.io.*;
import java.lang.*;
import java.lang.Thread;
class msg
{
	synchronized void disp()
	{
		try
		{
			System.out.println("Hi");
			System.out.println("I");
			System.out.println("Am");
			Thread.sleep(2500);
		}catch(InterruptedException e){}
		System.out.println("Learning");
		System.out.println("Java");
	}
}
class Y implements Runnable
{
	b=a;
	t=new Thread(this);
	t.start();
}
public void run()
{
	b.disp();
}
class sychronized1
{
	public static void main(String args[])
	{
		msg m=new msg();
		Y m1=new Y(m);
		Y m2=new Y(m);
	}
}