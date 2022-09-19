//password

import java.io.*;
import java.lang.*;

class password2
{
   int n,m,i;
   void get()
   {
     String pass="TYCM",check,m1;
     BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
     try
     {
        n=pass.length();
        StringBuffer c=new StringBuffer(pass);
        System.out.println("enter the password=");
        check=ob.readLine();
        m=check.length();
        if(pass.compareTo(check)==0)
        {
           System.out.println("password is correct");
		    StringBuffer str=new StringBuffer("Object Language");
  System.out.println("Original string :"+str);

  str.insert(7,"Oriented");
  System.out.println("\n After inserting string :"+str);

  str.append("c++ & Java");
  System.out.println("\n After appending string :"+str);

  str.setLength(6);
  System.out.println("\n After changing length of string :"+str);

  str.reverse();
  System.out.println("\n After reverse string :"+str);
 
        }
        else
        {
           System.out.println("Invalid password....try again");
        }
      /*  c=s.append("Welcome to java...");
        String k=new String(c);
        System.out.println("\n append string is="+c);
        System.out.println("\n reverse string is="+c.reverse());
        m1=k.replace(';');
        System.out.println("final string="+m1);*/
     }catch(Exception e){}
   }
}

   class p18
   {
      public static void main(String args[])
      {
        password p=new password();
        p.get();
      }
   }


