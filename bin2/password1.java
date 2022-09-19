import java.io.*;
import java.lang.*;
import java.lang.String;

class password1
{
int n1,n,i,j,f,ctr=0,l=3,choice,m,m1,y1;

String id="vedtirth11",id1;
String  s3,s2,s4,s5;
String pass="vedtirth",pass1,name;

boolean y;

	344
    void get()
  {
   try
   {

   System.out.print("\t\t\t\t\t USER ID	    :: ");
   id1=(o.readLine());
   System.out.print("\t\t\t\t\t PASSWORD           :: ");
   pass1=(o.readLine());
 
   n=id.length();
   m=pass.length();  

   n1=id.length();
   m1=pass.length();  
   StringBuffer d=new StringBuffer(pass);

   
     if(id.compareTo(id1)==0 && pass.compareTo(pass1)==0 ) 
   { 
      System.out.println("\n\n\t\t\t\t your  id & password is authenticated");
       System.out.print("\t\t\t\t\tEnter your name:");
       name=(o.readLine());
       
      System.out.println("\n\t\t\t\t  WELCOME "+name+ " IN STRING & STRINGBUFFER");

   //   d=d.append("  WELCOME IN STRING & STRINGBUFFER");
   
   //   String k=new String(d);
   //   System.out.println(d+(" "));

    System.out.println("\n\t\t\t\t ===========  M E N U ==========");
    System.out.println("\t\t\t\t 1.String");
    System.out.println("\t\t\t\t 2.StringBuffer");
    System.out.print("\t\t\t\t What do u want [1/2]:");
    int w=Integer.parseInt(o.readLine());

      if (w==1)
       {
         str();
         {
      System.out.print("\t\t\t\t Do U Want To Continue[y/n]:");
       String c=(o.readLine());    
         }
          y=true;
            if(y)
           {
                str();
           }
            else
           {
              System.out.println("\t\t\t\t --------------------------------------");
            }
        }
      else if (w==2)
     {
               strbuff();
          System.out.print("\t\t\t\t Do U Want To Continue[y/n]:");
          String c=(o.readLine());
          y=true;
            if(y)        
           {
                 strbuff();
           }
            else
           {
                System.out.println("\t\t\t\t -------------------------------------");
           }
     } 

    
      else
    {
       System.out.println("\t\t\t\t Ur id or password is not matched");
       System.out.println("\t\t\t\t plz try again later"); 
    }
   }
 }catch(Exception e){}
}

 
 
   void str()

