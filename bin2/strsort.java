
//string with array
import java.io.*;
import java.lang.*;


public class strsort

{
public static void main(String args[])
{

String str[] = new String[10];
int i,j;
try
    {

        InputStreamReader in = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(in);

        System.out.println("Enter the strings to be sort::");

        for(i=0;i<10;i++)

         {

                str[i] = br.readLine();
         }

         System.out.println("Sorted strings are::");

         for(i=0;i<10;i++)
         {

         for(j=i+1;j<10;j++)
         {
                         if(str[j].compareTo(str[i])<0)
                

          {

                String temp =str[i];

                str[i] = str[j];
                str[j] = temp;

           }
         }

         System.out.println(str[i]);

         }

        }catch(Exception e)

         {                       
         }


      }

 }

