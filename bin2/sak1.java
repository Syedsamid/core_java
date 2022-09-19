import java.io.*;

import java.util.Vector;

class sak1
{
  public static void main(String args[])throws IOException
   {
   int in;
   Vector v=new Vector();
   try
   {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     
    System.out.println("before add size:"+v.size());
    System.out.println("before add capacity:"+v.capacity());

    System.out.println("how many num u want to enter");
    int num=Integer.parseInt(br.readLine());
     System.out.println("enter integer no");
         for(int i=0;i<num;i++)
         {
         int no=Integer.parseInt(br.readLine());
         v.addElement(new Integer(no));
         }
    v.addElement(new Float(2.5));
    v.addElement("sakshi");
    v.addElement('s');
              
        System.out.println("after add size="+v.size());
        System.out.println("after add capacity="+v.capacity());

        System.out.println("enter no. u want to delete");
        int index=Integer.parseInt(br.readLine());


      v.removeElement(index);
         
        
    v.insertElementAt(1,2);
   
          
              System.out.println("after set elements size="+v.set(1,"596"));
         for(in=0;in<=v.size();in++)
         System.out.println(v.get(in));


              v.removeAllElements();
       

                   
         System.out.println("after remove elements size="+v.size());



}catch(Exception e){}
}
}




