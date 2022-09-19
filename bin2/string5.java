//Swapping
import java.io.*;
import java.lang.*;
import java.util.Scanner;
class string5
{
public static void main(String args[]) 
{
String s1,s2;
Scanner sc=new Scanner(System.in);
System.out.print("\n\tEnter first String =");
s1=sc.nextLine();
System.out.print("\n\tEnter Second String =");
s2=sc.nextLine();

System.out.println("Before swapping....");
System.out.println("The first String="+s1);
System.out.println("The second String="+s2);

s1=s1+s2; 
s2=s1.substring(0,(s1.length()-s2.length()));
s1=s1.substring(s2.length()); 

System.out.println("\nAfter swapping...");
System.out.println("The first String="+s1);
System.out.println("The second String="+s2);
}
}