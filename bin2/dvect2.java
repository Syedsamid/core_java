import java.io.*;
import java.lang.*;
import java.util.*;
class dvect2
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		for(int i=0;i<args.length;i++)
		{
			v.addElement(args[i]);
		}
		System.out.println(v);
	}
}