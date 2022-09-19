//Information about student


   import java.io.*;
   import java.lang.*;

   class present

   {

             int rn;
     String name;


      stud(int r,String n)

      {
         rn=r;
         name=n;

       }

    void put()

    {

      System.out.println("Roll no :"+rn);
      System.out.println("Name :"+name);

    }

}

class stud_att_cal extends stud

{

     double preentday;
  stud_att_cal(int r,String n,double p)

{

  super(r,n);
  preentday=p;

 }

void calculate()

{

   double avg=(100 * preentday)/180;

    super.put();

   System.out.println("Present Days :"+preentday);
   System.out.println("Average attendence :"+avg);

 }

}

class pall2_3_5
{

public static void main(String args[])

   {

    stud_att_cal S1 =new stud_att_cal(2,"Advita",137);
    S1.calculate();

    }

}

