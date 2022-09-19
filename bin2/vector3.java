//  To search an element from vector
  import java.util.Vector;
   class  vector3
   {
    public static  void main(String[] args)
    {
    Vector v = new Vector();
    v.add("10");
    v.add("20");
    v.add("30");
    v.add("40");
    v.add("50");
    v.add("10");
    v.add("20");
 System.out.println("Vector elements are:");
  for(int index = 0;index < v.size();index++)

      System.out.println(v.get(index));

       boolean blnFound = v.contains("30");

       System.out.println("Vector contains 30 :"+blnFound);
       boolean blnFound1 = v.contains("100");

       System.out.println("Vector contains 100 :"+blnFound1);

       int index = v.indexOf("50");
       if(index == -1)

         System.out.println("Vector does not contain 50");
        else
         System.out.println("Vector contain 50 at index :"+index);

          int LastIndex = v.lastIndexOf("20");
          if(LastIndex == -1)
{
          System.out.println("Vector does not contain 20");
}
          else
{
 System.out.println("Last occurence of 20 in Vector is at index :" +LastIndex);
}
   }
  }
