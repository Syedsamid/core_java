/*by using 1 class
package
class first
{
	data v1,v2,v3;
	void in()
	{
		accept
	}
   void out()
   {
	   display
   }
 public s v m()
 {
	first ob=new first();
	ob.in();
	ob.out();
 }
}*/


/*

//by using 2 class
package
class first     //object
{
	data v1,v2,v3;
	void in()
	{
		accept
	}
   void out()
   {
	   display
   }
   
}
class second       //save
{  
 public s v m()
 {
	first ob=new first();
	ob.in();
	ob.out();
 }
}

*/





/*
package
class one
{
	variab
	void about()
	{
		msg
		s_nm
		add
		gst
		c_no
	}
	void cust()
	{
		id
		nm
		add
		cn
	}
	void product()

	{
		id nm qty prz tot
		gtot
	}
}
class second 
{
	psvm(String args[])
	{
		
		String pas="",psz;
		one ob1=new one();
		try
		{
		Buffer
		  S.o.p(Entet paas =);
		  psz=ob.readLine();
		  
		  if(compareTo/equals)
		  {
			  ob1.about();
			  ob1.cust();
			  ob1.product();
			  
		  }
	  else
	  {
		  wrong
	  }
		}catch	
	}
}*/
//programe
import java.io.*;
import java.lang.*;
class firstclass
{
	String pass="sam",chech,m1;
	BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	try{
		n=pass.length();
		StringBuffer c=new StringBufer(pass);
		System.out.println("Enter the password=");
		check=ob.readLine();
		m=check.length();
		if(pass.compareTo(check)==0)
		{
			System.out.println("Password is correct");
		}
		else
		{
			System.out.println("Invalid password...");
		}
	}catch(Exception e){}
	