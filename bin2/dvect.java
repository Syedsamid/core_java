import java.io.*;
import java.lang.*;
import java.util.*;
class dvect
{
	public static void main(String a[])
	{
		Vector v=new Vector();
		System.out.println("Initial size before adding is :");
		System.out.println(v.size());
		System.out.println("Initial capacity before adding is :");
		System.out.println(v.capacity());
		v.addElement(new Integer(1));
		v.addElement(new Character('d'));
		v.addElement(new String("Deepika"));
		System.out.println("Initial size after adding is :"+v.size());
		System.out.println("Initial capacity after adding is :"+v.capacity());
	}
}