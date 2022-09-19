/*
sal=?

hra=35%
Da=20%
Ta=5%
tx=2%
netsal
*/

/*Bydefault
import java.io.*;
import java.lang.*;
class DSal
{																		
public static void main(String args[])
{
Double sal,hra,da,ta,tax,gs;
sal=50000.45;
System.out.print("\n\tBasic Salary		="+sal);
hra=sal*35/100;
da=sal*20/100;
ta=sal*5/100;
tax=sal*2/100;
System.out.print("\n\tHousing Rent Allowance	="+hra);
System.out.print("\n\tDearness Allowance	="+da);
System.out.print("\n\tTravelling Allowance	="+ta); 
System.out.print("\n\tTAX				="+tax); 
gs=sal-hra-da-ta-tax;
System.out.print("\n\tGross Sal				="+gs); 
}
} 
*/

//cmd line Argu
/*
import java.io.*;
import java.lang.*;
class DSal
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
 
*/ 
 
//Scanner
/*import java.io.*;
import java.lang.*;
import java.util.Scanner;
class DSal
{
public static void main(String args[])
{
	
String enm;
int id;
Long cn;
Double sal,hra,da,ta,tax,gs;
Scanner sc=new Scanner(System.in);
System.out.print("\n\t Enter Emp Id=");
id=sc.nextInt();

System.out.print("\n\t Enter Emp Name=");
enm=sc.next();
System.out.print("\n\t Enter Emp Contact Num=");
cn=sc.nextLong();

System.out.print("\n\t Enter Sal=");
sal=sc.nextDouble();
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
 */
//DataInputStream
/*import java.io.*;
import java.lang.*;
import java.util.Scanner;
class DSal
{
public static void main(String args[])throws IOException
{
String enm;
int id;
Long cn;
Double sal,hra,da,ta,tax,gs;

DataInputStream ob=new DataInputStream(System.in);

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
 */
 //BufferedReader
/*import java.io.*;
import java.lang.*;
import java.util.Scanner;
class DSal
{
public static void main(String args[])throws IOException
{
	
String enm;
int id;
Long cn;
Double sal,hra,da,ta,tax,gs;
BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));

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
  */



/*import java.io.*;
import java.lang.*;
import java.util.Scanner;
class DSal
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
//for(;;)
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
*/
/*
import java.io.*;
import java.lang.*;
import java.util.Scanner;
class DSal
{
public static void main(String args[])throws IOException
{
int i;
for(i=65;i<=80;i++)
{
	System.out.print(" "+(char)i);
}
}
}	
*/
/*
import java.io.*;
import java.lang.*;
import java.util.Scanner;
class DSal
{
public static void main(String args[])throws IOException
{
int i;
System.out.print("\nASECENDING ");
for(i=65;i<=80;i++)
{
	System.out.print(" "+i);
}
}
}	
*/
/*
import java.io.*;
import java.lang.*;
import java.util.Scanner;
class DSal
{
public static void main(String args[])throws IOException
{
int i;
System.out.print("\nDESECENDING ");
for(i=80;i>=65;i--)
{
		System.out.print(" "+i);
}}}	
  
*/
/*
import java.io.*;
import java.lang.*;
import java.util.Scanner;
class DSal
{
public static void main(String args[])throws IOException
{
int i;
System.out.print("\nEVEN ");
for(i=2;i<=30;i+=2)
{
		System.out.print(" "+i);
}}}	
  
*/
/*
import java.io.*;
import java.lang.*;
import java.util.Scanner;
class DSal
{
public static void main(String args[])throws IOException
{
int i;
System.out.print("\nODD ");
for(i=1;i<=30;i+=2)
{
		System.out.print(" "+i);
}}}	
  
 */
 /*
import java.io.*;
import java.lang.*;
import java.util.Scanner;
class DSal
{
public static void main(String args[])throws IOException
{
int i;
System.out.print("\nODD ");
for(i=7;i<=70;i+=7)
{
		System.out.print("\n "+i);
}}}	

*/
//while Loop
/*
import java.io.*;
import java.lang.*;
import java.util.Scanner;
class DSal
{
public static void main(String args[])throws IOException
{
int i;
System.out.print("\nODD ");

	i=7;
while(i<=70)
{
//		i=i+7;  //i+=7
		System.out.print("\n "+i);
				i=i+7;  //i+=7
}}}	

*/
 
//do-while 
import java.io.*;
import java.lang.*;

class DSal
{
public static void main(String args[])throws IOException
{
int i;
System.out.print("\nODD ");

	i=7;
do
{
//		i=i+7;  //i+=7
		System.out.print("\n "+i);
				i=i+7;  //i+=7
}while(i<=70);

}}	
 
 
 
 
  
 