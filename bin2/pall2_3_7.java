// program Dynamic Dispatch  Method


  import java.io.*;
  import java.lang.*;

  class OA
  {

    void callme()

    {

      System.out.println("Inside OA's callme method");
     }

   }

class OB extends OA

{

  // override callme

  void callme()

   {

    System.out.println("Inside OB's callme method");

  }
}

class OC extends OA

{

 // override callme

 void callme()

 {

 System.out.println("Inside OC's callme method");
 }
}

class  pall2_3_7
{

public static void main(String args[])

  {

    OA a= new OA();
    OB b= new OB();
    OC c= new OC();

    OA r; // obtain reference of type OA

    r = a;  //r refers  to an OA object
    r.callme(); //calls OA's version of callme()


    r = b;  //r refers  to an OB object

    r.callme(); //calls OB's version of callme()


    r = c; //r refers  to an OC object

    r.callme(); //calls OC's version of callme()


}

}


