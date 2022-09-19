import java.io.*;
import java.util.Vector;
class sak2
{
public static void main(String args[])throws IOException
{
Vector v=new Vector();
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.println("before add size:"+v.size());
System.out.println("before add capacity:"+v.capacity());
System.out.println("how many num u want to enter");
int num=Integer.parseInt(br.readLine());
for(int i=0;i<=num;i++)
{
System.out.println("enter integer no");
int no=Integer.parseInt(br.readLine());
v.addElement(new Integer(no));
}
v.addElement(new Float(2.5));
v.addElement("sakshi");
v.addElement('s');
System.out.println("after add size="+v.size());
System.out.println("after add capacity="+v.capacity());
for(int in=0;in<=v.size();in++)
System.out.println(v.get(in));
}
catch(Exception e){}
System.out.println("enter no. u want to delete");
int index=Integer.parseInt(br.readLine());
v.removeElement(index);
System.out.println("after remove elements size="+v.size());
for(int in=0;in<=v.size();in++)
System.out.println(v.get(in));
System.out.println("enter no. u want to insert");
int index1=Integer.parseInt(br.readLine());
System.out.println("enter the position where no. is insert");
int n=Integer.parseInt(br.readLine());
v.insertElementAt(index1,n);
System.out.println("after insert elements size="+v.size());
v.set(1,"596");
for(int in=0;in<=v.size();in++)
System.out.println(v.get(in));
v.removeAllElements();
System.out.println("after remove elements size="+v.size());
System.out.println("after remove elements capacity="+v.capacity());
}
}




