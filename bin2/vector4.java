//  To replace element from Vector
  import java.io.*;
  import java.lang.*;
  import java.util.Vector;
  class vector4
  {
    public static void main(String args[])
      {
        Vector v=new Vector();
         v.add("10");
         v.add("20");
         v.add("30");

          for(int index=0;index<v.size();index++)
           System.out.println(v.get(index));

           v.set(1,"400");
           System.out.println("After replacing element Vector contains...");

             for(int index=0;index<v.size();index++)
              System.out.println(v.get(index));
            }
}