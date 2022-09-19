//Program for Interface

import java.io.*;
import java.lang.*;

 interface pall
{
  double pi=3.14;

 }

 class shape implements pall

 {

   int r;

 public void  get()

  {
  try
   {

   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the radious ");
    r=Integer.parseInt(br.readLine());
    }catch(Exception e) {}
  }
}

class area extends shape implements pall
 {

   double area;

  public void area()
  {
  try
  {
   get();

    area=(pi*r*r);
   System.out.println("Area Of circle is ="+area);
 }catch(Exception e) {}
   }  
}    

   class pallarea
  {
    public static void main(String args[])
     {
       area a=new area();
       a.area();
     }
   }
