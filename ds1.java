// program for String functions

import java.io.*;
import java.lang.*;
//import java.String.*;

class ds1
{
 public static void main(String args[])
 {
  String s1,s2,s3,s4;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  try
  {
   System.out.println("Enter first string (lower case):");
   s1=br.readLine();
   System.out.println("Enter second string (uppercase):");
   s2=br.readLine();
   System.out.println(s1.toUpperCase());
   System.out.println(s2.toLowerCase());
  } catch(Exception e){}
  s3="JAVA";
  s4=s3.replace('J','V');
  System.out.println("After Reaplacing Alphabets :"+s4);
  }
}
  
