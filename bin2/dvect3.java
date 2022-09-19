import java.io.*;
import java.lang.*;
import java.util.*;
class dvect3
{
	public static void main(String ar[])
	{
		Vector v=new Vector();
		int length=ar.length;
		for(int i=0;i<length;i++)
		{
			v.addElement(ar[i]);
			
		}
		System.out.println("vector numbers are : ");
		Enumeration Enum=v.elements();
		while(Enum.hasMoreElements())
		{
			System.out.println(Enum.nextElement());
		}
	}
}