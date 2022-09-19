//program depend on method overriding



     import java.io.*;
     import java.lang.*;

     class  Super

     {

       int a;
       Super(int a)

       {

         this.a = a;

       }

   void display()   // method defined //

   {

     System.out.println("super a ="+a);

   }

}

 class Sub extends Super

   {

     int y;
     Sub(int a,int y)

     {

     super (a);
      this.y = y;

     }

  void display()   //method defined  again

  {

   System.out.println("super a ="+a);

   System.out.println("sub y ="+y);

  }
}

class pall2_3_6

{

  public static void main(String args[])

   {

   Sub S1 = new Sub (100,200);

    S1.display();

   }

 }

