//Implement  To Accept a String From user and count all the users and count all the Occurence of particular word in a string.
import java.io.*;
import java.lang.*;
class pexp6_1
{
public static void main(String args[])
{
int vcount=0,l,i;
char ch;
String s;
try
{
 BufferedReader obj= new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter the String:");
 s=obj.readLine();
 l=s.length();
 for(i=0;i<l;i++)
  {
  ch =s.charAt(i);
  if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
    {
    vcount++;
    }
   }
  System.out.println("The no of vowel ="+vcount);
 }catch(Exception e)  {}
}
}

