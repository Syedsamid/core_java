import java.io.*;
import java.lang.*;

class wapper1
{
	int prin;
	int rate,interest;
	int no;
	wapper1()
	{
		BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
		try
		{
			System.out.println("Enter principle amount=");
			prin=Integer.parseInt(in.readLine());
			System.out.println("Enter rate of interest=");
			interest=Integer.parseInt(in.readLine());
			System.out.println("Enter no.of years=");
			no=Integer.parseInt(in.readLine());
		}catch(Exception e){}
	}
	void disp()
	{
		interest=(prin*rate*no)/100;
		String s=Float.toString(interest);
		System.out.println("The Simple Interest is ="+s);
	}
}
class dw1
{
	public static void main(String args[])
	{
		wapper1 ob=new wapper1();
		ob.disp();
	}
}
