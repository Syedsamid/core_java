import java.io.*;
import java.lang.*;
import java.util.Scanner;
class days
{
	public static void main(String arg[])throws IOException
	{
		int rd;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter days:");
		
		int days=sc.nextInt();
		int weeks=days/7;
		rd=days%7;
		/*int months=days/30;
		int year=days/365;*/
		System.out.println("Weeks="+weeks);
		System.out.println("Rem.Days="+rd);
		/*System.out.println("Years="+year);
		System.out.print("\n Months="+months);*/
	}
}
		