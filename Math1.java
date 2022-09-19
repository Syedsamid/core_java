import java.io.*;
import java.lang.Math.*;
import java.lang.*;
class Math1
{
 public static void main(String ar[])
 {
	  Double no,a,b;
	  try
	  {
	BufferedReader	ob=new BufferedReader(new InputStreamReader(System.in));  
	System.out.print("\n\t Enter Any Num =");
     no=Double.parseDouble(ob.readLine());	
     System.out.print("\n\t Sqrt  :"+Math.sqrt(no))	;
	 System.out.print("\n\t Square  :"+Math.pow(no,2))	;
	

     System.out.print("\n\t Enter Num 1 =");
     a=Double.parseDouble(ob.readLine());	
    	
	System.out.print("\n\t Enter Num 2 =");
     b=Double.parseDouble(ob.readLine());	
      System.out.print("\n\t Min Value ="+Math.min(a,b));
	  }
	  
	  catch(IOException e)
	  {
	  System.out.print(e);
	  }
 }
}
	  