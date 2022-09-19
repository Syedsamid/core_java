/*import java.io.*;
import java.lang.*;
class d40_1
{
	double c,f;
	void in(double f1)
	{
		f=f1;
		c=(f-32)*(5.0/9.0);
	}
	void out()
	{
		System.out.print("\n\t Enter Temprature in Farenhite:"+c);
	}
	
	public static void main(String args[])
	{
		double c1;
		d40_1 ob=new d40_1();
		c1=Integer.parseInt(args[0]);
		ob.in(c1);
		ob.out();
	}
}*/


/*import java.io.*;
import java.lang.*;
class d40_1
{
	double l,b,a,p;
	void in(double a1,double b1)
	{
		l=a1;
		b=b1;
		a=l*b;
		p=2*(l*b);
	}
	void out()
	{
		System.out.println("Area of Reactagle="+a);
		System.out.println("Perimeter of Rectangle="+p);
	}
	public static void main(String args[])
	{
		double b1,b2;
		d40_1 ob=new d40_1();
		b1=Integer.parseInt(args[0]);
		b2=Integer.parseInt(args[1]);
		
		ob.in(b1,b2);
		ob.out();
	}
}*/

/*import java.io.*;
import java.lang.*;
class d40_1
{
	int a;
void in(int aa)
	{
		a=aa;
	}
	void out()
	{
		System.out.print("\n\t A="+a);
	}
	public static void main(String args[])
	{
		int a1;
		d40_1 ob=new d40_1();
		a1=Integer.parseInt(args[0]);
		ob.in(a1);
		ob.out();
	}
}*/

/*
class and object =
	1] void in() {} //simple Function
	2] void in(int var){} // Parameteized Function
Const and Dest=
	1] classname() {}  // Simple Const
	2] classname (int var){}  //Parameteized Const
*/
//Program no 3

/*import java.io.*;
import java.util.Scanner;
import java.lang.*;
class d40_1
{
	int a,b;
	void in(int aa,int bb)
	{
		a=aa;
		b=bb;
	}
	void out()
	{
		System.out.print("\n\t A ="+a);
		System.out.print("\n\t B ="+b);		
		System.out.print("\n\t Mod ="+(a%b));
		System.out.print("\n\t Add ="+(a+b));
		System.out.print("\n\t Sub ="+(a-b));
		System.out.print("\n\t Mul ="+(a*b));
		System.out.print("\n\t Div ="+(a/b));
	}
	public static void main(String args[])
	{
		int a1,b1;
		d40_1 ob=new d40_1();
		Scanner ss=new Scanner(System.in);
		 System.out.print("\n\t Enter Value of B=");
		 b1=ss.nextInt();
		 ob.out();
	}
}*/

//program no 4 by using one class and Scanner

/*import java.io.*;
import java.util.Scanner;
import java.lang.*;
class d40_1
{
	int a,b;
	void in()
	{
		Scanner ss=new Scanner(System.in);
		
		System.out.print("\n\t Enter Value of A =");
		a=ss.nextInt();
		
		System.out.print("\n\t Enter Value of  B=");
		b=ss.nextInt();
	}
	void out()
	{
		System.out.print("\n\t A ="+a);
		System.out.print("\n\t B ="+b);		
		System.out.print("\n\t Mod ="+(a%b));
		System.out.print("\n\t Add ="+(a+b));
		System.out.print("\n\t Sub ="+(a-b));
		System.out.print("\n\t Mul ="+(a*b));
		System.out.print("\n\t Div ="+(a/b));
	}
	public static void main(String args[])
	{
		d40_1 ob=new d40_1();
		ob.in();
		ob.out();
	}
}*/

//By using 2 class
/*import java.io.*;
import java.util.Scanner;
import java.lang.*;
class d40
{
	int a,b;
	void in()
	{
		Scanner ss=new Scanner(System.in);
		
		System.out.print("\n\t Enter Value of A =");
		a=ss.nextInt();
		
		System.out.print("\n\t Enter value B =");
		b=ss.nextInt();
	}
	void out()
	{
	    System.out.print("\n\t A ="+a);
		System.out.print("\n\t B ="+b);		
		System.out.print("\n\t Mod ="+(a%b));
		System.out.print("\n\t Add ="+(a+b));
		System.out.print("\n\t Sub ="+(a-b));
		System.out.print("\n\t Mul ="+(a*b));
		System.out.print("\n\t Div ="+(a/b));
	}
}
class d40_1
{
	public static void main(String args[])
	{
		d40 ob=new d40();
		ob.in();
		ob.out();
	}
}*/



		
		
		



	
	
	
	
	
	
	
	
	

	