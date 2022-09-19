import java.io.*;
import java.lang.*;
class salary
  {
    public static void main(String args[])throws IOException
   { 
     String enm;
	 int id,i,l;
	 Long cn;
	 Double sal,hra,da,ta,tax,gs;
	 
	 BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	 System.out.print("\n\t Enter Limit=");
	 l=Integer.parseInt(ob.readLine());

    for(i=1;i<=l;i++)
    {
	  System.out.print("\n-----------------"+i+"----------------------");
	  System.out.print("\n\t Enter Emp Id=");
	  id=Integer.parseInt(ob.readLine());

	  System.out.print("\n\t Enter Emp Name=");
	  enm=ob.readLine();
	  System.out.print("\n\t Enter Emp Contact Num=");	
	  cn=Long.parseLong(ob.readLine());

      System.out.print("\n\t Enter Sal=");
      sal=Double.parseDouble(ob.readLine());
      System.out.print("\n\tBasic Salary		="+sal);
      hra=sal*35/100;
      da=sal*20/100;
      ta=sal*5/100;
      tax=sal*2/100;
      System.out.print("\n\tHousing Rent Allowance	="+hra);
      System.out.print("\n\tDearness Allowance	="+da);
      System.out.print("\n\tTravelling Allowance	="+ta); 
      System.out.print("\n\tTAX		="+tax); 
      gs=sal-hra-da-ta-tax;
      System.out.print("\n\tGross Sal			="+gs); 
	}
   }
  }   
