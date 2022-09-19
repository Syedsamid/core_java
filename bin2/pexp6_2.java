//Accept The password from user
   import java.io.*;
   import java.lang.*;
   import java.lang.String;
   class password
   {
     int n,m,u;
     void get()
     {
     String pass ="Vcc",check,m1;
  BufferedReader obj=new BufferedReader (new InputStreamReader(System.in));
    try
    {

       n= pass.length();
       StringBuffer c=new StringBuffer(pass);

        System.out.println("Enetr the password=");
        check =obj.readLine();

        m=check.length();
            if(pass.compareTo(check)==0)
               {

               System.out.println("password is correct");
               c=c.append("Welcome to java");

           String k=new String(c);

           System.out.println("\n append String is ="+c);
           System.out.println("Reverse String is="+c.reverse());

      m1=k.replace(';','e');

           System.out.println("Final String ="+m1);



             }

               else

               {

               System.out.println("Invalid password_______Try again");


         }

         }catch(Exception e) {}

      }
    }

     class pexp6_2

     {

       public static void main(String args[])

        {

          password p=new password();

          p.get();

        }

     }
