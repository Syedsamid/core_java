// TO replace element from vector
 import java.util.*;
 class vector2
 {
 public static void main(String[] args)
 {
 Vector v = new Vector();
 v.add("10");
                          v.add("20");
v.add("30");
  for(int index =0;index< v.size();index++)
  System.out.println(v.get(index));
  v.set(1,"400");
  System.out.println("After replacing elements Vector contains...");
        for(int index =0;index< v.size();index++)

        System.out.println(v.get(index));

   }

}
