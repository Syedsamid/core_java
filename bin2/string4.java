// To insert element at specified index
 import java.util.*;

   class string4
   {
    public static void main(String[] args)
      {
      Vector v= new Vector();
      v.addElement("10");
      v.addElement("20");
      v.addElement("30");

      v.add(3,"Second INSERTED ELEMENT");
            
      v.add(2,"First INSERTED ELEMENT");

      System.out.println("Vector contains...");

      for(int index = 0;index < v.size();index++)
      System.out.println(v.get(index));
     }
}

