import java.io.*;
import java.lang.*;
class d40_2
{
	int r;
	String nm;
	void in()
	{
		try
		{
			BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("\n\t Enter Roll num:");
			r=Integer.parseInt(ob.readLine());
			System.out.print("\n\tEnter Name:");
			nm=(ob.readLine());
		}catch(IOException r){}
	}
	void out()
	{
		System.out.print("\n\t\tStud-INFO");
		System.out.print("\n\t_____________________________________________");
		System.out.print("\n\tSr_no\tRoll_No\tName");
		System.out.print("\n\t_____________________________________________");
		System.out.print("\n\t 1 \t" +r +"\t"+nmq								111111111		);
	}
	public static void main(String args[])
	{
		d40_2 ob=new d40_2();
		ob.in();
		ob.out();
	}
}
