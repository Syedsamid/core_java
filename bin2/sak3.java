import java.io.*;
import java.lang.String;
import java.lang.*;
class sak3
{
 public static void main(String args[])// throws IOException
  {
  String s1,s2,s3,s4,s5,s6,s7;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  try
  {
   System.out.println("enter first string in lower case       :");
   s1=br.readLine();
   System.out.println("enter second string in uppercase   :");
   s2=br.readLine();
 


System.out.println("UpperCase="+s1.toUpperCase());
System.out.println("LowerCase="+s2.toLowerCase());

s3=s1.concat(s2);
System.out.println("after concatnating="+s3);

s4="JAVA";
s5=s4.replace('J','V');
System.out.println("after replacing="+s5);

s6="object";
System.out.println("String S6="+s6);
s7="object55";
System.out.println("String S7="+s7);

        int a=s7.length();
        System.out.println("after set length="+a);


   }catch(Exception e) {} 



                    
   
  
}
}










