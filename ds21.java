// program for string insert, append, length, reverse 
//string buffer
import java.io.*;
import java.lang.*;

class ds21
{
 public static void main(String args[])
 {

String s1,s2,s3;
int n,n0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

  try
  {
   System.out.println("Enter string :");
   s1=br.readLine();

  //StringBuffer str=new StringBuffer("VEDTIRTH"); 
  StringBuffer str=new StringBuffer(s1);
  System.out.println("Original string :"+str);

   System.out.println("Enter position :");
   n=Integer.parseInt(br.readLine());
   
   System.out.println("Enter string to be instert:");      
   s2=br.readLine();

  str.insert(n,s2);
  System.out.println("\n After inserting string :"+str);

   System.out.println("Enter string to be append:");
   s3=br.readLine();

  str.append(s3);
  System.out.println("\n After appending string :"+str);
  str.reverse();
  System.out.println("\n After reverse string :"+str);

   System.out.println("Enter len pos :");
   n0=Integer.parseInt(br.readLine());

  str.setLength(n0);
  System.out.println("\n After changing length of string :"+str);
   }catch(IOException e){}
 }
}

 


