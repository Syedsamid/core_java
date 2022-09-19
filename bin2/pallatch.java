//Program for Thread 


import java.io.*;
import java.lang.*;
import java.lang.Thread;

 class positive extends Thread

 {  int i;

   public void run()

   {

   for(i=0;i<=10;i++)

    {

    if(i>0)

    {
    try
    {
     Thread.sleep(2500);
     }catch(Exception e) {}
    }
    System.out.println("Positive no is ="+i);
   }
  }
}


  class negative extends Thread

   {
     int i;

     public void run()

     {
      for(i=0;i>-10;i--)
      {
       if(i<0);

       {
       try
       {
       Thread.sleep(2500);
      }catch(Exception e) {}
     }
     System.out.println("Negative no is ="+i);
    }
   }
}


 class pallatch

 {
   public static void main(String args[])

    {

      positive p=new positive();
      negative n=new negative();
      p.start();
      n.start();
    }
  }
