//Thread for accending decending

import java.io.*;
import java.lang.*;
import java.lang.Thread;

class accending implements Runnable
{
 int i,p;

 public void run ()

   {
    for(i=0;i<=5;i++)
     {
     System.out.println("no is"+i);
     p=i*i;
     {
     try
     {
     Thread.sleep(2000);
     }catch(Exception e) {}
    }
     System.out.println("Square of no is ="+p);
     }
   }
 }

 class decending implements Runnable
 {
   int q,i;

    public void run ()
    {
     for(i=5;i>=1;i--)
     {
     System.out.println("No is"+i);
     q=i*i*i;
     {
     try
     {
     Thread.sleep(2000);
     }catch(Exception e) {}
    }

     System.out.println("Quibe of no is="+q);
     }
    }
  }
  
 class pallath
 {
  public static void main(String args[])
   {
      accending ac=new accending();
      Thread th=new Thread(ac);
      th.start();

      decending D=new decending();
      Thread thr=new Thread(D);
      thr.start();
     }
    }
