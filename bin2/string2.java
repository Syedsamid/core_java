// create vector with seven element
  import java.util.*;
//  import java.util.Enumeration;
  class string2
    {
       public static void main(String args[])

     {
      Vector<Integer> v = new Vector<Integer>(3, 4);
      // Vector v = new Vector();
      System.out.println("Initial vector size:"+v.size());
      System.out.println("Initial vector capacity:"+v.capacity());
       v.addElement( new Integer(10));

       v.addElement( new Integer(30));    

       v.addElement( new Integer(50));

       v.addElement( new Integer(20));

       v.addElement( new Integer(40));

       v.addElement( new Integer(10));

       v.addElement( new Integer(20));


      System.out.println("Initial vector size:"+v.size());

      v.removeElementAt(3);
      v.removeElementAt(4);

      System.out.println("Final vector size:"+v.size());
      System.out.println("Initial vector capacity:"+v.capacity());
    }

}
