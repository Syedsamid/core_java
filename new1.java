
import java.io.*;
import java.lang.*;
class new1
{ 	
public static void main(String args[])
{
Double sal,hra,da,ta,tax,gs;
sal=Double.parseDouble(args[0]);
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
