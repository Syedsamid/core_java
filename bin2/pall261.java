 // count the no of numeric char in a string


                import java.io.*;
                import java.lang.*;


            class pall261

           {

             public static void main(String args[])

                {

                try
          {
    BufferedReader din=new BufferedReader(new InputStreamReader(System.in));

             System.out.println("Enter the String:");
                 
                     String s=din.readLine();

                     int counter=0;
                     int l=s.length();
                     char ch;

           for(int i=0;i<l;i++)

                 {

                     ch=s.charAt(i);
                  if(ch>'A'&&ch<='Z')

                   {

                   counter++;

                   }

                 }         
      System.out.println("The number of digits in String is :"+counter);

    }
    catch(Exception e) {}

  }

}



