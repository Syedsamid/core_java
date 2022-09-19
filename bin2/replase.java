/* java StringBuffer Replace Example

        This example shows how contents of java StringBuffer can be replaced using

        replace method of java StringBuffer class. */


import java.io.*;
import java.lang.*;


class replase
{

        public static void main(String[] args)

        {

                                                          //Create the StringBuffer object

        StringBuffer sb = new StringBuffer("Hello World");

        System.out.println("Original Text:"+sb);

                                                                        /* To replace the contents of java StringBuffer use StringBuffer replace(int start,int end,String str)method.
                                                                       It replace the contents from StringBuffer string from start

                                                                        index to end - 1 index by the content of the String str.*/


         sb.replace(3,5,"Hi");

        System.out.println("Replace Text:"+ sb);

        }

 }

