package dats;
import java.io.*;
import java.lang.*;

class A 	
{
	public void in()
	{
		System.out.println("\nHello I am in class A");
	}
}
class B extends ACTIVE
{
	public void in1()
	{
		in();
		System.out.println("\n\t Hello I am in class B");
	}
}
public class PInheri extends B
{
	public void in2()
	{
		in1();
		System.out.println("\n\tHello I am in class C");
	}
}
	
