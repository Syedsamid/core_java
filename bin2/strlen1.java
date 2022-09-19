

//  Program to define StringModify  with Object as String "java Browser"  Display the new String "java_Enabled  Browser.



  import java.io.*;
  import java.lang.*;


   class strlen

   {

   public static void main(String args[])

   {

   StringBuffer str =new StringBuffer("java Buffer");

      System.out.println("Original String :"+str);
      System.out.println("Length Of String:"+str.length());

      for(int i=0;i<str.length();i++)

         {

         int p=i+1;
         
         System.out.println("Character at position :"+p+" is "+str.charAt(i));
         }
 
     String s1 =  new String(str.toString());

       int pos=s1 .indexOf("browser");

       str.insert(pos,"Enabled");

       System.out.println("Modified String"+s1);

       str.setCharAt(5,'-');

       System.out.println("String now");

}

}
