// To accept as many integers as user wants in a vector

   import java.util.Vector;
//   import java.util.Enumeration;
   import java.util.*;
   import java.io.*;
      class dv7
    {
     public static void main(String args[])throws IOException
       {
       Vector  v= new Vector();
   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter no of Integer elements want to enter :");

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++)

          {

            System.out.println("Enter Integer :");

            int no = Integer.parseInt(br.readLine());

            v.addElement(new Integer(no));

          }
           System.out.println("initial vector size :"+v.size());

       System.out.println("Vector contents before remove elements....");

           for(int index=0;index < v.size();index++)

           System.out.println(v.get(index));

           System.out.println("Enter index of element to be deleted :");

           int i = Integer.parseInt(br.readLine());


           v.removeElementAt(i);

           System.out.println("Final vector size :"+v.size());

           System.out.println("Vector contents after remove element...");

           for(int ii=0;ii<v.size();ii++)

                         System.out.println(v.get(ii));

     }

}

