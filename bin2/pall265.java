import java.io.*;
import java.lang.*;

class pall265

{

        public static void main(String args[])
        {

        String s,s1,s2,s3;

        s1=args[0];
        s2=args[1];
        s3=args[2];
        s=s1.concat(s2);
        s=s.concat(s3);

       System.out.println("First Name=:"+s1);

       System.out.println("Middle Name=:"+s2);

       System.out.println("Surname Name=:"+s3);

       System.out.println("Full Name=:"+s);

       }

}
