import java.util.*;
import java.io.*;
import java.lang.*;
class dvect1
{
	public static void main(String ar[])
	{
		Vector v=new Vector(5,3);
		System.out.println("Before adding Size : "+v.size());
		System.out.println("Before adding capacity : "+v.capacity());
		for(int i=0;i<6;i++)
		{
			v.addElement(new Float(2.5));
			v.addElement(new String("deep"));
			v.addElement(new Character('d'));
		}
		System.out.println("after adding capacity : "+v.capacity());
		System.out.println("after adding Size : "+v.size());
	}
}