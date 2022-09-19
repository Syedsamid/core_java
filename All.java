/*import java.io.*;
import java.lang.*;
import java.util.Scanner;
class All
{
	public static void main(String ar[])
	{
		int n,a,rev=0,d,i;
		Scanner sc=new Scanner(System.in);
		for(i=1;i<=3;i++)
		{
				System.out.print("\n-----------------------------------");
		System.out.print("\n\tEnter Num:");
		n=sc.nextInt();
		d=n;
		while(n>0)
		{
			 a=n%10;
			 rev=rev*10+a;
			 n=n/10;
		}
		System.out.print("\n\tSr_No\tOriginal val\tReverse val=");
		System.out.print("\n-----------------------------------");
		System.out.print("\n\t1\t"+d+"\t\t"+rev);
		}
	}
}*/







///Scanner
/*import java.io.*;
import java.lang.*;
import java.util.Scanner;
class All
{
	public static void main(String ar[])throws IOException
	{
		int n[],a[],rev[]={0},d[],i;
		n=new int[10];
		a=new int[10];
		rev=new int[10];
		d=new int[10];	
		
		Scanner sc=new Scanner(System.in);
		for(i=1;i<=3;i++)
		{
		System.out.print("\n-----------------------------------");
		System.out.print("\n\tEnter Num:");
    	n[i]=sc.nextInt();
		d[i]=n[i];
		while(n[i]>0)
		{
			 a[i]=n[i]%10;
			 rev[i]=rev[i]*10+a[i];
			 n[i]=n[i]/10;
		}
		}
		System.out.print("\n\tSr_No\tOriginal val\tReverse val=");
		System.out.print("\n-----------------------------------");
		for(i=1;i<=3;i++)
		{
		System.out.print("\n\t"+i+"\t"+d[i]+"\t\t"+rev[i]);
		}
	}
}*/



//Buffered reader
/*import java.io.*;
import java.lang.*;
class All
{
	public static void main(String ar[])throws IOException
	{
		int n[],a[],rev[]={0},d[],i;
		n=new int[10];
		a=new int[10];
		rev=new int[10];
		d=new int[10];	
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		
		for(i=1;i<=3;i++)
		{
		System.out.print("\n-----------------------------------");
		System.out.print("\n\tEnter Num:");
	//	n[i]=sc.nextInt();

        n[i]=Integer.parseInt(ob.readLine());
		d[i]=n[i];
		while(n[i]>0)
		{
			 a[i]=n[i]%10;
			 rev[i]=rev[i]*10+a[i];
			 n[i]=n[i]/10;
		}
		}
		System.out.print("\n\tSr_No\tOriginal val\tReverse val=");
		System.out.print("\n-----------------------------------");
		for(i=1;i<=3;i++)
		{
		System.out.print("\n\t"+i+"\t"+d[i]+"\t\t"+rev[i]);
		}
	}
}
*/




//data input stream
import java.io.*;
import java.lang.*;
class All
{
	public static void main(String ar[])throws IOException
	{
		int n[],a[],rev[]={0},d[],i;
		n=new int[10];
		a=new int[10];
		rev=new int[10];
		d=new int[10];	
		DataInputStream ob=new DataInputStream(System.in);
		
		for(i=1;i<=3;i++)
		{
		System.out.print("\n-----------------------------------");
		System.out.print("\n\tEnter Num:");

        n[i]=Integer.parseInt(ob.readLine());
		d[i]=n[i];
		while(n[i]>0)
		{
			 a[i]=n[i]%10;
			 rev[i]=rev[i]*10+a[i];
			 n[i]=n[i]/10;
		}
		}
		System.out.print("\n\tSr_No\tOriginal val\tReverse val=");
		System.out.print("\n-----------------------------------");
		for(i=1;i<=3;i++)
		{
		System.out.print("\n\t"+i+"\t"+d[i]+"\t\t"+rev[i]);
		}
	}
	