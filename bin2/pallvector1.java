//Demonstration use of vector
 import java.io.*;
 import java.lang.*;
 import java.util.*;
 class pallvector1
 {
    public static void main(String args[])
    {
      Vector list = new Vector();
      int length = args.length;
      for(int i=0;i<length;i++)
      {
        list.addElement(args[i]);
       }
       list.insertElementAt("COBOL",2);
       int size = list.size();
       String listarray[] = new String[size];
       list.copyInto(listarray);
       System.out.println("list of languages ");

       for(int i=0;i<size;i++)
       {
        System.out.println("list array");
        }
      }
}