//password
import java.io.*;
import java.lang.*;
class passworcmd

{
      public static void main(String args[])
    {

     int n,m,i;
     String pass="TYCM",check,m1;
     BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
     try
     {
        n=pass.length();
        StringBuffer c=new StringBuffer(pass);
        System.out.println("enter the password=");
        check=ob.readLine();
        m=check.length();
       //if(pass.compareTo(check)==0)         //bydefault.compare to(user define)
	if(check.equals(pass))          //user define.equals(bydefault)
        {
           System.out.println("password is correct");
		   
        }

else
        {
           System.out.println("Invalid password....try again");
        }
     }catch(Exception e){}
   }
}

