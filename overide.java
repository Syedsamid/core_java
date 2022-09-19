import java.io.*;
import java.lang.*;
class dep
{
	String name;
	dep(String s)
	{
		name=s;
	}
	void display()
	{
		System.out.println("Department nameis:"+name);
	}
}
class lab extends dep
{
	 String labname;
	 lab(String s,String n)
	 {
		 super(s);
		 labname=n;
	 }
	 void display()
	 {
		 System.out.println("Departement name="+name);
		 System.out.println("Liborately ="+labname);
	 }
}
class overide
{
	public static void main(String args[])
	{
		lab l=new lab("Computer science","Books of Departement");
		l.display();
	}
}


		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 