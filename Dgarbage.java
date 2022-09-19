import java.io.*;
import java.lang.*;
class Dgarbage
{
	public static void main(String[] args) throws InterruptedException
	{
		Dgarbage t1 = new Dgarbage(); 
		Dgarbage t2 = new Dgarbage();
		
		t1 = null;
		System.gc();
		
		t2 = null;
		Runtime.getRuntime().gc();
	}

    protected void finalize() throws Throwable
     {
	   System.out.println("garbage collector called");
	   System.out.println("Object garbage collector:" + this);      
	 }
}
	