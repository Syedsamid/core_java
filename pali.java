//palidrome num
import java.io.*;
import java.lang.*;
class pali
{
public static void main(String ar[])throws IOException
{
	int n,d,rev=0,a;
	n=Integer.parseInt(ar[0]);
	d=n;
	System.out.print("\n\t Number A ="+n);
	while(n>0)
	{
		a=n%10;
		rev=rev*10+a;
		n=n/10;
	}
	if(rev==d)
	{
		System.out.print("\n\t Number"+ d +" is palindrome");
	}
	else
	{
		System.out.print("\n\t Number"+ d +" Not palindrome");
	}
}
}
