/*import java.io.*;
import java.lang.*;
import java.lang.String;
import java.util.Scanner;
class pass
{
	public static void main (String args[])
	{
	String id="Samid",id1;
	String pass="12345",pass1;
	int c;
	String s1,st1;
	
	BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	try
	{
		System.out.println("\n\t Enter your user ID:");
		id1=ob.readLine();
		System.out.println("\n\t Enter Password:");
		pass1=ob.readLine();
		
		if(id.compareTo(id1)==0 && pass.compareTo(pass1)==0)
		{
			System.out.println("Welcome to home");
            System.out.println("\t 1.String");
            System.out.println("\t 2.StringBuffer");
            System.out.print("\tWhat do u want [1/2]:");
			c=Integer.parseInt(ob.readLine());
			if(c==1)
			{
				Scanner sc=new Scanner(System.in);
				
				System.out.println("\n\t You select string..");
				System.out.println("\n\t Enter your name...");
				String str=sc.nextLine();
				
	   	System.out.println("Original String is :" +str);
		System.out.println("Uppercase="+str.toUpperCase());
		System.out.println("LowerCase="+str.toLowerCase());
		System.out.println("length="+str.length());
		System.out.println("Replace"+str.replace("d","l"));
		System.out.println("Trim="+str.trim());
		System.out.println("Charat="+str.charAt(2));
		System.out.println("\n\t Enter new string...");
				String str1=sc.nextLine();
		System.out.println("equals="+str.equals(str1));
		System.out.println("concat="+str.concat(str1));
		System.out.println("equalslgnoreCase="+str.equalsIgnoreCase(str1));
		System.out.println("compareTo="+str.compareTo(str1));
		System.out.println("substring="+str.substring(2,3));
		System.out.println("indexof="+str.indexOf('s'));
		System.out.println("indexof="+str.indexOf('m',3));
			}
			else
				if(c==2)
			{
				Scanner ob1=new Scanner(System.in);
				
				System.out.println("\n\t You select Buffer..");
				System.out.println("\n\t Enter your name...");
				String st=ob1.nextLine();
				StringBuffer str=new StringBuffer(st); 
				str.setCharAt(5,'w');
		System.out.println("setCharAt="+str);
        System.out.println("append="+str.append("syed"));
		str.insert(3,"saud");
		System.out.println("insert="+str);
		str.setLength(3);
		System.out.println("setLength="+(str));
		    }
		
		else
		{
			System.out.println("You have entered invalid password");
		}
		}
	}catch(Exception e){}
}
}*/






import java.io.*;
import java.lang.*;
import java.lang.String;
import java.util.Scanner;
class pass
{
	public static void main (String args[])
	{
	String id="Samid",id1;
	String pass="12345",pass1;
	int c;
	String s1,st1;
	
	BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	try
	{
		System.out.println("\n\t Enter your user ID:");
		id1=ob.readLine();
		System.out.println("\n\t Enter Password:");
		pass1=ob.readLine();
		
		if(id.compareTo(id1)==0 && pass.compareTo(pass1)==0)
		{
			System.out.println("Welcome to home");
            System.out.println("\t 1.String");
            System.out.println("\t 2.StringBuffer");
            System.out.print("\tWhat do u want [1/2]:");
			c=Integer.parseInt(ob.readLine());
			if(c==1)
			{
				Scanner sc=new Scanner(System.in);
				
				System.out.println("\n\t You select string..");
				System.out.println("\n\t Enter your name...");
				String str=sc.nextLine();
				
	   	System.out.println("Original String is :" +str);
		System.out.println("Uppercase="+str.toUpperCase());
		System.out.println("LowerCase="+str.toLowerCase());
		System.out.println("length="+str.length());
		System.out.println("Replace"+str.replace("d","f"));
		System.out.println("Trim="+str.trim());
		System.out.println("Charat="+str.charAt(2));
		System.out.println("\n\t Enter new string...");
				String str1=sc.nextLine();
		System.out.println("equals="+str.equals(str1));
		System.out.println("concat="+str.concat(str1));
		System.out.println("equalslgnoreCase="+str.equalsIgnoreCase(str1));
		System.out.println("compareTo="+str.compareTo(str1));
		System.out.println("substring="+str.substring(2,3));
		System.out.println("indexof="+str.indexOf('s'));
		System.out.println("indexof="+str.indexOf('m',3));
	
			 }
		 
		}
		else
		  {
			System.out.println("You have entered invalid password");
		  }
	
	}catch(Exception e){}
}
}

	
	