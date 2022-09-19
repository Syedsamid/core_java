//Demonstration use of vector
import java.io.*;
import java.lang.*;  
 import java.util.*;
 class list
 {
public static void main(String args[])
    {
      Vector v = new Vector();
    //  int length = args.length;
       System.out.println("list of languages ");

       for(int i=0;i<args.length;i++)
       {  
         v.addElement(args[i]);
         v.insertElementAt("COBOL",2);

           int size = v.size();

            String listarray[] = new String[size];
           v.copyInto(listarray);

             for(i=0;i<size;i++)
     {
      System.out.println("list array[i]");
     }
      }
   }
}
