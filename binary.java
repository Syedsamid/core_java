import java.io.*;
import java.lang.*;

class binary
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Enter Binary no.to convert in Decimal=");
		String n=br.readLine();
		
		int d =  Integer.parseInt(n,2);
		System.out.println("Binary n convert to decimal n");
		System.out.println("Decimal n is :" +d);
	}
}
