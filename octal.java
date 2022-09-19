import java.io.*;
import java.lang.*;
class octal
{
	public static void main (String args[]) throws Exception
	{
		String n=null;
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Enter binary number :");
		n=br.readLine();
		
		int d=Integer.parseInt(n,2);
		System.out.println("Decimal value:"+d);
		
		String o = Integer.toOctalString(d);
		System.out.println("Binary "+ n +" in Octal is"+ o);
		
		String o1=Integer.toHexString(d);
		System.out.println("Binary"+ n +" in Hexa is "+ o);
	}
}


/*import java.io.*;
import java.lang.*;
class octal
{
	public static void main (String args[]) throws Exception
	{
		String n=null;
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Enter binary number :");
		n=br.readLine();
		
		int d=Integer.parseInt(n,2);
		String o=Integer.toOctalString(d);
		System.out.println("Binary"+ n +" in Octal is "+ o);
	}
}*/