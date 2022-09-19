// To append other objects in vector
    import java.util.*;
    import java.util.ArrayList;
    class vector1
    {
     public static void main(String[] args)
     {
     Vector v= new Vector();
     v.add("10");
     v.add("20");
     v.add("30");

     ArrayList arrayList = new  ArrayList();
     arrayList.add("400");
     arrayList.add("500");

   System.out.println("Before appending vector contains...");
     for(int i=0;i<v.size();i++)
       System.out.println(v.get(i));
       v.addAll(arrayList);

   System.out.println("After appending all elements of ArrayLit, Vector contains");
       for(int i=0; i<v.size();i++)
        System.out.println(v.get(i));
      }
    }
