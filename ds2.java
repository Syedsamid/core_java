// program for string insert, append, length, reverse 

import java.io.*;
import java.lang.*;

class ds2
{
 public static void main(String args[])
 {
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
}

 


