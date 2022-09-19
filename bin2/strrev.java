import java.io.*;
import java.lang.*;
class reverse

{

      public static void main(String args[])

       {

        String s="COMPUTER";

        int i,l;

        l=s.length();

        System.out.println("The String IS :COMPUTER");
        System.out.println("The Reverse String is:");

        for(i=l-1;i>=0;i--)
        {

        System.out.print(s.charAt(i));
        }
        
   }

 }