 {
    try 
   {
       
       System.out.println("\t\t\t\t 1. charAt()");
       System.out.println("\t\t\t\t 2. toUpperCase()");
       System.out.println("\t\t\t\t 3. toLowerCase()");
       System.out.println("\t\t\t\t 4. length()");
       System.out.println("\t\t\t\t 5. replace('x''y')");
       System.out.println("\t\t\t\t 6. concat()");
       System.out.println("\t\t\t\t 7. compareTo(s2)");
       System.out.println("\t\t\t\t 8. indexOf('x',n)");
	   System.out.println("\t\t\t\t 9. subString(n)");
       System.out.print("\n\t\t\t\t Enter your choice[1-9]:");
       int choice=Integer.parseInt(o.readLine());
 
        System.out.print("\n\t\t\t\t Enter the String : ");
        s5=(o.readLine());

  switch(choice)
  {
   case 1:
      System.out.println("\t\t\t\t Your choice is charAt()");
    
      for(i=1;i<l;i++)
     {
        if(s5.charAt(i)=='a')
        {
           f=1;
           ctr++;
        }
     }
       if(f==1)
        {
          System.out.println("\t\t\t\t The no of a is:"+ctr);
        }
       else
        { 
          System.out.println("\t\t\t\t no found");
        }
      System.out.println("\t\t\t\t --------------------------------------------");
   break;
   case 2:
       System.out.println("\n\t\t\t\t Your choice is  toUpperCase()");
       System.out.println("\t\t\t\t Lower Case to Upper Case:"+s5.toUpperCase());
       System.out.println("\t\t\t\t ------------------------------------------");
   break;
   case 3:
      System.out.println("\n\t\t\t\t Your choice is  toLowerCase()");
      System.out.println("\t\t\t\t Upper Case to Lower Case:"+s5.toLowerCase());        
      System.out.println("\t\t\t\t ----------------------------------------");
   break;
   case 4:
      System.out.println("\n\t\t\t\t Your choice is length()");
      int len=s5.length();
      System.out.println("\t\t\t\t Length of a string is :"+len);
      System.out.println("\t\t\t\t -----------------------------------------");
   break;
   case 5:
     System.out.println("\n\t\t\t\t Your choice is replace");
      StringBuffer sb1=new StringBuffer("Welcome in Java") ;
    
      System.out.print("\t\t\t\t Enter the char u want to replace : ") ;
      String rep=(o.readLine());
      System.out.println("\t\t\t\t Original String:"+s5);                                        // ?
      s4=s5.replace('a','w');
      System.out.println("\t\t\t\t Replaced string:"+s4);
      System.out.println("\t\t\t\t ----------------------------------------");
   break;
   case 6:
      System.out.println("\n\t\t\t\t Your choice is concat()");
      System.out.print("\t\t\t\t Enter second string:");
      String s2=(o.readLine());     
      s3=s5.concat(s2);
      System.out.println("\n\t\t\t\t Concated string:"+s3);
      System.out.println("\t\t\t\t -----------------------------------------");
   break;
   case 7:
       System.out.println("\n\t\t\t\t Ur choice is compareTo(s2)");                                                     //  No
       System.out.print("\t\t\t\t Enter the second string:");
       
      System.out.println("\t\t\t\t ----------------------------------------");  
   break;
   case 8:                                                                                                                               // No
       System.out.println("\n\t\t\t\t Ur choice is indexOf('x',n)");
   
       System.out.println("\t\t\t\t ---------------------------------------");
     break;
  
    case 9:
      System.out.println("\n\t\t\t\t Your choice is subString()");
      System.out.print("\t\t\t\t Enter String:");
      String s7=(o.readLine()); 
      System.out.print("\t\t\t\t Enter start Number :");
      int s=Integer.parseInt(o.readLine()); 
      System.out.print("\t\t\t\t Enter End Number :");
      int e=Integer.parseInt(o.readLine()); 
            
	  
      s3=s7.substring(s,e);
      System.out.println("\n\t\t\t\t Substring:"+s3);
      System.out.println("\t\t\t\t -----------------------------------------");
    
  default:
        System.out.println("\n\t\t\t\t Ur choice is wrong");
       }

    }catch(Exception e){}
  }
      
	  void strbuff()
  {
StringBuffer d1=new StringBuffer("xyz");
    try
    {
//do
//{
    System.out.println("1) .setcharAt(x,'n') ");    
    System.out.println("2) .append(s2)");
    System.out.println("3) .insert(n,s2)");    
    System.out.println("4) .setLength(n)");    
    System.out.println("5) .reverse ");    
    System.out.println("Enter your choice[1-5]:");
    int z=Integer.parseInt(o.readLine());
    switch(z)
     {
      case 1:                                                                                                          // No
         System.out.println("ur choice is setcharAt(x,'n')");
         
      break;
      case 2:
         System.out.println("ur choice is append(s2)");
         System.out.println("Enter the second string:");
         d1.append (" in Java ");
         System.out.println("After appending string"+s5);
      break;
      case 3:
         System.out.println("ur choice is insert(n,s2)");
         d1.insert(4,"-");
         System.out.println("After inserting  New string"+s5);
      break;
      case 4:
         System.out.println("ur choice is setLength(n)");
         d1.setLength(3);
         System.out.println("After changing Length of String"+s5);
      break;
      case 5:
         System.out.println("ur choice is reverse()");
         d1.reverse();
         System.out.println("After reversing string"+s5);
      break;
     }
    
 //         System.out.println("Continue ....[y=1/n=0] :");
   //        y1=Integer.parseInt(o.readLine());
//}while(y1!=5);
 
	

    }catch(Exception e){}
 
}
}
    public class p3string
{
  public static void main(String args[])
 {
   project p=new project();
  p.get();
 // p.strbuff();
}    }