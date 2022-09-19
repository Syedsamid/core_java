/*import java.io.*;
import java.lang.*;
class days2
{
	public static void main(String args[])
	{
		Double days,rd,weeks;
		days=Double.parseDouble (args[0]);
		
		System.out.println("\n\tday    ="+days);
		
		weeks=days/7;
		System.out.println("Weeks       ="+weeks);
		rd=days%7;

		System.out.println("Rem.Days    ="+rd);
	}
}*/
//data input stream
/*import java.io.*;
import java.lang.*;
class days2
{
	public static void main(String args[])throws IOException
	{
		Double days,rd,weeks;
		DataInputStream ob=new DataInputStream(System.in);
		System.out.println("\n\tEnter days    =");
		days=Double.parseDouble(ob.readLine());
		weeks=days/7;
		System.out.println("Weeks       ="+weeks);
		rd=days%7;

		System.out.println("rem.Days    ="+rd);
		
	}
}*/
//Buffered  Reader
/*import java.io.*;
import java.lang.*;
class days2
{
	public static void main(String args[])throws IOException
	{
		Double days,rd,weeks;
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n\tEnter days    =");
		days=Double.parseDouble(ob.readLine());
		weeks=days/7;
		System.out.println("Weeks       ="+weeks);
		rd=days%7;

		System.out.println("rem.Days    ="+rd);
		
	}
}*/
//try catch
import java.io.*;
import java.lang.*;
class days2
{
	public static void main(String args[])
	{
		Double days,rd,weeks;
		try{
			
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\n\tEnter days    =");
		days=Double.parseDouble(ob.readLine());
		weeks=days/7;
		System.out.println("Weeks       ="+weeks);
		rd=days%7;

		System.out.println("rem.Days    ="+rd);
		}catch(IOException e){}
	}
}
