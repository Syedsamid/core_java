//count the no of vowels


    import java.io.*;
    import java.lang.*;

    class vowels
    {

     public static void main(String args[])

       {

       try
       {

BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));

     System.out.println("Enter the string");
     String s=obj.readLine();
     int vcnt=0;
     int l=s.length();
     char ch;
     for(int i=0;i<l;i++)

     {

       ch =s.charAt(i);
   if(ch =='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')

       {

       vcnt++;

        }
 }
        System.out.println("The number of vowels in string is:"+vcnt);
        }
       catch(Exception e)  {}

       }

}

