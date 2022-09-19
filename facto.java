import java.io.*;
import java.lang.*;
class facto
{
	int fact1(int n)
	{
		int r;
		if(n==1)
			return(1);
		r=fact1(n-1)*n;
		return(r);
	}
}
class Drecursion
{
	public static void main(String args[])
	{
		facto f=new facto();
		System.out.println("Factorial of 3 is :"+fact1(3));
	}
}