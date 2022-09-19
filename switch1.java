/*scanner
import java.io.*;
import java.lang.*;
import java.util.Scanner;
class switch1
{
	public static void main(String ar[])
	{
		
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\t1]Days");
		System.out.println("\n\t2]Year");
		System.out.println("\n\t3]Months");
		System.out.println("\n\t4]Week");
 
		System.out.println("Enter Your Choice :");
		ch=sc.nextInt();
	switch(ch)
	  {
		  case 1:System.out.println("U Select Days");
          break;
		  case 2:System.out.println("U Select Year");
          break;
		  case 3:System.out.println("U Select Month");
          break;
		  case 4:System.out.println("U Select Week");
          break;
		
		  default:
				System.out.print("\n\t WRONG CHOICE...");
	  }
	}
}
*/
//data input stream
/*import java.io.*;
import java.lang.*;
class switch1
{
	public static void main(String args[])
	{
		int ch=Integer.parseInt(args[0]);
		
		System.out.println("\n\tEnter your choice");
		switch(ch)
		{
			case 1:System.out.println("U Select days");
			break;
			case 2:System.out.println("U Select year");
			break;
			case 3:System.out.println("U select Month");
			break;
			case 4:System.out.println("U select weeks");
			break;
			default:System.out.println("\n\t Wrong choice...");
		}
	}
}*/
//cmdline argument
/*import java.io.*;
import java.lang.*;
class switch1
{
	
	public static void main(String args[])
	{
		int ch=Integer.parseInt(args[0]);
		
		System.out.println("\n\tEnter your choice");
		switch(ch)
		{
			case 1:System.out.println("U Select days");
			break;
			case 2:System.out.println("U Select year");
			break;
			case 3:System.out.println("U select Month");
			break;
			case 4:System.out.println("U select weeks");
			break;
			default:System.out.println("\n\t Wrong choice...");
			
		}
	}
}



}*/
//bufferedreader
import java.io.*;
import java.lang.*;
class switch1
{
	
	public static void main(String args[])
	{
		int ch;
		try
		{
		BufferedReader on=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("\n\tEnter your choice");
		ch=Integer.parseInt(on.readLine());
		switch(ch)
		{
			case 1:System.out.println("U Select days");
			break;
			case 2:System.out.println("U Select year");
			break;
			case 3:System.out.println("U select Month");
			break;
			case 4:System.out.println("U select weeks");
			break;
			default:System.out.println("\n\t Wrong choice...");
			
		}
	}catch(IOException e){}
}
}