//count no of occurence of char 'a'


    import java.io.*;
    import java.lang.*;

    class count
{
        public static void main(String args[])

        {

          String s;
          s="samid";

                    int i,l,f=0,ctr=0;

                        l=s.length();

                   for(i=0;i<l;i++)
                {
                if(s.charAt(i)=='a')
                {
                        f=1;
                        ctr++;
                }
        }
        if(f==1)
        {

        System.out.println("The number of A is:"+ctr);

        }

        else

        {

        System.out.println("No A Found");

        }
       }
 }
